package com.qualco.casestudy.maxgdp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class MaxGdpPerCapitaController {
	
	@Autowired
	private MaxGdpPerCapitaService service;
	
	@GetMapping("/api/maxGdpPerCapita")
	public List<MaxGdpPerCapitaDTO> getMaxGdpPerCapita() {
		return service.getMaxGdpPerCapita();
	}
}
