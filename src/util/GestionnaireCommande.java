package util;

import java.io.IOException;

import java.util.Scanner;
import java.util.LinkedList;

import commands.Commande;

public class GestionnaireCommande {

private LinkedList<Commande> listeCommandes;
	
	private Commande lastDeletedCommande;
	
	public GestionnaireCommande() {
		listeCommandes = new LinkedList();
	}
	
	public void addCommande(Commande commande) {
		listeCommandes.add(commande);
	}
	
	public void removeCommande(Commande commande) {
		lastDeletedCommande = listeCommandes.getLast();
		listeCommandes.remove(commande);
	}
	
	public void undo() {
		lastDeletedCommande = listeCommandes.getLast();
		listeCommandes.removeLast();
	}
	
	public void redo() {
		if(lastDeletedCommande !=null) {
			addCommande(lastDeletedCommande);
		}
	}
	public void executeFirstCommande() throws IOException {
		listeCommandes.getFirst().execute();
	}
	
	public void executeAllCommands() {
		for(Commande c : listeCommandes) {
			try {
				c.execute();
			} catch (IOException e) {
				System.out.println(e);
				System.out.println("Continuer l'execution ?") ;
				if(new Scanner(System.in).next().equals("non")) {
					break;
				}
				
			}
		}
	}
	public void removeAllExecutedCommand() {
		for(Commande c : listeCommandes) {
			if(c.hasExecuted()) {
				listeCommandes.remove(c);
			}
		}
	}
}
