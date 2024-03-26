package fileConfig;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Fichier extends ElementSysFichier {

	/**
	 * Emplacement du fichier de base
	 */
	private Path emplacementDeBase;
	
	public Fichier(String emplacement) {
		super(emplacement);
		this.emplacementDeBase = null;
		// TODO Auto-generated constructor stub
	}
	
	public Fichier(String emplacement,String nomFichier) {
		super(emplacement,nomFichier);
		this.emplacementDeBase = null;
		// TODO Auto-generated constructor stub
	}
	
	public Fichier(String emplacement,String nomFichier,String path) {
		super(emplacement,nomFichier);
		this.emplacementDeBase = Paths.get(path);
		// TODO Auto-generated constructor stub
	}

	public void setEmplacementBase(String path) {
		this.emplacementDeBase = Paths.get(path);
	}
	
	
	public Path emplacementBase() {
		return emplacementDeBase;
	}

}
