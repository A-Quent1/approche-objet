package fr.diginamic.banque.entites;

public abstract class Operation {
	
	public String dateOperation;
	public double montant;

	public Operation(String dateOperation, double montant) {
		this.dateOperation = dateOperation;
		this.montant = montant;
	}

	public String getDateOperation() {
		return dateOperation;
	}

	public void setDateOperation(String dateOperation) {
		this.dateOperation = dateOperation;
	}

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}
	
	public String toString() {

        return "Date de l'opération : "+dateOperation+" / Montant de l'opération : "+montant;
    }
	
	public abstract String getType();

}
