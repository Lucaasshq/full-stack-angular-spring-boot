import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LancamentosGridComponent } from './lancamentos-grid.component';

describe('LancamentosGridComponent', () => {
  let component: LancamentosGridComponent;
  let fixture: ComponentFixture<LancamentosGridComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [LancamentosGridComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(LancamentosGridComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
