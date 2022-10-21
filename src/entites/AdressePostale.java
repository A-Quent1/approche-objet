package entites;

public class AdressePostale {
	
	int numero;
	String libelle;
	int cp;
	String ville;
	
	public AdressePostale(int numero, String libelle,int cp, String ville) {
		this.numero = numero;
		this.libelle = libelle;
		this.cp = cp;
		this.ville = ville;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public int getCp() {
		return cp;
	}

	public void setCp(int cp) {
		this.cp = cp;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}
	

}
