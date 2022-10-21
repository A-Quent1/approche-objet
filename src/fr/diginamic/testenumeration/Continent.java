package fr.diginamic.testenumeration;

public enum Continent {
	
	AFRIQUE ("Afrique"),
	AMERIQUE ("Amérique"),
	ASIE ("Asie"),
	EUROPE ("Europe"),
	OCEANIE ("Océanie");
	
	public String libelle;
	
	Continent(String libelle) {
		this.libelle = libelle;
	}

	public String getLibelle() {
		return libelle;
	}
	
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

}
