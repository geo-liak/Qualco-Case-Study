import { Component } from '@angular/core';
import { StatisticssService } from '../services/statistics.service';

interface CountryStatistics {
  continent: string;
  country: string;
  gdp: string;
  population: string;
  region: string;
  year: string;
}

@Component({
  selector: 'app-statistics',
  standalone: true,
  imports: [],
  templateUrl: './statistics.component.html',
  styleUrl: './statistics.component.css',
})
export class StatisticsComponent {
  countryStatistics: CountryStatistics[] = [];
  constructor(private statisticsService: StatisticssService) {}

  ngOnInit() {
    this.getCountryStatistics();
  }

  getCountryStatistics() {
    this.countryStatistics = [];
    this.statisticsService.getCountryStatistics().subscribe({
      next: (res: CountryStatistics[]) => {
        res.forEach((stat: CountryStatistics) => {
          this.countryStatistics.push(stat);
        });
        console.log(this.countryStatistics);
      },
    });
  }
}
