package fileConfig;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public abstract class ElementSysFichier {

	private String nom;
	
	private int profondeur;
	
	/** 
	 * Emplacement de l'élement
	 */
	private Path emplacement;
	
	public ElementSysFichier(String emplacement) {
		nom = "NoNameImplemented";
		this.emplacement = Paths.get(emplacement+"\\" + nom);
		profondeur = 0;
		
	}
	
	public ElementSysFichier(String emplacement,String nom) {
		if(nom.isEmpty()) {
			this.nom = "NoNameImplemented";
		}else {
			this.nom = nom;
		}
		this.emplacement = Paths.get(emplacement+"\\" + nom);
		profondeur = 0;
	}
	
	
	public Path emplacement() {
		return emplacement;
	}
	
	public String getNom() {
		return nom;
	}

}
