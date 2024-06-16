import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";

@Injectable({ providedIn: "root"})
export class GdpPerCapitaService {
    url: string = "http://localhost:8080/api/maxGdpPerCapita" 
    constructor(
        private http: HttpClient
    ){}

    getMaxGdpPerCapita() {
        return this.http.get<any>(this.url);
    }
}