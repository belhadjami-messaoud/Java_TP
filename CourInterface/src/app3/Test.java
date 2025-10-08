/**
 * 
 */
package app3;

/**
 * 
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conductor conductor = new Conductor();
		
		automobile a,b,d;
		R4 r4 = new R4();
		a = new R4();
		b = new BMW();
		conductor.demarerV(a);
		conductor.demarerV(b);
		conductor.demarerV(r4);
		
		
	}

}
