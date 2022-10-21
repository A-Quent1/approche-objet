package tri;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import tri.Ville;

public class TestVille {
	
	public static void main(String args[]) {
		
		Ville ville1 = new Ville("Nice",343000);
		Ville ville2 = new Ville("Carcassonne",53400);
		Ville ville3 = new Ville("Narbonne",53400);
		Ville ville4 = new Ville("Lyon",484000);
		Ville ville5 = new Ville("Foix",9700);
		Ville ville6 = new Ville("Pau",77200);
		Ville ville7 = new Ville("Marseille",850700);
		Ville ville8 = new Ville("Tarbes",40600);
		
		ArrayList<Ville> listeVille = new ArrayList<Ville> ();
		listeVille.addAll(Arrays.asList(ville1, ville2, ville3, ville4, ville5, ville6, ville7, ville8));
		
		//Collections.sort(listeVille);
		//Collections.sort(listeVille, new ComparatorNom());
		Collections.sort(listeVille, new ComparatorHabitant());
		
		for (Ville a : listeVille) {
			
			System.out.println(a.toString());
		}
		
	}

}
