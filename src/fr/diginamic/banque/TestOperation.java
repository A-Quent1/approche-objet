package fr.diginamic.banque;

import fr.diginamic.banque.entites.Credit;
import fr.diginamic.banque.entites.Debit;
import fr.diginamic.banque.entites.Operation;

public class TestOperation {
	
	public static void main(String[] args) {
		
		Operation[] tab = new Operation[8];
		tab[0] = new Credit ("01/01/2022",10.50);
		tab[1] = new Credit ("25/01/2022",52.34);
		tab[2] = new Debit ("18/02/2022",37.68);
		tab[3] = new Credit ("20/02/2022",72.10);
		tab[4] = new Debit ("31/03/2022",1.57);
		tab[5] = new Credit ("16/04/2022",96.0);
		tab[6] = new Debit ("07/07/2022",29.99);
		tab[7] = new Debit ("11/08/2022",23.50);
		
		
		for (int i =0; i < tab.length; i++) {
			
			System.out.println(tab[i]);
			System.out.println(tab[i].getType());
			
		}
		
		System.out.println("-----------------------------------------------------------------");
		
		double total = 0;
		
		for (int i =0; i < tab.length; i++) {
			if (tab[i].getType().equals("CREDIT")) {
				
				total = total + tab[i].getMontant();
			}
			
			else {
				
				total = total - tab[i].getMontant();
			}
			System.out.println(tab[i].getType()+" de : "+tab[i].getMontant()+"€ à la date du : "+tab[i].getDateOperation());
		}
		System.out.println("-----------------------------------------------------------------");
		System.out.println("Le montant total des opérations est de : "+total+" €");
	}

}
