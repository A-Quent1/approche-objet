package listes;

import java.util.ArrayList;

public class CreationListe {
	
	public static void main(String args[]) {
		int i = 0;
		ArrayList<Integer> nombre = new ArrayList<>();
		while (i<=100) {
			nombre.add(i);
			i++;
		}
		
		for (Integer a : nombre) {
			
			System.out.println(a);
		}
		
	}

}
