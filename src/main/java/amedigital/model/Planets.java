package amedigital.model;

import java.util.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Document
public class Planets {

    @Id
    private String id;
    
    private String name;    
    private List<Climates> climates;
    private List<Terrains> terrains;
    private List<Films> films;

	public Planets() {    	
    }
	
	public Planets(String id, String name, List<Climates> climates, List<Terrains> terrains, List<Films> films) {
		this.id = id;
		this.name = name;
		this.climates = climates;
		this.terrains = terrains;
		this.films = films;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Climates> getClimates() {
		return climates;
	}

	public void setClimates(List<Climates> climates) {
		this.climates = climates;
	}

	public List<Terrains> getTerrains() {
		return terrains;
	}

	public void setTerrains(List<Terrains> terrains) {
		this.terrains = terrains;
	}

	public List<Films> getFilms() {
		return films;
	}

	public void setFilms(List<Films> films) {
		this.films = films;
	}
}
