package sets;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

import listes.Ville;

public class TestSetDouble {
	
	public static void main(String args[]) {
		
		HashSet<Double> nombre = new HashSet<> ();
		nombre.add(1.5);
		nombre.add(8.25);
		nombre.add(-7.32);
		nombre.add(13.3);
		nombre.add(-12.45);
		nombre.add(48.5);
		nombre.add(0.01);
		
		for (Double a : nombre) {
			System.out.println(a);
		}
		
		System.out.println("-----------------------------------------------------------------");
		
        double maxNb = Collections.max(nombre);
      
		System.out.println("Le nombre le plus grand est : "+maxNb);
		
		System.out.println("-----------------------------------------------------------------");
		
		double minNb = Collections.min(nombre);
	      
		System.out.println("Le nombre le plus petit est : "+minNb);
		
		Iterator<Double> iter = nombre.iterator();
		
		while (iter.hasNext()) {
			Double test = iter.next();
			
			if (test.equals(minNb)) {
				
				iter.remove();
			}
		}
		
		for (Double a : nombre) {
			
			System.out.println(a);
		}
		
		System.out.println("-----------------------------------------------------------------");
	}

}
