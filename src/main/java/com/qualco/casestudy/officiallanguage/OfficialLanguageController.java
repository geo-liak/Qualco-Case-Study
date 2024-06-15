package com.qualco.casestudy.officiallanguage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class OfficialLanguageController {
	
	@Autowired
	private OfficialLanguageService service;
	
	@GetMapping("/api/countries/{countryId}/languages")
	public List<OfficialLanguage> getOfficialLanguages(@PathVariable Long countryId) {
		return service.getOfficalLanguageByCountryId(countryId);
	}

}
