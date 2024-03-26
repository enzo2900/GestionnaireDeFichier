package commands;

import java.io.IOException;

import fileConfig.Directory;
import util.GestionnaireFichier;

/**
 * Commande pour créer un dossier 
 * @author Cluzel
 *
 */
public class CreateDirectoryCommande extends AbstractCommande implements Commande {

	private Directory d;
	
	public CreateDirectoryCommande(GestionnaireFichier app,Directory d) {
		super(app);
		this.d = d;
	}

	@Override
	public void execute() throws IOException {
		app.createDirectory(d);
	}
}
