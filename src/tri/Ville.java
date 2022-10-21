package tri;

public class Ville implements Comparable<Ville> {
	
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
	
	public int compareTo(Ville ville) {
		
		//int resultat = this.nom.compareTo(ville.getNom());
		
		if (this.nbHab > ville.getNbHab()) {
			
			return 1;
		}
		
		if (this.nbHab < ville.getNbHab()) {
			
			return -1;
		}

		return 0;
	}
}
