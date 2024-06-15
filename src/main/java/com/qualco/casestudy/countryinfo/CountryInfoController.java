package com.qualco.casestudy.countryinfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CountryInfoController {
	
	@Autowired
	private CountryInfoService service;
	
	@GetMapping("/api/info")
	public List<CountryInfoDTO> getCountryInfo() {
		return service.getCountryInfo();
	}
}
