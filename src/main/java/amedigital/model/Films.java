package amedigital.model;

import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Document
public class Films {
	
	private String namefilms;

	public Films() {		
	}

	public Films(String namefilms) {
		this.namefilms = namefilms;
	}

	public String getNamefilms() {
		return namefilms;
	}

	public void setNamefilms(String namefilms) {
		this.namefilms = namefilms;
	}

}