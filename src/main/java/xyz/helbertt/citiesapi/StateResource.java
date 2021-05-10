package xyz.helbertt.citiesapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.helbertt.citiesapi.repository.StateRepository;
import xyz.helbertt.citiesapi.staties.State;

import java.util.List;

@RestController
@RequestMapping("/staties")
public class StateResource {


    private final StateRepository repository;

    public StateResource(StateRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<State> staties() {
        return repository.findAll();
    }

}
