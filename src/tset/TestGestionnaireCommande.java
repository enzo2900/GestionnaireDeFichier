package tset;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.*;
import java.io.IOException;

import main.Application;

import java.io.File;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import commands.CreateDirectoryCommande;
import util.*;
import fileConfig.Directory;
import fileModif.StructureManager;
class TestGestionnaireCommande {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@Test
	void testExecutionTouteCommandeDirectory() throws IOException {
		String dossierTest = Application.DOSSIER_TEST;
		StructureManager.clearStructure(Application.DOSSIER_TEST);
		GestionnaireFichier ges = new GestionnaireFichier();
		GestionnaireCommande gesCo = new GestionnaireCommande();
		String nomDirectory = "Doss";
		
		for(int i = 0 ; i < 10; i++) {
			Directory d = new Directory(dossierTest,nomDirectory+""+i);
			gesCo.addCommande(new CreateDirectoryCommande(ges,d));
		}
		gesCo.executeAllCommands();
		for(int i = 0 ; i < 10; i++) {
			assertTrue(new File(dossierTest + "\\" +nomDirectory + "" + i).exists());
		
		}
	}

}
