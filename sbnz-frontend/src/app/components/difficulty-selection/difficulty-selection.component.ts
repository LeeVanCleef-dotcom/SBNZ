import { Component, EventEmitter, OnInit, Output } from '@angular/core';

@Component({
  selector: 'app-difficulty-selection',
  templateUrl: './difficulty-selection.component.html',
  styleUrls: ['./difficulty-selection.component.css']
})
export class DifficultySelectionComponent implements OnInit {
  @Output() changed = new EventEmitter<string>();

  selected: boolean = false;

  constructor() { }

  ngOnInit(): void {
  }

  onChange(event): void {
    this.selected = true;
    this.changed.emit(event.explicitOriginalTarget.value);
  }

}
