package com.qualco.case_study_java_21_springData.continent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/continents")
public class ContinentController {

	@Autowired
	private ContinentService continentService;
	
	@GetMapping
	public List<Continent> getAllContinetns() {
		return continentService.getAllContinents();
	}
}