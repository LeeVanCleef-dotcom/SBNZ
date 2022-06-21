package com.example.sbnz.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.example.sbnz.dto.ChampionDTO;
import com.example.sbnz.dto.QuestionnaireDTO;
import com.example.sbnz.service.ChampionService;
import com.example.sbnz.service.QuestionnaireService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/questionnaire")
public class QuestionnaireController {
	
	@Autowired
	private ChampionService championService;
	
	@Autowired
	private QuestionnaireService questionnaireService;
	
	@CrossOrigin(origins = "*")
	@PostMapping(value = "/submit", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<ChampionDTO>> submitQuestionnaire(@RequestBody QuestionnaireDTO questionnaire) {
		return new ResponseEntity<>(questionnaireService.submitQuestionnaire(questionnaire), HttpStatus.OK);
	}

}
