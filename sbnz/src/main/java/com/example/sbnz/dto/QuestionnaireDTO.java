package com.example.sbnz.dto;

import java.util.List;

public class QuestionnaireDTO {

	private List<String> bannedChampions;
	
	private List<String> pickedChampions;
	
	private ChampionDTO championToCounter;
	
	private List<String> championClasses;
	
	private int style;
	
	private String attackType;
	
	private String damageType;
	
	private String difficulty;

	public QuestionnaireDTO(List<String> bannedChampions, List<String> pickedChampions,
			ChampionDTO championToCounter, List<String> championClasses, int style, String attackType,
			String damageType, String difficulty) {
		super();
		this.bannedChampions = bannedChampions;
		this.pickedChampions = pickedChampions;
		this.championToCounter = championToCounter;
		this.championClasses = championClasses;
		this.style = style;
		this.attackType = attackType;
		this.damageType = damageType;
		this.difficulty = difficulty;
	}

	public List<String> getBannedChampions() {
		return bannedChampions;
	}

	public void setBannedChampions(List<String> bannedChampions) {
		this.bannedChampions = bannedChampions;
	}

	public List<String> getPickedChampions() {
		return pickedChampions;
	}

	public void setPickedChampions(List<String> pickedChampions) {
		this.pickedChampions = pickedChampions;
	}

	public ChampionDTO getChampionToCounter() {
		return championToCounter;
	}

	public void setChampionToCounter(ChampionDTO championToCounter) {
		this.championToCounter = championToCounter;
	}

	public List<String> getChampionClasses() {
		return championClasses;
	}

	public void setChampionClasses(List<String> championClasses) {
		this.championClasses = championClasses;
	}

	public int getStyle() {
		return style;
	}

	public void setStyle(int style) {
		this.style = style;
	}

	public String getAttackType() {
		return attackType;
	}

	public void setAttackType(String attackType) {
		this.attackType = attackType;
	}

	public String getDamageType() {
		return damageType;
	}

	public void setDamageType(String damageType) {
		this.damageType = damageType;
	}

	public String getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(String difficulty) {
		this.difficulty = difficulty;
	}
	
}
