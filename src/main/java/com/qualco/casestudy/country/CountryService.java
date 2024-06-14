package com.qualco.casestudy.country;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {
	
	@Autowired
	private CountryRepo repo;
	
	public List<Country> getCountries() {
		return repo.getCountries();
	}
}
