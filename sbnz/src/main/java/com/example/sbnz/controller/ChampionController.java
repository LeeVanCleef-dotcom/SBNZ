package com.example.sbnz.controller;

import java.util.List;

import com.example.sbnz.dto.ChampionDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sbnz.service.ChampionService;

@RestController
@RequestMapping("/champions")
public class ChampionController {

	@Autowired
	private ChampionService championService;

	@CrossOrigin(origins = "*")
	@GetMapping(value = "/getAll", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<ChampionDTO>> getChampions(){
		return new ResponseEntity<>(championService.getAllChampions(), HttpStatus.OK);
	}
	
}

