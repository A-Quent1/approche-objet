package fr.diginamic.testenumeration;

public enum Saison {
	
	PRINTEMPS ("Printemps", 1),
	ETE ("Eté", 2),
	AUTOMNE ("Automne", 3),
	HIVER ("Hiver", 4);
	
	
	public String libelle;
	public int numero;
	
	Saison(String libelle, int numero) {
		this.libelle = libelle;
		this.numero = numero;
	}

	public String getLibelle() {
		return libelle;
	}
	
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public static String retourneInstance(String libelle) {
		
		Saison[] saison = Saison.values();
		
		for (Saison a : saison) {
			
			if (a.getLibelle().equals(libelle)) {
				
				return "Le libelle saisi équivaut à la saison : "+a.getLibelle()+" index "+a.getNumero();
			}
		}
		return "Aucune saison ne correspond";
	}
	
}
