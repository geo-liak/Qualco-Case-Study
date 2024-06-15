import { Component } from '@angular/core';
import { LanguagesService } from '../services/languages.service';
import { ActivatedRoute } from '@angular/router';

interface Country {
  area: string;​
  countryCode: string;
  countryId: string;
  ​name: string;
}

@Component({
  selector: 'app-languages',
  standalone: true,
  imports: [],
  templateUrl: './languages.component.html',
  styleUrl: './languages.component.css',
})
export class LanguagesComponent {
  
  countryId: string | null = "";
  languages: any[] = [];
  country: string = "";

  constructor(
    private languageService: LanguagesService,
    private route: ActivatedRoute
) {}

  ngOnInit() {
    this.route.paramMap.subscribe(params => {
      this.countryId = params.get("countryId");
      if (this.countryId) {
        this.getLanguages(this.countryId);
        this.getCountry(this.countryId);
      };
    })
  }

  getLanguages(countryId: string) {
    this.languages = [];
    this.languageService.getLanguages(countryId).subscribe({
      next: (res: any[]) => {
        res.forEach((language: any) => {
          this.languages.push(language);
        });
      },
    });
  }

  getCountry(countryId: string) {
    this.country = "";
    this.languageService.getCountry(countryId).subscribe({
      next: (res: Country) => {
        this.country = res.name;
        console.log(this.country);
      }

    })
  }
}
