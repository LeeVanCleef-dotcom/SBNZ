import { Injectable } from "@angular/core";
import { HttpClient, HttpErrorResponse } from "@angular/common/http";
import { Observable } from "rxjs";
import { Champion } from "../models/champion";

import { GET_ALL_CHAMPIONS } from "../api-routes";

@Injectable({
  providedIn: "root",
})
export class ChampionsService {
  constructor(private http: HttpClient) {}

  getAllChampions(): Observable<Champion[]> {
    return this.http.get<Champion[]>(GET_ALL_CHAMPIONS);
  }
}
