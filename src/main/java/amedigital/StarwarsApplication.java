package amedigital;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import amedigital.service.PlanetsService;
import amedigital.model.Planets;

@SpringBootApplication
public class StarwarsApplication {

	public static void main(String[] args) {
		SpringApplication.run(StarwarsApplication.class, args);
	}	
	
	@Bean
	CommandLineRunner runner(PlanetsService planetsService) {
		return args -> {
			// Leitura do arquivo JSON e fazendo upload para DB
			ObjectMapper mapper = new ObjectMapper();
			TypeReference<List<Planets>> typeReference = new TypeReference<List<Planets>>(){};
			InputStream inputStream = TypeReference.class.getResourceAsStream("/json/planets.json");
			try {
				List<Planets> planets = mapper.readValue(inputStream,typeReference);
				planetsService.save(planets);
				System.out.println("Planeta Savo!");
			} catch (IOException e){
				System.out.println("Não possível savar o planeta: " + e.getMessage());
			}
		};
	}
}
