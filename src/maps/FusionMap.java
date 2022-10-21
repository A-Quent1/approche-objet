package maps;

import java.util.HashMap;
import java.util.Iterator;

import listes.Ville;

public class FusionMap {
	
	public static void main(String args[]) {
		
		HashMap<Integer, String> map1 = new HashMap<Integer, String> ();
		map1.put(1, "Rouge");
		map1.put(2, "Vert");
		map1.put(3, "Orange");
		
		HashMap<Integer, String> map2 = new HashMap<Integer, String> ();
		map2.put(4, "Blanc");
		map2.put(5, "Bleau");
		map2.put(6, "Orange");
		
		HashMap<Integer, String> map3 = new HashMap<Integer, String> ();
		map3.putAll(map1);
		map3.putAll(map2);
		
		for(Iterator<Integer> i=map3.keySet().iterator();i.hasNext();){
			
	            Object key=i.next();
	            System.out.println(key + " - " + map3.get(key));
	        }
	}

}
