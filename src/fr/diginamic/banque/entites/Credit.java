package fr.diginamic.banque.entites;

public class Credit extends Operation {
	
	public String dateOperation;
	public double montant;

	public Credit(String dateOperation, double montant) {
		super (dateOperation, montant);
	}
	
	public String getType() {
		
		return "CREDIT";
	}

}
