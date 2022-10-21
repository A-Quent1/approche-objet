package fr.diginamic.formes;

public class Carre extends Forme{
	
	public double longueur;
	
	public Carre(double longueur) {
		this.longueur = longueur;

	}
	public double getLongueur() {
		return longueur;
	}
	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}
	
	public String calculerSurface() {
		double surface = 0;
		surface = longueur * longueur;
		return surface+" cm²";
	}
	
	public String calculerPerimetre() {
		double perimetre = 0;
		perimetre = (longueur * 4);
		return perimetre+" cm";
	}
	
	public String toString() {
		
		return "Le carré d'une longueur de : "+longueur+" cm"+
		"\rà une surface de : "+calculerSurface()+
		"\ret une périmètre de : "+calculerPerimetre();
	}
	
}
