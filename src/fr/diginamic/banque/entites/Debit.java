package fr.diginamic.banque.entites;

public class Debit extends Operation {
	
	public String dateOperation;
	public double montant;

	public Debit(String dateOperation, double montant) {
		super (dateOperation, montant);
	}
	
	public String getType() {
		
		return "DEBIT";
	}

}
