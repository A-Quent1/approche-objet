package tri;

import java.util.Comparator;

public class ComparatorHabitant implements Comparator<Ville> {
	
	public int compare (Ville v1, Ville v2) {
		
		if (v1.getNbHab() > v2.getNbHab()) {
			
			return 1;
		}
		
		if (v1.getNbHab() < v2.getNbHab()) {
			
			return -1;
		}

		return 0;
		
	}

}
