package commands;

import java.io.IOException;

/**
 * Interface pour utiliser le command Pattern.
 * A utiliser entre l'utilisateur de l'application et le gestionnaire de fichier.
 * A pour but d'encapsuler les actions et de faciliter le changement.
 * @author Cluzel
 */
public interface Commande {
// Utiliser une hashMap avec un certain id pour faire un certain truc ? ou pour hiérarchiser les actions qui doivent être fate
	
	/**
	 * Execute la commande
	 * @throws IOException 
	 */
	public void execute() throws IOException;
	
	public boolean hasExecuted();
}
