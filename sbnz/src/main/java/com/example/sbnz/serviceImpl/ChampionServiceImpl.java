package com.example.sbnz.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import com.example.sbnz.service.ChampionService;
import com.example.sbnz.repository.ChampClassRepository;
import com.example.sbnz.repository.ChampionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sbnz.model.*;
import com.example.sbnz.dto.*;

@Service
public class ChampionServiceImpl implements ChampionService {

	@Autowired
	private ChampionRepository championRepository;
	
	@Autowired
	private ChampClassRepository champClassRepository;

	@Override
	public List<ChampionDTO> getAllChampions() {
//		ArrayList<ChampClass> classes = new ArrayList<>();
//		classes.add(new ChampClass("Fighter"));
//		classes.add(new ChampClass("Mage"));
//
//		Champion champion1 = new Champion(null, "Alistar", 70, AttackType.MEELE, DamageType.MIXED, Difficulty.II, null);
//		championRepository.save(champion1);
//
//		ArrayList<Champion> counters = new ArrayList<>();
//		counters.add(champion1);
//
//		Champion champion2 = new Champion(classes, "Fizz", 80, AttackType.MEELE, DamageType.MAGIC, Difficulty.III, counters);
//		
//		championRepository.save(champion2);

		List<Champion> champs = championRepository.findAll();
		ArrayList<ChampionDTO> champsDTO = new ArrayList<>();
		
		for (Champion champ : champs) {
			champsDTO.add(new ChampionDTO(champ));
		}

		return champsDTO;
	}

}
