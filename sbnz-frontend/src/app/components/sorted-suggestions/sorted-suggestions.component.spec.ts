import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SortedSuggestionsComponent } from './sorted-suggestions.component';

describe('SortedSuggestionsComponent', () => {
  let component: SortedSuggestionsComponent;
  let fixture: ComponentFixture<SortedSuggestionsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SortedSuggestionsComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(SortedSuggestionsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
