package amedigital.service;

import java.util.List;
import org.springframework.stereotype.Service;
import amedigital.model.Planets;
import amedigital.repository.PlanetsRepository;

@Service
public class PlanetsService {
	
	private PlanetsRepository planetsRepository;
	
	public PlanetsService(PlanetsRepository planetsRepository) {
		this.planetsRepository = planetsRepository;		
	}
	
	public Iterable<Planets> list(){
		return planetsRepository.findAll();
	}
	
	public Planets save(Planets planets) {
		return planetsRepository.save(planets);
	}
	
	public void save(List<Planets> planets) {
		planetsRepository.saveAll(planets);
	}

}
