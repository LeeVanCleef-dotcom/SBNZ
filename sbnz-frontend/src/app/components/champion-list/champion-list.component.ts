import { Component, EventEmitter, Input, OnInit, Output } from "@angular/core";
import { Champion } from "src/app/models/champion";
import { ChampionsService } from "src/app/services/champions.service";

@Component({
  selector: "app-champion-list",
  templateUrl: "./champion-list.component.html",
  styleUrls: ["./champion-list.component.css"],
})
export class ChampionListComponent implements OnInit {
  @Input() championsList: Champion[] = [];
  @Input() fillUrlTemplate: Function;
  @Output() removed = new EventEmitter<string>();

  numberOfRemovedChampions: number = 0;
  static readonly MAX_NUMBER_OF_REMOVED_CHAMPIONS: number = 19;

  constructor(private championsService: ChampionsService) {}

  ngOnInit(): void {
  }

  removeChampion(champName: string): void {
    if (
      this.numberOfRemovedChampions >=
      ChampionListComponent.MAX_NUMBER_OF_REMOVED_CHAMPIONS
    ) {
      window.alert("You have already removed maximum number of champions");
      return;
    }

    let champIndex = -1;

    for (let i = 0; i < this.championsList.length; ++i) {
      if (this.championsList[i].name === champName) {
        champIndex = i;
        break;
      }
    }

    if (champIndex !== -1) {
      this.championsList.splice(champIndex, 1);
      ++this.numberOfRemovedChampions;
      this.removed.emit(champName);
    }
  }
}
