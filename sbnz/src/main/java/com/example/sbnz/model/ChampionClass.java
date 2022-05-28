package com.example.sbnz.model;

public enum ChampionClass {

	ASSASSIN("Assassin"),
	FIGHTER("Fighter"),
	MAGE("Mage"),
	MARKSMAN("Marksman"),
	SUPPORT("Support"),
	TANK("Tank");
	
	String championClass;
	
	private ChampionClass(String championClass) { this.championClass = championClass; }
	
	@Override
	public String toString() {
		return this.championClass;
	}
	
	public static ChampionClass fromString(String text) {
        for (ChampionClass cc : ChampionClass.values()) {
            if (cc.toString().equalsIgnoreCase(text)) {
                return cc;
            }
        }
        return null;
	}

}
