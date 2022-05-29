package com.example.sbnz.service;

import java.util.List;
import com.example.sbnz.dto.ChampionDTO;
import com.example.sbnz.dto.QuestionnaireDTO;
import com.example.sbnz.model.Champion;


public interface ChampionService {

	public List<ChampionDTO> getAllChampions();

	public Champion getOne(int id);
	
	public List<ChampionDTO> filterChampions(QuestionnaireDTO questionnaire);

}
