package com.example.sbnz.service;

import java.util.List;

import com.example.sbnz.dto.ChampionDTO;
import com.example.sbnz.dto.QuestionnaireDTO;

public interface QuestionnaireService {
	
	public List<ChampionDTO> submitQuestionnaire(QuestionnaireDTO questionnaire);

}
