package entites;

import entites2.Personne;

public class TestPersonne {
	
public static void main(String[] args) {
	
				
		AdressePostale adresse1 = new AdressePostale (12,"Rue du Général Test",01101,"TestLand");
		AdressePostale adresse2 = new AdressePostale (13,"Rue du Général Test",01102,"TestCity");
	
		Personne personne1 = new Personne ("Jean","Jean",adresse1);
		
		Personne personne2 = new Personne ("Pascal","Patrick");
		personne2.setAdresse(adresse2);
		
		personne2.setNom("Paskal");
		
		System.out.println (personne2.afficherIdentite());	
		
	}


public static void afficherPersonne(Personne unePersonne) {
	
		System.out.println("Nom :"+unePersonne.getNom());
		System.out.println("Prenom :"+unePersonne.getPrenom());
		System.out.println("Adresse :"+unePersonne.getAdresse());

	}

}
