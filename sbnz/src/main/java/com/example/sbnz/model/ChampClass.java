package com.example.sbnz.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ChampClass {

//	ASSASSIN("Assassin"),
//	FIGHTER("Fighter"),
//	MAGE("Mage"),
//	MARKSMAN("Marksman"),
//	SUPPORT("Support"),
//	TANK("Tank");
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(nullable = false)
	String champClass;
	
	public ChampClass(String championClass) {
		this.champClass = championClass;
	}
	
	public ChampClass() {}

	public String getChampClass() {
		return champClass;
	}

	public void setChampClass(String championClass) {
		this.champClass = championClass;
	}
	
	
//	private ChampionClass(String championClass) { this.championClass = championClass; }
//	
//	@Override
//	public String toString() {
//		return this.championClass;
//	}
//	
//	public static ChampionClass fromString(String text) {
//        for (ChampionClass cc : ChampionClass.values()) {
//            if (cc.toString().equalsIgnoreCase(text)) {
//                return cc;
//            }
//        }
//        return null;
//	}

}
