package com.qualco.casestudy.continent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/continents")
@CrossOrigin(origins = "http://localhost:4200")
public class ContinentController {

	@Autowired
	private ContinentService continentService;
	
	@GetMapping
	public List<Continent> getAllContinetns() {
		return continentService.getAllContinents();
	}
}
