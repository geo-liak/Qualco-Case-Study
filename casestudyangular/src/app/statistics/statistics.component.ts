import { Component } from '@angular/core';
import { model, ModelSignal } from '@angular/core';
import { StatisticssService } from '../services/statistics.service';
import { FormsModule } from '@angular/forms';

interface CountryStatistics {
  continent: string;
  country: string;
  gdp: string;
  population: string;
  region: string;
  year: number;
}

@Component({
  selector: 'app-statistics',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './statistics.component.html',
  styleUrl: './statistics.component.css',
  template: `{{ yearFrom }}, {{ selectedRegion }}, {{ yearTo }}`,
})
export class StatisticsComponent {
  countryStatistics: CountryStatistics[] = [];

  filteredStatistics: CountryStatistics[] = [];
  regions: string[] = [];
  maxYear: number = 0;
  minYear: number = 0;
  selectedRegion: string = 'All';
  dateFrom: number | null = null;
  dateTo: number | null = null;
  dataLoaded: boolean = false;

  constructor(private statisticsService: StatisticssService) {}

  ngOnInit() {
    this.getCountryStatistics();
  }

  generateRegions(): void {
    const regionSet = new Set(
      this.countryStatistics.map((stat) => stat.region)
    );
    this.regions = Array.from(regionSet);
  }

  detectYears(): void {
    const yearsSet = new Set(this.countryStatistics.map((stat) => stat.year));

    if (yearsSet.size > 0) {
      this.maxYear = Math.max(...yearsSet);
      this.minYear = Math.min(...yearsSet);
    }
  }

  getCountryStatistics() {
    this.countryStatistics = [];
    this.statisticsService.getCountryStatistics().subscribe({
      next: (res: CountryStatistics[]) => {
        res.forEach((stat: CountryStatistics) => {
          this.countryStatistics.push(stat);
        });
        this.filteredStatistics = this.countryStatistics;
        this.generateRegions();
        this.detectYears();
        this.dataLoaded = true;
      },
    });
  }

  handleClick(): void {
    this.applyFilters();
  }

  handleClear(): void {
    this.selectedRegion = 'All';
    this.dateFrom = null;
    this.dateTo = null;
    this.applyFilters();
  }


  applyFilters(): void {
    let tempFilteredStatistics: CountryStatistics[] = [];

    tempFilteredStatistics = this.countryStatistics.filter((stat) => {
      return (
        !this.selectedRegion ||
        this.selectedRegion === 'All' ||
        this.selectedRegion === stat.region
      );
    });

    tempFilteredStatistics = tempFilteredStatistics.filter((stat) => {
      if (this.dateFrom && !this.dateTo) {
        return stat.year >= this.dateFrom;
      } else if (!this.dateFrom && this.dateTo) {
        return stat.year <= this.dateTo;
      } else if (this.dateFrom && this.dateTo) {
        return stat.year >= this.dateFrom && stat.year <= this.dateTo;
      } else {
        return true;
      }
    });
    console.log("Entries: " + tempFilteredStatistics.length);
    this.filteredStatistics = tempFilteredStatistics;
  }
}
