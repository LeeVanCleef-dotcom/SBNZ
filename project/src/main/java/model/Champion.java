package model;

import java.util.List;

public class Champion {

	enum Class {
		ASSASSIN,
		FIGHTER,
		MAGE,
		MARKSMAN,
		SUPPORT,
		TANK
	}
	
	enum AttackType {
		MEELE,
		RANGED,
		HYBRID
	}
	
	enum DamageType {
		PHYSICAL,
		MAGIC,
		MIXED
	}
	
	enum Difficulty {
		I,
		II,
		III
	}
	
	private List<Class> classes;
	
	private String name;
	
	private int style;
	
	private AttackType attackType;
	
	private DamageType damageType;
	
	private Difficulty difficulty;
	
	private List<Champion> counters;

	public Champion(List<Class> classes, String name, int style, AttackType attackType, DamageType damageType, Difficulty difficulty,
			List<Champion> counters) {
		super();
		this.classes = classes;
		this.name = name;
		this.style = style;
		this.attackType = attackType;
		this.damageType = damageType;
		this.difficulty = difficulty;
		this.counters = counters;
	}

	public List<Class> getClasses() {
		return classes;
	}

	public void setClasses(List<Class> classes) {
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

	public List<Champion> getCounters() {
		return counters;
	}

	public void setCounters(List<Champion> counters) {
		this.counters = counters;
	}

	@Override
	public String toString() {
		return "Champion [classes=" + classes + ", style=" + style + ", attackType=" + attackType + ", damageType="
				+ damageType + ", difficulty=" + difficulty + ", counters=" + counters + "]";
	} 
	
}
