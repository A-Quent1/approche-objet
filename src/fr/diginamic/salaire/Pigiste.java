package fr.diginamic.salaire;

public class Pigiste extends Intervenant {
	
	public int jourTravaille;
	public double salaireJournalier;
	
	public Pigiste(int jourTravaille, double salaireJournalier, String nom, String prenom) {
		super(nom, prenom);
		this.jourTravaille = jourTravaille;
		this.salaireJournalier = salaireJournalier;
		
	}
	
	public int getJourTravaille() {
		return jourTravaille;
	}
	
	public void setJourTravaille(int jourTravaille) {
		this.jourTravaille = jourTravaille;
	}
	
	public double getSalaireJournalier() {
		return salaireJournalier;
	}
	
	public void setSalaireJournalier(double salaireJournalier) {
		this.salaireJournalier = salaireJournalier;
	}
	
	public String getSalaire() {
		
		double salaire = jourTravaille * salaireJournalier;
		return salaire+" €";
	}
	
	public String toString() {
		
		return prenom+" "+nom+" a travaillé durant "+jourTravaille+" jour(s)"+
				"\rpour une rémunération journalière de : "+salaireJournalier+" €"+
				"\rau total la rémunération sera de : "+getSalaire();
	}

	public String getStatut() {
		
		return "Pigiste";
	}

}
