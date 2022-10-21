package fr.diginamic.maison;

public class Maison {
	
	public Piece[] tabPiece;

	public Maison() {
		tabPiece = new Piece[0];
	}

	public String ajouterPiece(Piece piece) {
	
		Piece[] tabPiece2 = new Piece[tabPiece.length+1];
		for (int i=0 ; i<tabPiece.length; i++) {
			
			tabPiece2[i] = tabPiece[i];
		}
		
		if (piece != null) {
			
			if (piece.numEtage >= 0) {
				
				if(piece.superficie > 0) {
					
					tabPiece2[tabPiece.length] = piece;
					tabPiece = tabPiece2;
					return "Pièce ajoutée";
				}
				
			}
		}
		
		return "Pièce non valide";
	}
	
	public String superficieTotale() {
		
		double totale = 0;
		for (int i=0; i<tabPiece.length; i++) {
			totale = totale +tabPiece[i].getSuperficie();
		}
		
		return "La superficie totale de la maison est de : "+totale+" m²";
		
	}
	
	public String superficieEtage(int etage) {
		
		double totaleEtage = 0;
		
		for (int i=0; i<tabPiece.length; i++) {
			
			if (etage == tabPiece[i].getNumEtage()) {
				
				totaleEtage = totaleEtage +tabPiece[i].getSuperficie();
				
			}
			
		}
		
		return "La superficie totale du "+etage+"(er/ème) est de "+totaleEtage+" m²";
		
	}
	
	public String superficiePieceType(String type) {
		
		double superficieType = 0;
		
		for (int i=0; i<tabPiece.length; i++) {
			
			if (type == tabPiece[i].getType()) {
				
				superficieType = superficieType +tabPiece[i].getSuperficie();
				
			}
			
		}
		
		return "La superficie totale des pièces de type "+type+" est de "+superficieType+" m²";
	}
	
	public String nombrePieceType(String type) {
		
		int nombreType = 0;
		
		for (int i=0; i<tabPiece.length; i++) {
			
			if (type == tabPiece[i].getType()) {
				nombreType++;
				
			}
			
		}
		
		return "Le nombre de pièce de type "+type+" est de : "+nombreType;
	}
	
}
