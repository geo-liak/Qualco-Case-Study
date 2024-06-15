import { Routes } from '@angular/router';

export const routes: Routes = [
    {
        path: "projects", 
        loadComponent: () => {
            return import('./projects/projects.component')
            .then((file) => {return file.ProjectsComponent})
        }
    },
    {
        path: "about", 
        loadComponent: () => {
            return import('./about/about.component')
            .then((file) => {return file.AboutComponent})
        }
    },
    {
        path: "menu", 
        loadComponent: () => {
            return import('./menu/menu.component')
            .then((file) => {return file.MenuComponent})
        }
    },
    {
        path: "countries", 
        loadComponent: () => {
            return import('./countries/countries.component')
            .then((file) => {return file.CountriesComponent})
        }
    },
    {
        path: "languages/:countryId", 
        loadComponent: () => {
            return import('./languages/languages.component')
            .then((file) => {return file.LanguagesComponent})
        }
    },
    {
        path: "statistics", 
        loadComponent: () => {
            return import('./statistics/statistics.component')
            .then((file) => {return file.StatisticsComponent})
        }
    },
    {path: "**", redirectTo: "menu"}
];
