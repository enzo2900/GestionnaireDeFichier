package tset;

import java.io.File;
import java.nio.file.Files;
import fileConfig.Config;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class TestHashSet {
	public static void main(String[] args) {
		LinkedHashSet<String>fichiersConfig = new LinkedHashSet<>();
		
		fichiersConfig.add("f1");
		fichiersConfig.add("f2");
		Config config = new Config("a","az");
		//config.getFiles().
	}
	
	
	
	public static <T> void afficher (T aAfficher) {
		System.out.println("" + aAfficher);
	}
}
