package fr.diginamic.essais;

import fr.diginamic.chaines.ManipulationChaine;

public class TestManipulation {
	
	public static void main(String[] args) {
		
		ManipulationChaine chaine1 = new ManipulationChaine ("Durand;Marcel;2 523.5");
		
		
		System.out.println(chaine1.premierChar());
		
		System.out.println("-----------------------------------------------------------------");
		
		System.out.println(chaine1.longueurChaine());
		
		System.out.println("-----------------------------------------------------------------");
		
		System.out.println(chaine1.premierPoint());
		
		System.out.println("-----------------------------------------------------------------");
		
		System.out.println(chaine1.trouverNom());
		
		System.out.println("-----------------------------------------------------------------");
		
		System.out.println(chaine1.nomMaj());
		
		System.out.println("-----------------------------------------------------------------");
		
		System.out.println(chaine1.nomMin());
		
		System.out.println("-----------------------------------------------------------------");
		
		System.out.println(chaine1.splitChaine());
		
		System.out.println("-----------------------------------------------------------------");
		
		System.out.println(chaine1.creationSalarie());
	}

}
