package fr.diginamic.essais;

import fr.diginamic.formes.Cercle;
import fr.diginamic.formes.Carre;
import fr.diginamic.formes.Rectangle;

public class TestForme {
	
	public static void main(String[] args) {
		
		Rectangle rectangle1 = new Rectangle(10, 5);
		Carre carre1 = new Carre(2);
		Cercle cercle1 = new Cercle(20);
		AffichageForme afficher = new AffichageForme();
		
		System.out.println(afficher.afficherForme(rectangle1));
		System.out.println("-----------------------------------------------------------------");
		System.out.println(afficher.afficherForme(carre1));
		System.out.println("-----------------------------------------------------------------");
		System.out.println(afficher.afficherForme(cercle1));
	}
	
	
	
	

}
