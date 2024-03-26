package fileModif;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

import fileConfig.Fichier;

public class FileModifieur {

	public static void move(Fichier f) throws IOException {
		Files.move(f.emplacement(),f.emplacementBase(),StandardCopyOption.REPLACE_EXISTING);
		System.out.println(f.emplacement().toString() + " est déplacée");
	}
}
