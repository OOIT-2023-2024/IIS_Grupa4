package geometry;

public class Point {

	private int xCoordinate;
	private int yCoordinate;
	private boolean selected;
	
	// default-ni konstruktor
	public Point() {
		
	}
	// konstruktori sa parametrima
	public Point(int xCoordinate, int yCoordinate) {
		this.xCoordinate = xCoordinate;
		this.yCoordinate = yCoordinate;
	}
	
	public Point(int xCoordinate, int yCoordinate, boolean selected) {
		this(xCoordinate, yCoordinate);
		this.selected = selected;
	}
	
	// Get i set metode
	public int getXCoordinate() {
		return xCoordinate;
	}
	public void setXCoordinate(int newX) {
		xCoordinate = newX;
	}
	public int getYCoordinate() {
		return yCoordinate;
	}
	public void setYCoordinate(int yCoordinate) {
		this.yCoordinate = yCoordinate;
	}
	public boolean isSelected() {
		return selected;
	}
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	
	public double distance(Point secondPoint) {
		int dx = secondPoint.xCoordinate - this.xCoordinate;
		int dy = secondPoint.yCoordinate - this.yCoordinate;
		double result = Math.sqrt(dx*dx + dy*dy);
		return result;
	}
	public String toString() {
		// (x,y)
		return "(" + xCoordinate + "," + yCoordinate + ")";
	}
	// point1 == point2 vrsi se poredjenje po referenci
	// point1.equals(point2) vrsi se poredjenje po jednakosti
	public boolean equals(Object obj) {
		if(obj instanceof Point) //da li je obj objekat klase Point?
		{
			Point pomocna = (Point) obj;
			if (this.xCoordinate == pomocna.xCoordinate &&
					this.yCoordinate == pomocna.yCoordinate) 
				return true;
			else
				return false;
		} else {
			return false;
		}
	}
	
	public boolean contains(int x, int y) {
		return this.distance(new Point(x,y)) <= 2;	
	}
	
	public boolean contains(Point p) {
		return this.distance(p) <= 2;
	}
}
