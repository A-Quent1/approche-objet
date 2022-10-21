package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import fichier.Ville;

public class LectureFichier {
	
	public static void main(String args[]) throws IOException {
		
		List<Ville> listVille = new ArrayList<> ();
		
		Path path = Paths.get("C:/Users/annez/Documents/recensement.csv");
		
		boolean estExistant = Files.exists(path);
		System.out.println("Existe : "+estExistant);
		boolean estFichier = Files.isRegularFile(path);
		System.out.println("Fichier : "+estFichier);
		boolean estLisible = Files.isReadable(path);
		System.out.println("Lisible : "+estLisible);
		
		List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
		
		
		for (int i = 1; i<lines.size(); i++) {
			
			String[] tokens = lines.get(i).split(";");
			
			String totPopString = tokens[9].replace(" ", "");
			int totPop = Integer.parseInt(totPopString);
			
			System.out.println(totPop);
			Ville ville = new Ville(tokens[6], tokens[2], tokens[1], totPop);
			listVille.add(ville);
		}
		
		for (int i = 0; i<listVille.size(); i++) {
			
			System.out.println(listVille.get(i));
		}
		
		System.out.println("-----------------------------------------------------------------");
		
		Path pathCopy = Paths.get("C:/Users/annez/Documents/recensement3.csv");
		List<String> fileCopy = new ArrayList<> ();
		fileCopy.add(lines.get(0));
		
		
		for (int i = 0; i < listVille.size(); i++) {
			
			if (listVille.get(i).getPopTotale() >= 25000) {
							
					fileCopy.add(listVille.get(i).getNom()+";"+listVille.get(i).getCodeDep()+";"
					+listVille.get(i).getNomRegion()+";"+listVille.get(i).getPopTotale());
			}
				
		}
		Files.write(pathCopy, fileCopy);
		
		
		Iterator<String> ite = fileCopy.iterator();
		
		while (ite.hasNext()) {
			ite.next();
		}
	
		System.out.println("Copie effectuée");
		
		List<String> lines2 = Files.readAllLines(pathCopy, StandardCharsets.UTF_8);
		
		
		for (int i = 0; i<lines2.size(); i++) {
			
			System.out.println(lines2.get(i));
		}
		
		System.out.println(lines2.size());
	}

}
