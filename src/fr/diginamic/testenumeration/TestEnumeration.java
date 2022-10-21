package fr.diginamic.testenumeration;

import fr.diginamic.testenumeration.Saison;

public class TestEnumeration {
	
	public static void main(String args[]) {
		
		Saison[] test = Saison.values();
		
		for (Saison a : test) {
			
			System.out.println(a.getLibelle());
		}
		
		System.out.println("-----------------------------------------------------------------");
		
		String nom = "ETE";
		
		for (Saison a : test) {
			
			System.out.println(a.getLibelle().equals(nom));
		}
		
		System.out.println("-----------------------------------------------------------------");
		
		String libelle = "Hiver";	
		
		
		System.out.println(Saison.retourneInstance(libelle));
		
	}

}
