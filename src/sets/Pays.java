package sets;

public class Pays {
	
	public String nom;
	public int nbHab;
	public double pibHab;
	
	public Pays(String nom, int nbHab, double pibHab) {
		super();
		this.nom = nom;
		this.nbHab = nbHab;
		this.pibHab = pibHab;
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

	public double getPibHab() {
		return pibHab;
	}

	public void setPibHab(double pibHab) {
		this.pibHab = pibHab;
	}
	
	public double pibTotal() {
		
		return nbHab * pibHab;
	}
	
	public String toString() {
		
		return "Le pays "+nom+" a une population de "+nbHab+" habitants pour un PIB/Hab de "+pibHab
				+" USD et un PIB total de "+pibTotal()+" USD";
	}
	
}
