  package tset;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.IOException;

import util.GestionnaireFichier;
import fileConfig.Directory;
class GestionnaireFichierTest {
	
	private GestionnaireFichier gestionnaire;

	private final String DOSSIER_TEST =  "D:\\Users\\Cluzel\\Documents\\TestFichiers";
	@Test
	void testCreateDirectory() throws IOException {
		gestionnaire = new GestionnaireFichier();
		Directory d = new Directory(DOSSIER_TEST,"");
		File f = new File("D:\\Users\\Cluzel\\Documents\\TestFichiers\\" + d.getNom());
		
		gestionnaire.createDirectory(d);
		assertTrue(f.exists());
		
	}

}
