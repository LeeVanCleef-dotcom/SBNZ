package com.example.sbnz.model;

import java.util.List;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Table(name = "champion")
public class Champion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(
			name = "champ_classes",
			joinColumns = @JoinColumn(name = "champion_id"),
			inverseJoinColumns = @JoinColumn(name = "champ_class_id")
			)
	private List<ChampClass> classes;
	
	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false)
	private int style;
	
	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private AttackType attackType;
	
	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private DamageType damageType;
	
	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private Difficulty difficulty;
	
	@Column
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(
			name = "champ_counters",
			joinColumns = @JoinColumn(name = "champion_id"),
			inverseJoinColumns = @JoinColumn(name = "champ_counters_id")
			)
	private List<Champion> counters;

	public Champion(List<ChampClass> classes, String name, int style, AttackType attackType, DamageType damageType, Difficulty difficulty,
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
	
	public Champion() {}

	public List<ChampClass> getClasses() {
		return classes;
	}

	public void setClasses(List<ChampClass> classes) {
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
