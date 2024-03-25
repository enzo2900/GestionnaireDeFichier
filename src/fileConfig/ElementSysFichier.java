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
	private Path url;
	
	public ElementSysFichier(String url) {
		this.url = Paths.get(url);
	}
	
	
	public Path emplacement() {
		return url;
	}

}
