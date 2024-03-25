package fileConfig.arrangement;

public enum Arrangement {
	/**
	 * Default arrangement. Arrangement de a à z
	 */
	Default(new DefaultArrangement()),
	Personnel(new ArrangementPerso());
	
	public IArrangement a;
	Arrangement(IArrangement a ) {
		this.a = a;
	}
	
	public void arranger() {
		a.arranger();
		
	}
}
