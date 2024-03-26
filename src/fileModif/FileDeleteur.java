package fileModif;

import java.io.File;
import java.nio.file.Path;

public class FileDeleteur {
	public static void delete(Path chemin) {
		chemin.toFile().delete();
		System.out.println(chemin.toString() + " est supprimée");
	}
}
