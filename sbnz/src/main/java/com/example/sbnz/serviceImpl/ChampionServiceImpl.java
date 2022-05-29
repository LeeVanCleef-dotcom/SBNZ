package com.example.sbnz.serviceImpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import com.example.sbnz.service.ChampionService;
import com.example.sbnz.repository.ChampClassRepository;
import com.example.sbnz.repository.ChampionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import com.example.sbnz.model.*;
import com.example.sbnz.dto.*;

@Service
public class ChampionServiceImpl implements ChampionService {

	@Autowired
	private KieContainer kieContainer;

	@Autowired
	private ChampionRepository championRepository;
	
	@Autowired
	private ChampClassRepository champClassRepository;

	@Override
	public List<ChampionDTO> getAllChampions() {
		List<Champion> champs = championRepository.findAll();
		ArrayList<ChampionDTO> champsDTO = new ArrayList<>();
		
		for (Champion champ : champs) {
			champsDTO.add(new ChampionDTO(champ));
		}

		return champsDTO;
	}
	
	@Override
	public Champion getOne(int id) {
		Optional<Champion> champ = championRepository.findById(id);
		
		if (!champ.isPresent()) {
			throw new ResourceNotFoundException("Champion with ID of " + id + " does not exist.");
		}
		
		return champ.get();
	}

	@Override
	public List<ChampionDTO> filterChampions(QuestionnaireDTO questionnaire) {
		List<ChampionDTO> champions = getAllChampions();

		Iterator<ChampionDTO> it = champions.iterator();
		while (it.hasNext()) {
			ChampionDTO ch = it.next();
			for (String champName : questionnaire.getPickedChampions()) {
				if (champName.equals(ch.getName())) {
					it.remove();
				}
			}

			for (String champName : questionnaire.getBannedChampions()) {
				if (champName.equals(ch.getName())) {
					it.remove();
				}
			}
		}

		return champions;
	}

}
