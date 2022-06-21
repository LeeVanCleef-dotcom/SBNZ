import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { Observable } from "rxjs";
import { SUBMIT_QUESTIONNAIRE } from "../api-routes";
import { Champion } from "../models/champion";
import { Questionnaire } from "../models/questionnaire";

@Injectable({
  providedIn: "root",
})
export class QuestionnaireService {
  constructor(private http: HttpClient) {}

  submitQuestionnaire(questionnaire: Questionnaire): Observable<Champion[]> {
    return this.http.post<Champion[]>(SUBMIT_QUESTIONNAIRE, questionnaire);
  }
}
