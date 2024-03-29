package com.example.sbnz.model;

public enum Difficulty {
	I("I"),
	II("II"),
	III("III");
	
	String difficulty;
	
	private Difficulty(String difficulty) { this.difficulty = difficulty; }
	
	@Override
	public String toString() {
		return this.difficulty;
	}
	
	public static Difficulty fromString(String text) {
        for (Difficulty d : Difficulty.values()) {
            if (d.toString().equalsIgnoreCase(text)) {
                return d;
            }
        }
        return null;
	}
	
	public int getValue() {
		int val = 0;

		switch (this.difficulty) {
			case "I":
				val = 1;
				break;
			case "II":
				val = 2;
				break;
			case "III":
				val = 3;
				break;
		}
		
		return val;
	}
}
