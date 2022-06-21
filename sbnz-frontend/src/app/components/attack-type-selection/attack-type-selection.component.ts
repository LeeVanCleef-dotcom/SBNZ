import { Component, EventEmitter, OnInit, Output } from '@angular/core';

@Component({
  selector: 'app-attack-type-selection',
  templateUrl: './attack-type-selection.component.html',
  styleUrls: ['./attack-type-selection.component.css']
})
export class AttackTypeSelectionComponent implements OnInit {
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
