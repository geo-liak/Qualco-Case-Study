import { Component, OnInit } from '@angular/core';
import { CountriesService } from '../services/countries.service';
import { LanguagesService } from '../services/languages.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-countries',
  standalone: true,
  imports: [],
  templateUrl: './countries.component.html',
  styleUrl: './countries.component.css'
})
export class CountriesComponent implements OnInit {
  countries:any[] = [];

  constructor(
    private countriesService: CountriesService,
    private router: Router
  ){}

  ngOnInit(): void {
      this.getCountries();
  }

  getCountries() {
    this.countries = [];
    this.countriesService.getCountries().subscribe({
      next: (res) => { 
        res.forEach((country: any) => {
          this.countries.push(country);
        })
      }
    })
  }

  goToRoute(route:string, countryId:string) {
    this.router.navigate([route, countryId])
  }
}

