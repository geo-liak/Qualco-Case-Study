package com.qualco.casestudy.maxgdp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaxGdpPerCapitaService {

@Autowired
private MaxGdpPerCapitaRepo repo;

public List<MaxGdpPerCapitaDTO> getMaxGdpPerCapita() {
	return repo.getMaxGdpPerCapita();
}
}
