package fileModif;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * @author Cluzel
 *
 */
public class StructureManager {
	
	public static void clearStructure(String structureEmplacement) throws IOException {
		File f = new File(structureEmplacement);
		String[] elements = f.list();
		for(String element : elements) {
			System.out.println(element);	
		}
		Scanner confirmation = new Scanner(System.in);
		System.out.println("Confirmez la suppression des fichiers ?");
		String saisie = confirmation.next();
		if(saisie.equals("oui")) {
			TrueClear(elements, structureEmplacement);
		} 
	}
	
	private static void TrueClear(String[] structure, String structureEmplacement) {
		for(String element : structure) {
			Path chemin = Paths.get(structureEmplacement+"\\"+element);
			FileDeleteur.delete(chemin);
		}
	}
}
