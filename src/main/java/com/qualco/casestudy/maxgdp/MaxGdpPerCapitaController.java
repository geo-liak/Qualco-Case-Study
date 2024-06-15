package com.qualco.casestudy.maxgdp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MaxGdpPerCapitaController {
	
	@Autowired
	private MaxGdpPerCapitaService service;
	
	@GetMapping("/api/maxGdpPerCapita")
	public List<MaxGdpPerCapitaDTO> getMaxGdpPerCapita() {
		return service.getMaxGdpPerCapita();
	}
}
