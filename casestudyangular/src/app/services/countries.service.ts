import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";

@Injectable({ providedIn: "root"})
export class CountriesService {
    url: string = "http://localhost:8080/api/countries" 
    constructor(
        private http: HttpClient
    ){}

    getCountries() {
        return this.http.get<any>(this.url);
    }
}