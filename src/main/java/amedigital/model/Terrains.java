package amedigital.model;

import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Document
public class Terrains {
	
	private String nameterrains;

	public Terrains() {		
	}

	public Terrains(String nameterrains) {
		this.nameterrains = nameterrains;
	}

	public String getNameterrains() {
		return nameterrains;
	}

	public void setNameterrains(String nameterrains) {
		this.nameterrains = nameterrains;
	}

}
