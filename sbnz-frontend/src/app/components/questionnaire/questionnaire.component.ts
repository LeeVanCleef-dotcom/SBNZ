import { Component, OnInit } from "@angular/core";
import { Champion } from "src/app/models/champion";
import { Questionnaire } from "src/app/models/questionnaire";
import {
  AttackType,
  ChampionClass,
  DamageType,
  Difficulty,
} from "src/app/models/union-types";
import { ChampionsService } from "src/app/services/champions.service";
import { QuestionnaireService } from "src/app/services/questionnaire.service";

@Component({
  selector: "app-questionnaire",
  templateUrl: "./questionnaire.component.html",
  styleUrls: ["./questionnaire.component.css"],
})
export class QuestionnaireComponent implements OnInit {
  questionnaire: Questionnaire = {
    bannedChampions: [],
    pickedChampions: [],
    damageType: null,
    attackType: null,
    difficulty: null,
    style: 0,
    championClasses: [],
  };

  sortedSuggestions: Champion[];
  championsList: Champion[];

  constructor(private questionnaireService: QuestionnaireService, private championsService: ChampionsService) {}

  ngOnInit(): void {
    this.getChampions();
  }

  getChampions(): void {
    this.championsService.getAllChampions().subscribe(
      (data) => {
        this.championsList = data;
      },
      (error) => {
        console.log(error);
      }
    );
  }

  onChampionRemoved(champName: string): void {
    if (this.generateRandom() % 2 == 0) {
      this.questionnaire.bannedChampions.push(champName);
    } else {
      this.questionnaire.pickedChampions.push(champName);
    }
  }

  onChampionClassClicked(champClass: string): void {
    for (let i = 0; i < this.questionnaire.championClasses.length; ++i) {
      if (this.questionnaire.championClasses[i] === champClass) {
        this.questionnaire.championClasses.splice(i, 1);
        return;
      }
    }

    this.questionnaire.championClasses.push(champClass as ChampionClass);
  }

  onAttackTypeSelected(attackType: string) {
    this.questionnaire.attackType = attackType as AttackType;
  }

  onDamageTypeSelected(damageType: string) {
    this.questionnaire.damageType = damageType as DamageType;
  }

  onDifficultySelected(difficulty: string) {
    this.questionnaire.difficulty = difficulty as Difficulty;

    this.submitQuestionnaire();
  }

  submitQuestionnaire(): void {
    this.questionnaireService.submitQuestionnaire(this.questionnaire).subscribe(
      (data) => {
        this.sortedSuggestions = data;
        console.log(this.sortedSuggestions);
      },
      (err) => {
        console.log(err);
      }
    );
  }

  fillUrlTemplate(champ: Champion) {
    let championImageUrlTemplate: string =
      "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/${this.name}_0.jpg";

    let name = champ.name;
    champ = Object.create(champ);
    champ.name = name;

    if (champ.name.includes(" ")) {
      name = name.replace(" ", "");
      champ.name = name;
    }
    if (champ.name.includes(".")) {
      name = name.replace(".", "");
      champ.name = name;
    }

    // special names
    let specialNames = {
      KhaZix: true,
      KaiSa: true,
      LeBlanc: true,
      ChoGath: true,
      VelKoz: true,
    };

    if (champ.name in specialNames) {
      name = name.toLowerCase();
      name = name.charAt(0).toUpperCase() + name.slice(1);
      champ.name = name;
    }

    // special cases (site inconsistencies)
    if (champ.name === "RenataGlasc") {
      champ.name = "Renata";
    } else if (champ.name === "Wukong") {
      champ.name = "MonkeyKing";
    } else if (champ.name.includes("&")) {
      champ.name = name.split("&")[0];
    }

    return new Function("return `" + championImageUrlTemplate + "`;").call(
      champ
    );
  }

  private generateRandom(min: number = 1, max: number = 10): number {
    let difference = max - min;
    let rand = Math.random();

    rand = Math.floor(rand * difference);
    rand += min;

    return rand;
  }
}
