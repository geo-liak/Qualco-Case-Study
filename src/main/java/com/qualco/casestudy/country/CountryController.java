package com.qualco.casestudy.country;

import org.hibernate.tool.schema.internal.IndividuallySchemaMigratorImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CountryController {
	
	@Autowired
	private CountryService service;
	
	@GetMapping("/api/countries")
	public List<Country> getCountries() {
		return service.getCountries();
	}
	
	@GetMapping("/api/country/{countryId}")
	public Country getCountry(@PathVariable Long countryId) {
		return service.getCountry(countryId);
	}
}
