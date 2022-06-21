import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DamageTypeSelectionComponent } from './damage-type-selection.component';

describe('DamageTypeSelectionComponent', () => {
  let component: DamageTypeSelectionComponent;
  let fixture: ComponentFixture<DamageTypeSelectionComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DamageTypeSelectionComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(DamageTypeSelectionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
