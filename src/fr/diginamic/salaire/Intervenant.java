package fr.diginamic.salaire;

public abstract class Intervenant {
	
	public String nom;
	public String prenom;
	public Intervenant(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public abstract String getSalaire();
	
	public abstract String getStatut();
	
	public String afficherDonnees() {
		
		return getNom()+" "+getPrenom()+" est un(e) "+getStatut()+" qui reçoit un salaire de "+getSalaire()+" ";
	}
	
}
