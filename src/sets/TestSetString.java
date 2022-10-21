package sets;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class TestSetString {
	
	public static void main(String args[]) {
		
		HashSet<String> pays = new HashSet<> ();
		pays.add("USA");
		pays.add("France");
		pays.add("Allemagne");
		pays.add("Uk");
		pays.add("Italie");
		pays.add("Japon");
		pays.add("Chine");
		pays.add("Russie");
		pays.add("Inde");
		
		for (String a : pays) {
			System.out.println(a);
		}
		
		System.out.println("-----------------------------------------------------------------");
		
		String maxLettre = Collections.min(pays);
		
		System.out.println("Le pays avec le plus grand nombre de lettre est : "+maxLettre);

		System.out.println("-----------------------------------------------------------------");
		
		String minLettre = Collections.max(pays);
		
		System.out.println("Le pays avec le plus grand nombre de lettre est : "+minLettre);
		
		System.out.println("-----------------------------------------------------------------");
		
		Iterator<String> iter = pays.iterator();
		
		while (iter.hasNext()) {
			String test = iter.next();
			
			if (test.equals(minLettre)) {
				
				iter.remove();
			}
		}
		
		for (String a : pays) {
			
			System.out.println(a);
		}
	}

}
