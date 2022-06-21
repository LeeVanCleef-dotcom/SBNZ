import { Component, Input, OnInit } from '@angular/core';
import { Champion } from 'src/app/models/champion';

@Component({
  selector: 'app-sorted-suggestions',
  templateUrl: './sorted-suggestions.component.html',
  styleUrls: ['./sorted-suggestions.component.css']
})
export class SortedSuggestionsComponent implements OnInit {
  @Input() championsList: Champion[] = [];
  @Input() fillUrlTemplate: Function;

  constructor() { }

  ngOnInit(): void {
  }

}
