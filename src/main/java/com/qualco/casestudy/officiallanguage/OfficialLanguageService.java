package com.qualco.casestudy.officiallanguage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OfficialLanguageService {
	
	@Autowired
	private OfficialLanguageRepo repo;
	
	public List<OfficialLanguage> getOfficalLanguageByCountryId(Long countryId) {
		return repo.findOfficialLanguagesByCountryId(countryId);
	}
}
