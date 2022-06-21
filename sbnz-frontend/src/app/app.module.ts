import { NgModule } from "@angular/core";
import { BrowserModule } from "@angular/platform-browser";
import { HttpClient, HttpClientModule } from "@angular/common/http";

import { AppRoutingModule } from "./app-routing.module";
import { AppComponent } from "./app.component";
import { ChampionListComponent } from "./components/champion-list/champion-list.component";
import { QuestionnaireComponent } from './components/questionnaire/questionnaire.component';
import { ClassSelectionComponent } from './components/class-selection/class-selection.component';
import { AttackTypeSelectionComponent } from './components/attack-type-selection/attack-type-selection.component';
import { DamageTypeSelectionComponent } from './components/damage-type-selection/damage-type-selection.component';
import { DifficultySelectionComponent } from './components/difficulty-selection/difficulty-selection.component';
import { SortedSuggestionsComponent } from './components/sorted-suggestions/sorted-suggestions.component';

@NgModule({
  declarations: [AppComponent, ChampionListComponent, QuestionnaireComponent, ClassSelectionComponent, AttackTypeSelectionComponent, DamageTypeSelectionComponent, DifficultySelectionComponent, SortedSuggestionsComponent],
  imports: [BrowserModule, AppRoutingModule, HttpClientModule],
  providers: [],
  bootstrap: [AppComponent],
})
export class AppModule {}
