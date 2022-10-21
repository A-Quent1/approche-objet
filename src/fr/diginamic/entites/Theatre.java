package fr.diginamic.entites;

public class Theatre {
	
	public String nom;
	public int capMax;
	public int totalClient;
	public double recetteTotale;

	public Theatre(String nom, int capMax, int totalClient, double recetteTotale) {
		this.nom = nom;
		this.capMax = capMax;
		this.totalClient = totalClient;
		this.recetteTotale = recetteTotale;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getCapMax() {
		return capMax;
	}

	public void setCapMax(int capMax) {
		this.capMax = capMax;
	}

	public int getTotalClient() {
		return totalClient;
	}

	public void setTotalClient(int totalClient) {
		this.totalClient = totalClient;
	}

	public double getRecetteTotale() {
		return recetteTotale;
	}

	public void setRecetteTotale(double recetteTotale) {
		this.recetteTotale = recetteTotale;
	}
	
	public String inscription(int nbClient, double prixPlace) {
		
		if (capMax >= totalClient + nbClient) {
			double achat = 0;
			totalClient = totalClient + nbClient;
			achat = nbClient * prixPlace;
			recetteTotale = recetteTotale + achat;
			
			return nbClient+" client(s) se sont inscrit(e)s pour un prix de : "+prixPlace+" € chacun"+
					"\rà l'opéra "+nom+". La recette totale de l'établissement est de : "+recetteTotale+" €"+
					"\rLe nombre de client inscrit est de : "+totalClient+" pour un maximum de "+capMax+" personnes";
		}
		
		else {
			
			int placeRestante = capMax - totalClient;
			return "Le nombre maximum de place à été atteint désolé pour vous"
					+ "\rIl reste actuellement "+placeRestante+" de place.";
			
		}
		
	}
	
	public String toString() {

        return "Le nom de l'opéra est : "+nom+" / La capacité totale est de : "+capMax+" pers."
        		+"\rLe total de client actuelle est de : "+totalClient+" pers."
        		+"\rLa recette totale de l'établissement est de : "+recetteTotale+" €";
    }
}
