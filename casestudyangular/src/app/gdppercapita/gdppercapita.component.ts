import { Component } from '@angular/core';
import { GdpPerCapitaService } from '../services/gdppercapita.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-gdppercapita',
  standalone: true,
  imports: [],
  templateUrl: './gdppercapita.component.html',
  styleUrl: './gdppercapita.component.css',
})
export class GdppercapitaComponent {
  gdpPerCapita: any[] = [];

  constructor(
    private gdpPerCapitaService: GdpPerCapitaService,
    private router: Router
  ) {}

  ngOnInit(): void {
    this.getCountries();
  }

  getCountries() {
    this.gdpPerCapita = [];
    this.gdpPerCapitaService.getMaxGdpPerCapita().subscribe({
      next: (res) => {
        res.forEach((maxGdp: any) => {
          this.gdpPerCapita.push(maxGdp);
          console.log(this.gdpPerCapita);
          
        });
      },
    });
  }
}
