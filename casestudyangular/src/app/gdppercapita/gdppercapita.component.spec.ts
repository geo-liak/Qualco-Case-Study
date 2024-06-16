import { ComponentFixture, TestBed } from '@angular/core/testing';

import { GdppercapitaComponent } from './gdppercapita.component';

describe('GdppercapitaComponent', () => {
  let component: GdppercapitaComponent;
  let fixture: ComponentFixture<GdppercapitaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [GdppercapitaComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(GdppercapitaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
