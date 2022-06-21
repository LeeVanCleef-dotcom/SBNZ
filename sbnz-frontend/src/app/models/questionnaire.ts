import { Champion } from "./champion";
import { AttackType, ChampionClass, DamageType, Difficulty } from "./union-types";

export interface Questionnaire {
  bannedChampions: string[];
  pickedChampions: string[];
  championClasses: ChampionClass[];
  style: number;
  attackType: AttackType;
  damageType: DamageType;
  difficulty: Difficulty;
}
