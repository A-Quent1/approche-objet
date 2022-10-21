package fr.diginamic.essais;

import fr.diginamic.maison.Chambre;
import fr.diginamic.maison.Cuisine;
import fr.diginamic.maison.Maison;
import fr.diginamic.maison.Piece;
import fr.diginamic.maison.SalleDeBain;
import fr.diginamic.maison.Salon;
import fr.diginamic.maison.WC;

public class TestMaison {
	
	public static void main(String[] args) {
		
		Maison maison = new Maison();

		Piece piece = new Chambre(20, 5);
		Piece piece2 = new Chambre(80, 3);
		Piece piece3 = new Chambre(35, 0);
		Piece piece4 = new Cuisine(50, 2);
		Piece piece5 = new SalleDeBain(50, 5);
		Piece piece6 = new SalleDeBain(25, 1);
		Piece piece7 = new SalleDeBain(70, 2);
		Piece piece8 = new Salon(30, 5);
		Piece piece9 = new WC(10, 1);
		Piece piece10 = new WC(25, 2);
		
		System.out.println(maison.ajouterPiece(piece));
		maison.ajouterPiece(piece2);
		maison.ajouterPiece(piece3);
		maison.ajouterPiece(piece4);
		maison.ajouterPiece(piece5);
		maison.ajouterPiece(piece6);
		maison.ajouterPiece(piece7);
		maison.ajouterPiece(piece8);
		maison.ajouterPiece(piece9);
		maison.ajouterPiece(piece10);
		
		
		System.out.println("-----------------------------------------------------------------");
		
		System.out.println(maison.ajouterPiece(null));
		
		System.out.println("-----------------------------------------------------------------");
		
		Piece pieceEtageNeg = new Salon(10, -1);
		Piece pieceSuperficieNeg = new SalleDeBain(-100, -1);
		
		System.out.println(maison.ajouterPiece(pieceEtageNeg));
		System.out.println(maison.ajouterPiece(pieceSuperficieNeg));
		
		System.out.println("-----------------------------------------------------------------");
		
		for (int i = 0; i<maison.tabPiece.length;i++) {
			System.out.println(maison.tabPiece[i].toString());
		}
		
		System.out.println("-----------------------------------------------------------------");
		
		System.out.println(maison.superficieTotale());
		System.out.println(maison.superficieEtage(5));
		
		System.out.println("-----------------------------------------------------------------");
		
		System.out.println(maison.superficiePieceType("Chambre"));
		System.out.println(maison.nombrePieceType("WC"));
}

}
