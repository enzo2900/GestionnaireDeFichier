package main;

import ui.InterfaceUtilisateur;

public class Application {
	
	public final static String DOSSIER_TEST =  "D:\\Users\\Cluzel\\Documents\\TestFichiers";

    public static void main(String[] args) {
        // Initialisation de l'interface utilisateur
        InterfaceUtilisateur interfaceUtilisateur = new InterfaceUtilisateur();
        interfaceUtilisateur.lancer();
    }
}