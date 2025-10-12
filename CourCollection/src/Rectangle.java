import java.util.ArrayList;

public class Rectangle {

	// le point du bas gauche
	private Point p1;
	// le point du haut droite
	private Point p2;
	private double largeur;
	private double hauteur;
	
	
	public Rectangle(Point p1 , Point p2) {
		super();
		this.p1 = p1;
		this.p2 = p2;
		
	}
	
	public Rectangle(Point p1 , double largeur, double hauterur) {
		super();
		this.p1 = p1;
		this.p2 =  new Point(p1.x + largeur,p1.y + hauterur);
	}
	
	public double surface() {
		return Math.abs(p1.x - p2.x) * Math.abs(p1.y - p2.y);
	}
	
	public void translate(double dx , double dy ) {
		p1.translate(dx, dy);
		p2.translate(dx, dy);
	}
	
	public boolean contains(Point p) {
		boolean test = ( 
				(p.x>= p1.x && p.x<=p2.x) ||
				(p.x<=p1.x && p.x>=p2.x) &&
				( p.y >=p1.y && p.y<= p2.y ||
				p.y<=p1.y && p.y <=p2.y )
				);
		return test;
	}
	
	
	public boolean contains(Rectangle r) {
		return contains(r.p1) && contains(r.p2);
	}

	public double getLargeur() {
		return Math.abs(this.p1.x - this.p2.x);
	}


	public double getHauteur() {
		return Math.abs(this.p1.y - this.p2.y);
	}

	
	public boolean sameAs(Rectangle r) {
		return this.getLargeur() == r.getLargeur() && this.getHauteur() == r.getHauteur();
	}
	
	 public static Rectangle hull(ArrayList<Rectangle> liste){
	        Rectangle res =null ;
	        double x1=0.0 , y1=0.0 , x2=0.0 , y2=0.0 ;

	        for (Rectangle r : liste){

	            x1 = Math.min(x1, r.p1.x);
	            y1 = Math.min(y1, r.p1.y);
	            x2 = Math.max(x2, r.p2.x);
	            y2 = Math.max(y2, r.p2.y);
	    }
	        res = new Rectangle (new Point (x1,y1) , new Point (x2,y2));
	        return res ;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
