package fr.diginamic.maison;

public abstract class Piece {
	
	public double superficie;
	public int numEtage;
	
	public Piece(double superficie, int numEtage) {
		this.superficie = superficie;
		this.numEtage = numEtage;
	}
	
	public double getSuperficie() {
		return superficie;
	}
	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}
	public int getNumEtage() {
		return numEtage;
	}
	public void setNumEtage(int numEtage) {
		this.numEtage = numEtage;
	}
	
	public abstract String getType();
	
	public String toString() {
		
		return "La pièce "+getType()+" aux "+getNumEtage()+
				"(er/ème) étage a une superficie de "+getSuperficie();

	}

}
