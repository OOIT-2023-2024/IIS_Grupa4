package geometry;

public class Circle {

	private Point center;
	private int radius;
	private boolean selected;
	
	//metode pristupa 
	
	public Circle() {
		
	}
	
	public Circle(Point center, int radius) {
		this.center = center;
		this.radius = radius;
	}

	public Circle(Point center, int radius, boolean selected) {
		this.center = center;
		this.radius = radius;
		this.selected = selected;
	}

	public Point getCenter() {
		return center;
	}
	public void setCenter(Point center) {
		this.center = center;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public boolean isSelected() {
		return selected;
	}
	public void setSelected(boolean selected) {
		this.selected = selected;
	}

	//povrsina i obim
	
	public double area() { 
		return radius*radius*Math.PI;
	}
	public double circumference() { 
		return 2*radius*Math.PI;
	}
	
	public boolean equals(Object obj) {
		if (obj instanceof Circle) {
			Circle pomocna = (Circle) obj;
			if (this.center.equals(pomocna.center) && this.radius == pomocna.radius)
				return true;
			else
				return false;
		} else
			return false;
	}
	
	public String toString() {
		return "Center: " + center + ", radius = " + radius;
	}
	
	public boolean contains (int x, int y) {
		return center.distance(new Point(x,y)) <= radius;
	}
	
	public boolean contains (Point p) { 
		//return center.distance(p) <= radius;
		return this.contains(p.getXCoordinate(), p.getYCoordinate());
	}
	
}
