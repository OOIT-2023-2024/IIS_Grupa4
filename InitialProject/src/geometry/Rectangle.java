package geometry;

public class Rectangle {

	private Point upperLeftPoint;
	private int width;
	private int height;
	private boolean selected;
	
	//konstruktori
	public Rectangle() {
		
	}
	public Rectangle(Point upperLeftPoint, int w, int h ) {
		this.upperLeftPoint = upperLeftPoint;
		this.width = w;
		this.height = h;
	}
	public Rectangle(Point upperLeftPoint, int w, int h, boolean selected ) {
		this(upperLeftPoint,w,h);
		this.selected = selected;
	}
	//metode pristupa 
	
	public Point getUpperLeftPoint() {
		return upperLeftPoint;
	}
	public void setUpperLeftPoint(Point upperLeftPoint) {
		this.upperLeftPoint = upperLeftPoint;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public boolean isSelected() {
		return selected;
	}
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	
	//povrsina i obim
	public int area() {
		return width * height;
	}
	public int circumference() {
		return 2*width + 2*height;
	}
	public String toString() {
		//Upper left point: (xUpperLeft, yUpperLeft), width = <width>, height = <height> 
		return "Upper left point: " + upperLeftPoint + ", width = " + width +
				", heigh = " + height;
	}

	public boolean equals(Object obj) {
		if (obj instanceof Rectangle) {
			Rectangle pomocna = (Rectangle) obj;
			
			if(this.upperLeftPoint == pomocna.upperLeftPoint &&
					this.width == pomocna.width 
					&& this.height == pomocna.height)
				return true;
			else 
				return false;
		} else 
			return false;
	}
	
}
