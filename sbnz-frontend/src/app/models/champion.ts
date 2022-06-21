import { AttackType, ChampionClass, DamageType, Difficulty } from "./union-types";

export interface Champion {
  classes: ChampionClass[];
  name: string;
  score: number;
  style: number;
  attackType: AttackType;
  damageType: DamageType;
  difficulty: Difficulty;
}
