package com.example.sbnz.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import com.example.sbnz.service.ChampionService;
import com.example.sbnz.repository.ChampionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sbnz.model.*;
import com.example.sbnz.dto.*;

@Service
public class ChampionServiceImpl implements ChampionService {

	@Autowired
	private ChampionRepository championRepository;

	@Override
	public List<ChampionDTO> getAllChampions() {
		Champion champion = new Champion(new ArrayList(), "Fizz", 80, AttackType.MEELE, DamageType.MAGIC, Difficulty.III, new ArrayList());
		championRepository.save(champion);
		return null;
	}

}
