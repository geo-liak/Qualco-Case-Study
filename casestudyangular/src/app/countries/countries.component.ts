import { Component, OnInit } from '@angular/core';
import { CountriesService } from '../services/countries.service';

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
    private countriesService: CountriesService
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
        console.log(this.countries);
      }
    })
  }
}

