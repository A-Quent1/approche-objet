package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {
	
	public double tauxRemuneration;

	public CompteTaux(String numCompte, double soldeCompte, double tauxRemuneration) {
		super(numCompte, soldeCompte);
		this.tauxRemuneration = tauxRemuneration;
	}
	
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}

	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}

	public String toString() {
		
		return super.toString()+" / Taux de rémunération : "+tauxRemuneration;
    }

}
