package listes;

import java.util.ArrayList;
import java.util.Iterator;

public class TestListeInt {
	
	public static void main(String args[]) {
		
		ArrayList<Integer> liste = new ArrayList<Integer> ();
		liste.add(-1);
		liste.add(5);
		liste.add(7);
		liste.add(3);
		liste.add(-2);
		liste.add(4);
		liste.add(8);
		liste.add(5);
		
		ArrayList<Integer> liste2 = new ArrayList<Integer> ();
		liste2.add(5);
		liste2.add(-7);
		liste2.add(4);
		liste2.add(-11);
		liste2.add(1);
		liste2.add(85);
		liste2.add(-13);
		liste2.add(2);
		
		for (Integer a : liste) {
			
			System.out.println(a);
		}
		
		System.out.println("-----------------------------------------------------------------");
		
		System.out.println("La liste est d'une longueur de : "+liste.size());
		
		System.out.println("-----------------------------------------------------------------");
		
		int max = liste.get(0);
		
		for (int i = 1; i < liste.size(); i++) {
			
            if (liste.get(i) > max) {
            	
                max = liste.get(i);
            }
        }
		
		System.out.println("Le plus grand élément est : " + max);
		
		System.out.println("-----------------------------------------------------------------");
		
		int min = liste.get(0);
		
		for (int i = 1; i < liste.size(); i++) {
	            if (liste.get(i) < min) {
	                min = liste.get(i);
	            }
	        }
		
		Iterator<Integer> iter = liste.iterator();
		
		while (iter.hasNext()) {
			
			Integer chiffre = iter.next();
			
			if (chiffre == min) {
				iter.remove();
			}
		}
		
		for (Integer a : liste) {
			
			System.out.println(a);
		}
		
		System.out.println("Le plus petit élément était : "+min+" et il a été supprimé" );
		
		System.out.println("-----------------------------------------------------------------");
		
		
		for(int i=0; i<liste2.size(); i++) {	
			
			if (liste2.get(i) < 0 ) {
				
				liste2.set(i, -liste2.get(i));
			}
		}
		
		for (Integer a : liste2) {
			
			System.out.println(a);
		}
		
	}

}
