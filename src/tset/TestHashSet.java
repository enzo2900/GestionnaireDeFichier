package tset;

import java.io.File;
import util.GestionnaireCommande;
import util.GestionnaireFichier;

import java.nio.file.Files;
import fileConfig.Config;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

import commands.CreateDirectoryCommande;

public class TestHashSet {
	public static void main(String[] args) {
		GestionnaireCommande a = new GestionnaireCommande();
		a.addCommande(new CreateDirectoryCommande(new GestionnaireFichier()));
		a.executeFirstCommande();
	}
	
	
	
	public static <T> void afficher (T aAfficher) {
		System.out.println("" + aAfficher);
	}
}
