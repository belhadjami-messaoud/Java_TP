package dz.edu.misso;

public class Point {
	
	private double x , y;
	
	public Point() {
		super();
		this.x = 0;
		this.y = 0;
	}
	
	public Point(double x , double y) {
		this();
		this.x = x;
		this.y = y;
	}
	
	public void translate (double dx , double dy) {
		this.x = x + dx;
		this.x = x + dy;
	}
}
