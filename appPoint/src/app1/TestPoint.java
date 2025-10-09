/**
 * 
 */
package app1;

/**
 * 
 */
public class TestPoint {

	/**
	 * @param args
	 * @throws ErrorCorrdonneesNull 
	 */
	public static void main(String[] args) throws ErrorCorrdonneesNull  {
		// TODO Auto-generated method stub
		/*
		Point p3;
		Point p1 = new Point(14.0, -14.5);
	    Point p2 = new Point(14.0, -14.5);
	    p3=p2;
	    System.out.println(p1==p2);
	    System.out.println(p1==p2);
	    System.out.println(p1.equals(p2));
	    //Point ppPoint =  p1.milieu(p1,p2);
	    */
		/*
		Point p1,p2,p3;
		p1=new Point(14.0,-14.5);
        p2=new Point(14.0,-14.5);
        p3=p2;
        p1.translate(10.0, -10.0);
        System.out.println(p1==p2); // false
        System.out.println(p3==p2); // true 
        System.out.println(p1.equals(p2)); // true
        System.out.println(p1.toString()); // ici affiche le nom de la classe et l'adresse ou se trouve les objets 
                                         // (les points sont les objets dans ce cas) 
       System.out.println(p2.toString()); 
       p1.affiche();
     
       Point.milieu(p1, p2).affiche();*/
		
		
		/*
		Point3D point3d = null;
		try {
			Point3D point3d1 = new Point3D(point3d);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("excption"+e.getMessage());
		}
		Point3D point3d1 = new Point3D(100.0);
	    Point3D point3d2 = new Point3D(50.0);
	    Point3D point3d3 = new Point3D(50.0,30.0,15.0);
	    
	    point3d1.affiche();
	    point3d2.affiche();
	    point3d1.milieu(point3d2).affiche();
	    Point3D.milieu(point3d1,point3d3).affiche();
	    */
		
		
		Double x = null;
		Double y = null;
		Point point = new Point(x,y);
		
		point.affiche();
		
	}

}
