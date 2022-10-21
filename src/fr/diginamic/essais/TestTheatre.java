package fr.diginamic.essais;

import fr.diginamic.entites.Theatre;

public class TestTheatre {
	
	public static void main(String[] args) {
		
		Theatre theatre1 = new Theatre ("Garnier", 100, 72, 100000);
		
		
		System.out.println(theatre1.toString());
		
		System.out.println("-----------------------------------------------------------------");
		
		System.out.println(theatre1.inscription(18, 10));
		System.out.println(theatre1.inscription(9, 10));
	}

}
