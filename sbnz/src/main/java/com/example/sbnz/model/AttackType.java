package com.example.sbnz.model;

public enum AttackType {
	MEELE("Meele"),
	RANGED("Ranged"),
	HYBRID("Hybrid");
	
	String attackType;
	
	private AttackType(String attackType) { this.attackType = attackType; }
	
	@Override
	public String toString() {
		return this.attackType;
	}
	
	public static AttackType fromString(String text) {
        for (AttackType at : AttackType.values()) {
            if (at.toString().equalsIgnoreCase(text)) {
                return at;
            }
        }
        return null;
	}
}
