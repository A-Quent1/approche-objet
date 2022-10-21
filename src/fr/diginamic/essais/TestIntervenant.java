package fr.diginamic.essais;

import fr.diginamic.salaire.Salarie;
import fr.diginamic.salaire.Intervenant;
import fr.diginamic.salaire.Pigiste;

public class TestIntervenant {
	
	public static void main(String[] args) {
		
		Salarie salarie = new Salarie (1789, "Dupont", "Christophe");
		Pigiste pigiste = new Pigiste (10, 16.1, "Daniel", "François");
		
		System.out.println(salarie.toString());
		
		System.out.println("-----------------------------------------------------------------");
		
		System.out.println(pigiste.toString());
		
		System.out.println("-----------------------------------------------------------------");
		
		System.out.println(pigiste.afficherDonnees());
		
		System.out.println("-----------------------------------------------------------------");
		
		System.out.println(salarie.afficherDonnees());
		
	
	}

}
