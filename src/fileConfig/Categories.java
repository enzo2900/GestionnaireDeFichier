package fileConfig;

public class Categories {
	private String nom;
	
	public Categories(String n) {
		this.nom = n;
	}
	
	public String getNom() {
		return nom;
	}
	
	/**
	 * @param c
	 * @return
	 */
	@Override
	public boolean equals(Object obj) {
	    // Vérifier si l'objet est une instance de Categories
	    if (obj instanceof Categories) {
	        // Cast de l'objet à comparer en Categories
	        Categories c = (Categories) obj;
	        // Comparaison des noms des catégories
	        return c.nom.equals(nom);
	    }
	    // Retourner false si l'objet n'est pas une instance de Categories
	    return false;
	}
}
