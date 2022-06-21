import { Component, EventEmitter, OnInit, Output } from "@angular/core";

@Component({
  selector: "app-class-selection",
  templateUrl: "./class-selection.component.html",
  styleUrls: ["./class-selection.component.css"],
})
export class ClassSelectionComponent implements OnInit {
  @Output() clicked = new EventEmitter<string>();

  numberOfSelectedClasses: number = 0;

  static readonly MAX_NUMBER_OF_SELECTED_ITEMS: number = 2;

  constructor() {}

  ngOnInit(): void {}

  get maxNumberOfSelectedItems(): number {
    return ClassSelectionComponent.MAX_NUMBER_OF_SELECTED_ITEMS;
  }

  onClick(event) {
    this.clicked.emit(event.explicitOriginalTarget.value);
    let checkboxgroup = document
      .getElementById("checkboxgroup")
      .getElementsByTagName("input");
    this.numberOfSelectedClasses = 0;

    for (let i = 0; i < checkboxgroup.length; i++) {
      this.numberOfSelectedClasses += checkboxgroup[i].checked ? 1 : 0;
    }

    if (this.numberOfSelectedClasses > ClassSelectionComponent.MAX_NUMBER_OF_SELECTED_ITEMS) {
      event.preventDefault();
      alert(
        `You can select maximum of ${ClassSelectionComponent.MAX_NUMBER_OF_SELECTED_ITEMS} classes.`
      );
    }
  }
}
