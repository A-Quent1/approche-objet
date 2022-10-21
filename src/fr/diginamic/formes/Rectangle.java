package fr.diginamic.formes;

public class Rectangle extends Forme{
	
	public double longueur;
	public double largeur;
	
	public Rectangle(double longueur, double largeur) {
		super();
		this.longueur = longueur;
		this.largeur = largeur;
	}
	public double getLongueur() {
		return longueur;
	}
	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}
	public double getLargeur() {
		return largeur;
	}
	public void setLargeur(double largeur) {
		this.largeur = largeur;
	}
	
	public String calculerSurface() {
		double surface = 0;
		surface = longueur * largeur;
		return surface+" cm²";
	}
	
	public String calculerPerimetre() {
		double perimetre = 0;
		perimetre = (longueur * 2) + (largeur * 2);
		return perimetre+" cm";
	}
	
	public String toString() {
		
		return "Le rectangle d'une longueur de : "+longueur+" cm et d'une largeur de "+largeur+" cm"+
		"\rà une surface de : "+calculerSurface()+
		"\ret une périmètre de : "+calculerPerimetre();
	}
	
}
