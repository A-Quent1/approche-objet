package fr.diginamic.maison;

public class Cuisine extends Piece {

	public Cuisine(double superficie, int numEtage) {
		super(superficie, numEtage);
	}
	
	public String getType() {
		
		return "Cuisine";
	}

}
