package fr.diginamic.essais;

import java.util.Scanner;
import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {
	
	public static void main(String[] args) {
		
		CalculMoyenne tab = new CalculMoyenne();
		CalculMoyenne tab2 = new CalculMoyenne();
		
		tab.ajouter(50);
		tab.ajouter(20);
		tab.ajouter(30);
		
		System.out.println(tab.calculer());
		System.out.println(tab);
		
		tab2.ajouter(20);
		tab2.ajouter(20);
		tab2.ajouter(20);
		tab2.ajouter(10);
		tab2.ajouter(10);
		tab2.ajouter(10);
		
		System.out.println(tab2.calculer());
		System.out.println(tab2);
	}

}