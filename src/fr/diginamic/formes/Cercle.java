package fr.diginamic.formes;

public class Cercle extends Forme {
	
	public double rayon;

	public Cercle(double rayon) {
		this.rayon = rayon;
	}

	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}
	
	public String calculerSurface() {
		double surface = Math.PI * rayon * rayon;
		return surface+" cm²";
	}
	
	public String calculerPerimetre() {
		double perimetre = 2 * Math.PI * rayon;
		return perimetre+" cm";
	}
	
	public String toString() {
		
		return "Le cercle d'un rayon de : "+rayon+" cm"+
		"\rà une surface de : "+calculerSurface()+
		"\ret une périmètre de : "+calculerPerimetre();
	}

}
