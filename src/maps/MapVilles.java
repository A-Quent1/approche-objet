package maps;

import java.util.HashMap;
import java.util.Iterator;
import listes.Ville;

public class MapVilles {
	
	public static void main(String args[]) {
		
		HashMap<String, Integer> mapVille = new HashMap<> ();
		mapVille.put("Nice",343000);
		mapVille.put("Carcassonne",53400);
		mapVille.put("Narbonne",58400);
		mapVille.put("Lyon",484000);
		mapVille.put("Foix",9700);
		mapVille.put("Pau",77200);
		mapVille.put("Marseille",850700);
		mapVille.put("Tarbes",40600);
		
		int min = Integer.MAX_VALUE;
		String nomVille = null;
		int nbHabVille = 0;
		
		Iterator<String> valuesIte = mapVille.keySet().iterator();
		while (valuesIte.hasNext()) {
			
			String ville = valuesIte.next();
			Integer nbHab = mapVille.get(ville);
			
			if (nbHab < min) {
				nbHabVille = nbHab;
				nomVille = ville;
			}
				
		}
		
		valuesIte.remove();
		
		System.out.println("La ville "+nomVille+" avait la plus petite population de la HashMap avec "+nbHabVille+" habitants");
		
		System.out.println("-----------------------------------------------------------------");
		
		for(Iterator<String> i=mapVille.keySet().iterator();i.hasNext();){
			
            Object key=i.next();
            System.out.println(key + " - " + mapVille.get(key));
        }
		
		
	}
}
