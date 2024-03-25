package fileConfig;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Fichier extends ElementSysFichier {

	/**
	 * Emplacement du fichier de base
	 */
	private Path emplacementDeBase;
	
	public Fichier(String url,String path) {
		super(url);
		this.emplacementDeBase = Paths.get(path);
		// TODO Auto-generated constructor stub
	}

	public Path emplacementBase() {
		return emplacementDeBase;
	}

}
