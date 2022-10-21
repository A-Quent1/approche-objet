package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;

public class CreerFichier {
	
	public static void main(String args[]) throws IOException {
		
		Path path = Paths.get("C:/Users/annez/Documents/recensement.csv");
		
		
		boolean estExistant = Files.exists(path);
		System.out.println("Existe : "+estExistant);
		boolean estFichier = Files.isRegularFile(path);
		System.out.println("Fichier : "+estFichier);
		boolean estLisible = Files.isReadable(path);
		System.out.println("Lisible : "+estLisible);
		
		List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
		
		for (int i = 0; i<lines.size(); i++) {
			
			System.out.println(lines.get(i));
		}
		
		System.out.println(lines.size());
		
		
		System.out.println("-----------------------------------------------------------------");
		
		List<String> fileCopy = new ArrayList<String> ();
		
		for (int i = 0; i<100; i++) {
			fileCopy.add(lines.get(i));
		}
		
		Path pathCopy = Paths.get("C:/Users/annez/Documents/recensement2.csv");
		
		boolean estExistant2 = Files.exists(pathCopy);
		System.out.println("Existe : "+estExistant2);
		boolean estFichier2 = Files.isRegularFile(pathCopy);
		System.out.println("Fichier : "+estFichier2);
		boolean estLisible2 = Files.isReadable(pathCopy);
		System.out.println("Lisible : "+estLisible2);
		
		Files.write(pathCopy, fileCopy);
		
		List<String> lines2 = Files.readAllLines(pathCopy, StandardCharsets.UTF_8);
		
		for (int i = 0; i<lines2.size(); i++) {
			
			System.out.println(lines2.get(i));
		}
		
		System.out.println(lines2.size());
		
		
	}

}
