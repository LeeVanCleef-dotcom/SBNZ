package com.example.sbnz.serviceImpl;

import java.util.List;

import com.example.sbnz.dto.ChampionDTO;
import com.example.sbnz.dto.QuestionnaireDTO;
import com.example.sbnz.service.ChampionService;
import com.example.sbnz.service.QuestionnaireService;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionnaireServiceImpl implements QuestionnaireService {

	@Autowired
	private KieContainer kieContainer;
	
	@Autowired
	private ChampionService championService;

	@Override
	public List<ChampionDTO> submitQuestionnaire(QuestionnaireDTO questionnaire) {
		return championService.filterChampions(questionnaire);
	}

}
