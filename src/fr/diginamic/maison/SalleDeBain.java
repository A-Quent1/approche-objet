package fr.diginamic.maison;

public class SalleDeBain extends Piece {

	public SalleDeBain(double superficie, int numEtage) {
		super(superficie, numEtage);
	}
	
	public String getType() {
		
		return "Salle de bain";
	}

}
