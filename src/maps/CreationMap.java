package maps;

import java.util.HashMap;

public class CreationMap {
	
	public static void main(String args[]) {
		
		HashMap<Integer, Salarie> mapSalaires = new HashMap<> ();
		
		mapSalaires.put(0, new Salarie ("Paul", 1750));
		mapSalaires.put(1, new Salarie ("Hicham", 1825));
		mapSalaires.put(2, new Salarie ("Yu", 2250));
		mapSalaires.put(3, new Salarie ("Ingrid", 2015));
		mapSalaires.put(4, new Salarie ("Chantal", 2418));
		
		
		System.out.println("La HashMap a une taille de : "+mapSalaires.size());
	}

}
