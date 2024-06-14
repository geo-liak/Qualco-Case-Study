package com.qualco.casestudy.countryinfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryInfoService {
	
	@Autowired
	private CountryInfoRepo repo;
	
	public List<CountryInfoDTO> getCountryInfo() {
		return repo.getCountryInfo();
	}
}
