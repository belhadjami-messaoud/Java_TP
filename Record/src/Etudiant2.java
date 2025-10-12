

public record Etudiant2(String nom,String prenom,double[] notes) {
	static double version = 1.0;
	public Etudiant2 {
		
		if(nom == null || nom.trim().isEmpty())
			throw new IllegalArgumentException("Nom non vide");
		
		if(prenom == null || nom.trim().isEmpty()) 
			throw new IllegalArgumentException("prenom non vide");
		
		if(notes[1] < 0.0 || notes[1]> 20.0)
			throw new IllegalArgumentException("prenom non vide");
		
		if(notes[0] < 0.0 || notes[1] > 20.0)
			throw new IllegalArgumentException("prenom non vide");
	}
	
		public Etudiant2 (String nom ,String prenom){
			this(nom,prenom,new double [2]);
		}
		
		public Etudiant2 (String nom) {
			this(nom,"--");
		}
		
		public double moy() {
			return (this.notes[0]+this.notes[1])/2;
		}
		
		public void setnote1(double note) {
			 this.notes[0]=note;
		 }
		 
		public void setnote2(double note) {
			 this.notes[1]=note;
		 }
		

}

