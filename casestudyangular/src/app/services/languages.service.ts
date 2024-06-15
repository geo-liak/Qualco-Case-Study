import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";

@Injectable({ providedIn: "root"})
export class LanguagesService {
    url: string = "http://localhost:8080/api/countries/{countryId}/languages";
    urlCountry: string = "http://localhost:8080/api/country/{countryId}";

    constructor(
        private http: HttpClient
    ){}

    getLanguages(countryId: string) {
        return this.http.get<any>(this.url.replace("{countryId}", countryId));
    }

    getCountry(countryId: string) {
        return this.http.get<any>(this.urlCountry.replace("{countryId}", countryId));
    }
}