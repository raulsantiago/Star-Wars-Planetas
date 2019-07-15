package amedigital.model;

import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Document
public class Climates {
	
	private String nameclimates;

	public Climates() {		
	}

	public Climates(String nameclimates) {
		this.nameclimates = nameclimates;
	}

	public String getNameclimates() {
		return nameclimates;
	}

	public void setNameclimates(String nameclimates) {
		this.nameclimates = nameclimates;
	}

}
