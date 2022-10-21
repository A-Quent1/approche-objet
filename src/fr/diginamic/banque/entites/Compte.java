package fr.diginamic.banque.entites;

public class Compte {
	
	public String numCompte;
	public double soldeCompte;
	
	public Compte(String numCompte, double soldeCompte) {
		super();
		this.numCompte = numCompte;
		this.soldeCompte = soldeCompte;
	}
	
	public String getNumCompte() {
		return numCompte;
	}

	public void setNumCompte(String numCompte) {
		this.numCompte = numCompte;
	}

	public double getSoldeCompte() {
		return soldeCompte;
	}

	public void setSoldeCompte(double soldeCompte) {
		this.soldeCompte = soldeCompte;
	}

	public String toString() {

        return "Numéro de compte : "+numCompte+" / Solde du compte : "+soldeCompte;
    }
	

}
