package listes;

import java.util.ArrayList;
import java.util.Iterator;

public class TestListeString {
	
	public static void main(String args[]) {
		
		ArrayList<String> listeVille = new ArrayList<String> ();
		listeVille.add("Nice");
		listeVille.add("Carcassonne");
		listeVille.add("Narbonne");
		listeVille.add("Lyon");
		listeVille.add("Foix");
		listeVille.add("Pau");
		listeVille.add("Marseille");
		listeVille.add("Tarbes");
		
		ArrayList<String> listeVille2 = new ArrayList<String> ();
		listeVille2.add("Paris");
		listeVille2.add("Nantes");
		listeVille2.add("Lorient");
		listeVille2.add("Bordeau");
		listeVille2.add("Le Mans");
		listeVille2.add("Montreuil");
		listeVille2.add("Auxerre");
		listeVille2.add("Dunkerque");
		
		int maxSize = 0;
		String ville = null;
		
		for (int i = 1; i < listeVille.size(); i++) {
			
            if (listeVille.get(i).length() > maxSize) {
            	
            	maxSize = listeVille.get(i).length();
            	ville = listeVille.get(i);
            }
            
        }
		System.out.println("La ville avec le plus grand nombre de lettres est : "+ville+
				"\ravec "+maxSize+" de lettres");
		
		System.out.println("-----------------------------------------------------------------");
		
		
		for(int i=0; i<listeVille2.size(); i++) {
				
				listeVille2.set(i, listeVille2.get(i).toUpperCase());
				
			}
		
		for (String a : listeVille2) {
			
			System.out.println(a);
		}
		
		
		System.out.println("-----------------------------------------------------------------");
		
		
		Iterator<String> iterVilleN = listeVille.iterator();
		
		while (iterVilleN.hasNext()) {
			
			String nomVille = iterVilleN.next();
			
			if (nomVille.startsWith("N")) {
				iterVilleN.remove();
			}
		}
		
		for (String b : listeVille) {
			
			System.out.println(b);
		}
	}

}
