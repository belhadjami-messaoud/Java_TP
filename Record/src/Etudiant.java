
public record Etudiant(String nom,String prenom,Double note1,Double note2) {
	static double version = 1.0;
	public Etudiant {
		
		if(nom == null || nom.trim().isEmpty())
			throw new IllegalArgumentException("Nom non vide");
		
		if(prenom == null || nom.trim().isEmpty()) 
			throw new IllegalArgumentException("prenom non vide");
		
		if(note1 < 0.0 || note1 > 20.0)
			throw new IllegalArgumentException("prenom non vide");
		
		if(note2 < 0.0 || note2 > 20.0)
			throw new IllegalArgumentException("prenom non vide");
	}
	
		public Etudiant (String nom ,String prenom){
			this(nom,prenom,0.0,0.0);
		}
		
		public Etudiant (String nom) {
			this(nom,"--");
		}
		
		public double moy() {
			return (this.note1+this.note2)/2;
		}
	
		

}
