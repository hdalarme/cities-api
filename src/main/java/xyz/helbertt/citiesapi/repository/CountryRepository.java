package xyz.helbertt.citiesapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import xyz.helbertt.citiesapi.countries.country.Country;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
