package commands;

import util.GestionnaireFichier;

abstract class AbstractCommande {
	
	protected int numberOfExecutions;
	
	protected GestionnaireFichier app;
	
	AbstractCommande(GestionnaireFichier app) {
		numberOfExecutions = 0;
		this.app = app;
	}
	
	public boolean hasExecuted() {
		return numberOfExecutions > 0;
	}
}
