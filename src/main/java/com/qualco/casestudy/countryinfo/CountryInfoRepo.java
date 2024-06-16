package com.qualco.casestudy.countryinfo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountryInfoRepo extends CrudRepository<CountryInfoDTO, CountryInfoId> {

	@Query(value = "select c.name as continent, r.name as region, co.name as country, cs.year, cs.population, cs.gdp  from continents c " +
			"inner join regions r on r.continent_id = c.continent_id " +
			"inner join countries co on co.region_id = r.region_id " +
			"inner join country_stats cs on cs.country_id = co.country_id", nativeQuery = true)
	List<CountryInfoDTO> getCountryInfo();
}
