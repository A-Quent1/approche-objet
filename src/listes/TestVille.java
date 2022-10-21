package listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

import fr.diginamic.testenumeration.Continent;

public class TestVille {
	
	public static void main(String args[]) {
		
		Ville ville1 = new Ville("Nice",343000);
		Ville ville2 = new Ville("Carcassonne",53400);
		Ville ville3 = new Ville("Narbonne",53400);
		Ville ville4 = new Ville("Lyon",484000);
		Ville ville5 = new Ville("Foix",9700);
		Ville ville6 = new Ville("Pau",77200);
		Ville ville7 = new Ville("Marseille",850700);
		Ville ville8 = new Ville("Tarbes",40600);
		
		ArrayList<Ville> listeVille = new ArrayList<Ville> ();
		listeVille.addAll(Arrays.asList(ville1, ville2, ville3, ville4, ville5, ville6, ville7, ville8));
		
		ArrayList<Ville> listeVille2 = new ArrayList<Ville> ();
		listeVille2.addAll(Arrays.asList(ville1, ville2, ville3, ville4, ville5, ville6, ville7, ville8));
		
		int maxHab = Integer.MIN_VALUE;
		String nom = null;
		
		for (int i = 0; i < listeVille.size(); i++) {
			
            if (listeVille.get(i).getNbHab() >= maxHab) {
            	
            	maxHab = listeVille.get(i).getNbHab();
            	nom = listeVille.get(i).getNom();
            }
            
        }
		System.out.println("La ville la plus peuplée dans la ville est : "+nom+
				"\ravec "+maxHab+" habitants");
		
		System.out.println("-----------------------------------------------------------------");
		
		int minHab = Integer.MAX_VALUE;
		String nom2 = null;
		
		for (int i = 0; i < listeVille2.size(); i++) {
	            if (listeVille2.get(i).getNbHab() < minHab) {
	            	
	            	minHab = listeVille2.get(i).getNbHab();
	            	nom2 = listeVille2.get(i).getNom();
	            }
	        }
		
		System.out.println("La ville la moins peuplée dans la ville est : "+nom2+
				"\ravec "+minHab+" habitants");
		
		
		Iterator<Ville> iterMinHab = listeVille2.iterator();
		
		while (iterMinHab.hasNext()) {
			
			Ville chiffre = iterMinHab.next();
			int i =0;
			i++;
			if (listeVille.get(i).getNbHab() == minHab) {
				
				iterMinHab.remove();
			}
		}
		
		
		for (Ville a : listeVille2) {
			
			System.out.println(a.toString());
		}
		
		System.out.println("-----------------------------------------------------------------");
		
		int modifHab = 100000;
		Ville ville = null;
		
		Iterator<Ville> iter = listeVille2.iterator();
		while(iter.hasNext()) {
			
			ville = iter.next();
			
			for(int i=0; i < listeVille2.size(); i++) {
				
				if (ville.getNbHab() > modifHab) {
       			 
					ville.setNom(ville.getNom().toUpperCase());
       			 
				}
       		 
			}
			
		}

	    		
		for (Ville a : listeVille2) {
			
			System.out.println(a.toString());
	    		
		}
	}

}
