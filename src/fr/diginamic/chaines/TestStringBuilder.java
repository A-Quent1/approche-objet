package fr.diginamic.chaines;

public class TestStringBuilder {
	
	public static void main(String args[]) {
	
	long debut = System.currentTimeMillis();
	
	StringBuilder builder = new StringBuilder();
	String string = new String();
	
	for (int i = 0; i <= 100000; i++) {
		
		string +=i;
		//builder.append("Ajout du nombre").append(i);
	}
	
	long fin = System.currentTimeMillis();
	
	System.out.println("Temps écoulé en millisecondes : "+(fin - debut));
	//System.out.println(string);
	
	}

}
