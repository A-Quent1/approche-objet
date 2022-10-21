package fr.diginamic.chaines;

import fr.diginamic.entites.Salarie;

public class ManipulationChaine {
	
	public String chaine;
	
	public ManipulationChaine(String chaine) {
		
		this.chaine = chaine;
	}
	
	public String getChaine() {
		return chaine;
	}


	public void setChaine(String chaine) {
		this.chaine = chaine;
	}
	
	public String premierChar() {
		
		char premierChar = chaine.charAt(0);
		return "Le premier caractère de la chaîne est : "+premierChar;
	
	}
	
	public String longueurChaine() {
		
		int longueurChaine = chaine.length();
		return "La longueur de la chaîne est de : "+longueurChaine;
	}
	
	public String premierPoint() {
		
		int indexPoint = chaine.indexOf(";");
		return "Le ; est à l'index : "+indexPoint;
	}
	
	public String trouverNom() {
		
		int index = chaine.indexOf(";");
		CharSequence nom = chaine.subSequence(0, index);
		return "Le nom contenu dans la chaîne est : "+nom;
	}
	
	public String nomMaj() {
		
		int index = chaine.indexOf(";");
		CharSequence nom = ((String) chaine.subSequence(0, index)).toUpperCase();
		return "Le nom contenu dans la chaîne en majuscule est : "+nom;
	}
	
	public String nomMin() {
		
		int index = chaine.indexOf(";");
		CharSequence nom = ((String) chaine.subSequence(0, index)).toLowerCase();
		return "Le nom contenu dans la chaîne en minuscule est : "+nom;
	}
	
	public String splitChaine() {
		
		int nbSplit = 0;
		String[] tabSplit = chaine.split(";");
		for (int i = 0; i<tabSplit.length; i++) {
			System.out.println(tabSplit[i]);
			nbSplit++;
		}
		return "La chaîne est divisé en : "+nbSplit+" partie(s)";
	}
	
	public String creationSalarie() {
		
		String[] tabSplit = chaine.split(";");
		String salaireSplit = tabSplit[2].replace(" ", "");
		double salaireDouble = Double.parseDouble(salaireSplit);
		
		Salarie salarie = new Salarie(tabSplit[0], tabSplit[1], salaireDouble);
		
		//Salarie salarie2 = new Salarie(null, null, 0);
		//salarie2.setNom(tabSplit[0]);
		//salarie2.setPrenom(tabSplit[1]);
		//salarie2.setSalaire(salaireDouble);
		
		return "Le salarié "+salarie.getNom()+" "+salarie.getPrenom()+" a été créé, son salaire est de : "+salarie.getSalaire()+" €";
	}
	
	
	
	

}
