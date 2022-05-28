package com.example.sbnz.model;

public enum DamageType {
	PHYSICAL("Physical"),
	MAGIC("Magic"),
	MIXED("Mixed");
	
	String damageType;
	
	private DamageType(String damageType) { this.damageType = damageType; }
	
	@Override
	public String toString() {
		return this.damageType;
	}
	
	public static DamageType fromString(String text) {
        for (DamageType dt : DamageType.values()) {
            if (dt.toString().equalsIgnoreCase(text)) {
                return dt;
            }
        }
        return null;
	}
}
