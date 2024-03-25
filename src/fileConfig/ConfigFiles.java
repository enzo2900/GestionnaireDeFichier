package fileConfig;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Objects;

import fileConfig.arrangement.Arrangement;

public class ConfigFiles {

	private LinkedHashSet<ElementSysFichier> fichiersConfig;
	
	private ArrayList<ElementSysFichier> fichiersAjoute;
	
	public ConfigFiles() {
		this.fichiersAjoute = new ArrayList<ElementSysFichier>();
		this.fichiersConfig = new LinkedHashSet<>();
	}
	
	public void addElementSysFichier(ElementSysFichier f) {
		this.fichiersConfig.add(f);
	}
	
	public void removeElementSysFichier(ElementSysFichier f) {
		this.fichiersConfig.remove(f);
	}
	
	
	
	/**
	 * Crée une copie de la liste pour le renvoyer
	 * Peut entrainer des pics de performances
	 * @param index
	 * @return
	 */
	public ElementSysFichier getElementSysFichier(int index) {
		if(this.fichiersAjoute.size() > index) {
			return this.fichiersAjoute.get(index);
		}
		this.fichiersAjoute = new ArrayList<ElementSysFichier>(this.fichiersConfig);
		return this.fichiersAjoute.get(index);
		
	}
	
	public ElementSysFichier[] getfiles() {
		return (ElementSysFichier[]) this.fichiersConfig.toArray();
	}

	@Override
	public int hashCode() {
		return Objects.hash(fichiersAjoute, fichiersConfig);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ConfigFiles other = (ConfigFiles) obj;
		return Objects.equals(fichiersAjoute, other.fichiersAjoute)
				&& Objects.equals(fichiersConfig, other.fichiersConfig);
	}

	@Override
	public String toString() {
		return "ConfigElementSysFichiers [fichiersConfig=" + this.fichiersConfig + "]";
	}
	
	public static ConfigFiles chargerConfig(ElementSysFichier f) {
		return null;
		
	}
	
	public void rearange(Arrangement a) {
		a.arranger();
	}
	
	public void sauvegarder(String nomSauvegarde) {
		
		
	}
}
