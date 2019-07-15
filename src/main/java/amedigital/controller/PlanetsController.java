package amedigital.controller;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;
import amedigital.model.Planets;
import amedigital.repository.PlanetsRepository;
import amedigital.service.PlanetsService;

import java.util.*;

@RestController
public class PlanetsController {
	
	private PlanetsService planetsService;
	
	public PlanetsController(PlanetsService planetsService) {
		this.planetsService = planetsService;		
	}
	
	@Autowired
    PlanetsRepository planetsRepository;

    // Adicionar um planeta via arquivo JSON
    @RequestMapping(value="/swapi.co/api/planets", method = RequestMethod.POST)
    public Planets savePlanets(@RequestBody Planets planets){
        return this.planetsRepository.save(planets);
    }

    // Lista todos os planetas
    @RequestMapping(value="/swapi.co/api/planets", method = RequestMethod.GET)
    public List<Planets> listaPlanets(){
        return this.planetsRepository.findAll();
    }

    // Buscar um planeta pelo nome
    @RequestMapping(value = "/swapi.co/api/planets/{name}/name", method = RequestMethod.GET)
    public List<Planets> findByName(@PathVariable String name){
        return this.planetsRepository.findByNameLikeIgnoreCase(name);
    }

    // Buscar um planeta pelo ID
    @RequestMapping(value = "/swapi.co/api/planets/{id}", method = RequestMethod.GET)
    public Optional<Planets> findById(@PathVariable String id){
        return this.planetsRepository.findById(id);
    }    
    
    // Remover um planeta pelo ID
    @RequestMapping(value = "/swapi.co/api/planets/{id}", method = RequestMethod.DELETE)
    public void findAll(@PathVariable String id){
        planetsRepository.deleteById(id);
    }

}