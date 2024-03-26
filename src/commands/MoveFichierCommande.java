package commands;

import java.io.File;
import java.io.IOException;

import fileConfig.Directory;
import fileConfig.Fichier;
import util.GestionnaireFichier;

/**
 * Commande pour déplacer un fichier
 * @author Cluzel
 *
 */
public class MoveFichierCommande extends AbstractCommande implements Commande {

	private Fichier f;
	
	MoveFichierCommande(GestionnaireFichier app,Fichier f) {
		super(app);
		this.f = f;
	}

	@Override
	public void execute() throws IOException {
		app.moveFichier(f);
	}

}
