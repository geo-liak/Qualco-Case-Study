import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";

@Injectable({ providedIn: "root"})
export class StatisticssService {
    url: string = "http://localhost:8080/api/info";

    constructor(
        private http: HttpClient
    ){}

    getCountryStatistics() {
        return this.http.get<any>(this.url);
    }
}
