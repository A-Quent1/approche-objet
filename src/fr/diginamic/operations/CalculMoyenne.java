package fr.diginamic.operations;

import java.util.Arrays;

public class CalculMoyenne {
	
	double[] tab = new double[0];

	public void ajouter(double chiffre) {
		
		double[] tab2 = new double[tab.length+1];
		for (int i=0 ; i<tab.length; i++) {
			
			tab2[i] = tab[i];
		}
		tab2[tab.length] = chiffre;
		this.tab = tab2;
	}
	
	public String calculer() {
		double somme = 0;
		double moyenne = 0;
		for (int i=0 ; i<tab.length; i++) {
			somme = somme + tab[i];
		}
		
		moyenne = somme / tab.length;
		
		return "La moyenne du tableau est de : "+moyenne;
	}
	
	public String toString() {
		
		return "Le tableau contient : "+Arrays.toString(tab);
	}
}
