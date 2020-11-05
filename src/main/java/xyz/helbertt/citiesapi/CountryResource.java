package xyz.helbertt.citiesapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.helbertt.citiesapi.countries.country.Country;

import java.util.List;

@RestController
@RequestMapping("/countries")
public class CountryResource {

    @GetMapping
    public List<Country> countries() {
        return
    }

}
