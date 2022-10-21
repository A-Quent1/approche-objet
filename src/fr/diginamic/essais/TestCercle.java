package fr.diginamic.essais;

import fr.diginamic.entites.Cercle;
import fr.diginamic.utils.CercleFactory;

public class TestCercle {
	
	public static void main(String[] args) {
		
		Cercle cercle1 = new Cercle (5.5);
		Cercle cercle2 = CercleFactory.creationCercle(10);
		
		System.out.println(cercle1.toString());
		System.out.println(cercle2.toString());
		
		System.out.println(cercle1.retournerPerimetre());
		System.out.println(cercle1.retournerSurface());
		
	}

}
