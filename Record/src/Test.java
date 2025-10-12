/**
 * 
 */

/**
 * 
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Etudiant e1 = new Etudiant("misso", "belhadj",20.0,10.0);
		Etudiant e2 = new Etudiant("Amer", "Amer");
		Etudiant e3 = new Etudiant("belhadj", "belhadj");
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		
		System.out.println(e1.moy());
		System.out.println(e2.moy());
		System.out.println(e3.moy());
		System.out.println(new Object());
		
		double [] notes = {20.0,15.0};
		Etudiant2 e21 = new Etudiant2("misso", "belhadj", notes);
		Etudiant2 e22 = new Etudiant2("Amer", "Amer",notes.clone());
	
		
		System.out.println(e21);
		System.out.println(e21.moy());
		
		e21.setnote1(10.0);
		
		System.out.println(e21.moy());
		
		System.out.println(e22.moy());
		
		System.out.println(e22);

		
		
	}

}
