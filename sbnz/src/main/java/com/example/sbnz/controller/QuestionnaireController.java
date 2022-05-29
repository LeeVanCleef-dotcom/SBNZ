package com.example.sbnz.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sbnz.dto.QuestionnaireDTO;
import com.example.sbnz.service.ChampionService;
import com.example.sbnz.service.QuestionnaireService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/questionnaire")
public class QuestionnaireController {
	
	@Autowired
	private ChampionService championService;
	
	@Autowired
	private QuestionnaireService questionnaireService;
	
	@PostMapping(value = "/submit", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public String submitQuestionnaire(@RequestBody QuestionnaireDTO questionnaire) {
		System.out.println("usao");
		questionnaireService.submitQuestionnaire(questionnaire);
		
		return "ok";
	}

}
