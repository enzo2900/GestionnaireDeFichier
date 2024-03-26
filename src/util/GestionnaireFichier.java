package util;

import java.io.IOException;
import java.nio.file.Paths;

import fileConfig.Directory;
import fileConfig.ElementSysFichier;
import fileConfig.Fichier;
import fileModif.FileCreateur;
import fileModif.FileDeleteur;
import fileModif.FileModifieur;

public class GestionnaireFichier {
	
	public void createDirectory(Directory d) throws IOException {
		FileCreateur.mkdir(d);
	}

	public void moveFichier(Fichier f) throws IOException {
		FileModifieur.move(f);
	}
	
	public void deleteFichier(ElementSysFichier element) {
		FileDeleteur.delete(element.emplacement());
	}
}
