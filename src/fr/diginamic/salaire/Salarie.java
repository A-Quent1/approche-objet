package fr.diginamic.salaire;

public class Salarie extends Intervenant {
	
	public double salaireMensuel;
	
	public Salarie(double salaireMensuel, String nom, String prenom) {
		super(nom, prenom);
		this.salaireMensuel = salaireMensuel;
		
	}
	
	public double getSalaireMensuel() {
		return salaireMensuel;
	}
	
	public void setSalaireMensuel(double salaireMensuel) {
		this.salaireMensuel = salaireMensuel;
	}
	
	public String getSalaire() {
		
		double salaire = salaireMensuel;
		return salaire+" €";
	}
	
	public String toString() {
		
		return prenom+" "+nom+" a travaillé en CDI"+
				"\rpour une rémunération mensuelle de : "+getSalaire();
	}

	public String getStatut() {
		
		return "Salarié(e)";
	}

}
