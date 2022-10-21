package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

public class TestBanque {
	
	public static void main(String[] args) {
		
		Compte compte1 = new Compte ("FR0001",123456);
		Compte compte2 = new Compte ("FR0002",123456);
		CompteTaux cpTaux = new CompteTaux ("FR0003", 2.36, 1.5);
		
		System.out.println(compte1.toString());
		System.out.println(compte2.toString());
		System.out.println(cpTaux.toString());
		
		Compte[] tab = new Compte[2];
		tab[0] = new Compte ("FR0001",26600.5);
		tab[1] = new CompteTaux ("FR0002", 150000.3, 1.5);
		
		
		for (int i =0; i < tab.length; i++) {
			
			System.out.println(tab[i]);
		}
	}

}
