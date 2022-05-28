package com.example.sbnz.dto;

import java.util.ArrayList;
import java.util.List;

import com.example.sbnz.model.*;


public class ChampionDTO {

	private List<ChampionClass> classes;
	
	private String name;
	
	private int style;
	
	private AttackType attackType;
	
	private DamageType damageType;
	
	private Difficulty difficulty;
	
	private List<ChampionDTO> counters;
	
	public ChampionDTO(Champion champion) {
		this.classes = champion.getClasses();
		this.name = champion.getName();
		this.style = champion.getStyle();
		this.attackType = champion.getAttackType();
		this.damageType = champion.getDamageType();
		this.difficulty = champion.getDifficulty();

		this.counters = new ArrayList<ChampionDTO>();
		for(Champion c : champion.getCounters()) {
			this.counters.add(new ChampionDTO(c));
		}
	}

	public List<ChampionClass> getClasses() {
		return classes;
	}

	public void setClasses(List<ChampionClass> classes) {
		this.classes = classes;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStyle() {
		return style;
	}

	public void setStyle(int style) {
		this.style = style;
	}

	public AttackType getAttackType() {
		return attackType;
	}

	public void setAttackType(AttackType attackType) {
		this.attackType = attackType;
	}

	public DamageType getDamageType() {
		return damageType;
	}

	public void setDamageType(DamageType damageType) {
		this.damageType = damageType;
	}

	public Difficulty getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(Difficulty difficulty) {
		this.difficulty = difficulty;
	}

	public List<ChampionDTO> getCounters() {
		return counters;
	}

	public void setCounters(List<ChampionDTO> counters) {
		this.counters = counters;
	}
	
}
