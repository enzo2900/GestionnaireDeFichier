package fileConfig;

import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashSet;

public class Config {

	private ConfigFiles fichiersConfig;
	
	private String baseUrl;
	
	private String nomConfig;
	
	public Config(String nom,String urlFil) {
		fichiersConfig = new ConfigFiles();
		nomConfig = nom;
		this.baseUrl = urlFil;
	}
	
	public ConfigFiles getFiles() {
		return fichiersConfig;
	}
	
	public String getBaseUrl() {
		return baseUrl;
	}
	
	public String getNom() {
		return nomConfig;
	}
	
	
}
