package fr.diginamic.entites;

public class Cercle {
	
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
	
	public String retournerPerimetre() {
		double perimetre = 2 * Math.PI * rayon;
		return "Le périmètre du cercle est de : "+perimetre+" cm";
	}
	
	public String retournerSurface() {
		double surface = Math.PI * rayon * rayon;
		return "La surface du cercle est de : "+surface+" cm²";
	}
	
	public String toString() {

        return "Le rayon du cercle est de : "+rayon+" cm";
    }

}
