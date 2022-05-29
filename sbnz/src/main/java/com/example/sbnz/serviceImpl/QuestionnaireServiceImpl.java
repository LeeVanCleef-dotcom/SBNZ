package com.example.sbnz.serviceImpl;

import com.example.sbnz.dto.QuestionnaireDTO;
import com.example.sbnz.service.QuestionnaireService;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionnaireServiceImpl implements QuestionnaireService {

	@Autowired
	private KieContainer kieContainer;

	@Override
	public void submitQuestionnaire(QuestionnaireDTO questionnaire) {
		KieSession kieSession = kieContainer.newKieSession("questionnaire");
		kieSession.insert(questionnaire);
		System.out.println(kieSession.fireAllRules());
	}

}
