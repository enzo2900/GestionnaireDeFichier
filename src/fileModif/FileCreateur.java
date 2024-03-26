package fileModif;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import fileConfig.Config;
import fileConfig.Directory;

public class FileCreateur {
	
	public static void CreateWith(Config conf) {
		
	}
	
	public static void mkdir(Directory d) throws IOException {
		Files.createDirectory(d.emplacement());
		System.out.println(d.emplacement().toString() + " est créé");
	}
}
