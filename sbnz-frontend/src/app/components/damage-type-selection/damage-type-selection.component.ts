import { Component, EventEmitter, OnInit, Output } from "@angular/core";

@Component({
  selector: "app-damage-type-selection",
  templateUrl: "./damage-type-selection.component.html",
  styleUrls: ["./damage-type-selection.component.css"],
})
export class DamageTypeSelectionComponent implements OnInit {
  @Output() changed = new EventEmitter<string>();

  selected: boolean = false;

  constructor() {}

  ngOnInit(): void {}

  onChange(event): void {
    this.selected = true;
    this.changed.emit(event.explicitOriginalTarget.value);
  }
}
