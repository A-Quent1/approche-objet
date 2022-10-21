package fr.diginamic.testenumeration;

import fr.diginamic.testenumeration.Continent;

public class Ville {
	
	public String nom;
	public int nbHab;
	public Continent continent;
	
	public Ville(String nom, int nbHab, Continent continent) {
		super();
		this.nom = nom;
		this.nbHab = nbHab;
		this.continent = continent;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNbHab() {
		return nbHab;
	}

	public void setNbHab(int nbHab) {
		this.nbHab = nbHab;
	}
	
	public Continent getContinent() {
		return continent;
	}

	public void setContinent(Continent continent) {
		this.continent = continent;
	}
	
	public String toString() {
		
		return nom+" possédant "+nbHab+" habitants et se trouvant sur le continent : "+continent;
	}
	
	public boolean equals(Object object) {
		if (!(object instanceof Ville)) {
			
			return false;
		}
		
		Ville other = (Ville) object;
		if (this.getNom().equals(other.getNom()) 
				&& this.getNbHab() == other.getNbHab()) {
			
			return true;
		}
		
		return false;
	}
	
	
}
