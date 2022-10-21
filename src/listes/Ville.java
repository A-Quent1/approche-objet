package listes;

import fr.diginamic.testenumeration.Continent;

public class Ville {
	
	public String nom;
	public int nbHab;
	
	public Ville(String nom, int nbHab) {
		super();
		this.nom = nom;
		this.nbHab = nbHab;
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
	
	public String toString() {
		
		return nom+" possédant "+nbHab+" habitants";
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
