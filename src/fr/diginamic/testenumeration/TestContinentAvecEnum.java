package fr.diginamic.testenumeration;

import java.util.ArrayList;

public class TestContinentAvecEnum {
	
	public static void main(String args[]) {
		
		Continent[] tabContinent = Continent.values();
		
		ArrayList<Ville> listeVille = new ArrayList<Ville> ();
		Ville ville1 = new Ville ("New York",8380000,Continent.AMERIQUE);
		Ville ville2 = new Ville ("Paris",2161000,Continent.EUROPE);
		Ville ville3 = new Ville ("Pékin",21540000,Continent.ASIE);
		Ville ville4 = new Ville ("Moscou",11920000,Continent.ASIE);
		Ville ville5 = new Ville ("Berlin",3645000,Continent.EUROPE);
		Ville ville6 = new Ville ("Sydney",5312000,Continent.OCEANIE);
		Ville ville7 = new Ville ("Sao Paulo",12330000,Continent.AMERIQUE);
		Ville ville8 = new Ville ("Dakar",1146000,Continent.AFRIQUE);
		listeVille.add(ville1);
		listeVille.add(ville2);
		listeVille.add(ville3);
		listeVille.add(ville4);
		listeVille.add(ville5);
		listeVille.add(ville6);
		listeVille.add(ville7);
		listeVille.add(ville8);
		
		for(int i = 0; i<listeVille.size(); i++) {
			
			if (listeVille.get(i).getContinent().equals(Continent.AFRIQUE)) {
				
				System.out.println("Ville du continent Africain :");
				System.out.println(listeVille.get(i).toString());
			}
			
			else if (listeVille.get(i).getContinent().equals(Continent.AMERIQUE)) {
				
				System.out.println("Ville du continent Américain :");
				System.out.println(listeVille.get(i).toString());
			}
			
			else if (listeVille.get(i).getContinent().equals(Continent.ASIE)) {
				
				System.out.println("Ville du continent Asiatique :");
				System.out.println(listeVille.get(i).toString());
			}
			
			else if (listeVille.get(i).getContinent().equals(Continent.EUROPE)) {
				
				System.out.println("Ville du continent Européen :");
				System.out.println(listeVille.get(i).toString());
			}
			
			else if (listeVille.get(i).getContinent().equals(Continent.OCEANIE)) {
				
				System.out.println("Ville du continent Océanique :");
				System.out.println(listeVille.get(i).toString());
			}
			
		}
		

	}

}
