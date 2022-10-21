package sets;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

import sets.Pays;

public class TestPays {
	
	public static void main(String args[]) {
		
		HashSet<Pays> pays = new HashSet<> ();
		
		Pays pays3 = new Pays ("Allemagne", 83240000, 45723.64);
		Pays pays4 = new Pays ("UK", 67220000, 40284.64);
		Pays pays5 = new Pays ("Italie", 59550000, 31676.20);
		Pays pays6 = new Pays ("Japon", 125800000, 40113.06);
		Pays pays7 = new Pays ("Chine", 1402000000, 10500.40);
		Pays pays8 = new Pays ("Russie", 144100000, 10126.72);
		Pays pays9 = new Pays ("Inde", 1380000000, 1900.71);
		
		pays.add(new Pays ("USA", 329500000, 63543.58));
		pays.add(new Pays ("France", 67390000, 38625.07));
		pays.add(pays3);
		pays.add(pays4);
		pays.add(pays5);
		pays.add(pays6);
		pays.add(pays7);
		pays.add(pays8);
		pays.add(pays9);

		
		for (Pays a : pays) {
			System.out.println(a.toString());
		}
		
		System.out.println("-----------------------------------------------------------------");
		
		System.out.println("Pays avec le PIB/Hab le plus important");
		
		Pays paysTest = new Pays (null, 0, 0);
		for ( Pays paysPibMax : pays ) {
			if (paysPibMax.getPibHab() > paysTest.getPibHab()) {
				
				paysTest = paysPibMax;
			}
		}
		
		System.out.println(paysTest.toString());
		
		System.out.println("-----------------------------------------------------------------");
		
		System.out.println("Pays avec le PIB total le plus important");
		
		for ( Pays paysPibMax : pays ) {
			if (paysPibMax.pibTotal() > paysTest.pibTotal()) {
				
				paysTest = paysPibMax;
			}
		}
		
		System.out.println(paysTest.toString());
		
		System.out.println("-----------------------------------------------------------------");
		
		System.out.println("Pays avec le PIB total le plus petit en Majuscule");
		
		for ( Pays paysPibMax : pays ) {
			if (paysPibMax.pibTotal() < paysTest.pibTotal()) {
				
				paysTest = paysPibMax;
			}
		}
		
		System.out.println("Le pays avec le PIB total le plus petit est le/la "+paysTest.getNom().toUpperCase());
		
		System.out.println("-----------------------------------------------------------------");

		Iterator<Pays> paysIte = pays.iterator();
		
		while (paysIte.hasNext()) {
			
			Pays p = paysIte.next();
			
			if (p.pibTotal() == paysTest.pibTotal()) {
				
				paysIte.remove();
			}
		}
		
		System.out.println("Le pays avec le plus petit PIB total a été supprimé");
		
		System.out.println("-----------------------------------------------------------------");
		
		for (Pays a : pays) {
			
			System.out.println(a.toString());
		}
	}

}
