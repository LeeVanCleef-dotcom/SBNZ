import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AttackTypeSelectionComponent } from './attack-type-selection.component';

describe('AttackTypeSelectionComponent', () => {
  let component: AttackTypeSelectionComponent;
  let fixture: ComponentFixture<AttackTypeSelectionComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AttackTypeSelectionComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AttackTypeSelectionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
