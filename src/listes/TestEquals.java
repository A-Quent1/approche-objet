package listes;

public class TestEquals {
	
	public static void main(String args[]) {
		
		
		
		Ville ville1 = new Ville("Osaka", 1000000);
		Ville ville2 = new Ville("Osaka", 1000000);
		Ville ville3 = new Ville("Osaki", 1000000);
		
		
		boolean resultat1 = ville1.equals(ville2);
		System.out.println(resultat1);
		
		boolean resultat2 = ville1.equals(ville3);
		System.out.println(resultat2);
		
		boolean resultat3 = ville1 == ville2;
		System.out.println(resultat3);
	}

}
