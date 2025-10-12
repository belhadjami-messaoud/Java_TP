import java.util.ArrayList;
import java.util.Iterator;

public class Design {
	
	private ArrayList<Rectangle> rectangles;
	
	public Design() {
		this.rectangles = new ArrayList<Rectangle>();
	}
	
	public void add (Rectangle r) {
		this.rectangles.add(r);
	}
	
	public double surface() {
		Double resaultDouble = 0.0;
		for(Rectangle r: rectangles) {
			resaultDouble += r.surface();
					}
		return resaultDouble;
	}
	
	public void translate(double dx, double dy) {
		for(Rectangle r : rectangles) {
			r.translate(dx, dy);
		}
	}

	public Rectangle hull() {
		return  Rectangle.hull(this.rectangles);
	}
	
}
