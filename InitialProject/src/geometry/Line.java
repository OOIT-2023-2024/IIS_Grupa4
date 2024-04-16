package geometry;

import java.awt.Graphics;

public class Line extends Shape {

	private Point startPoint;
	private Point endPoint;
		
	// konstruktori
	public Line() {
		
	}
	public Line(Point sP, Point eP) {
		startPoint = sP;
		endPoint = eP;
	}
	public Line(Point sP, Point eP, boolean selected) {
		this(sP,eP); 
		setSelected(selected);
	}
	// metode pristupa
	public Point getStartPoint() {
		return startPoint;
	}
	public void setStartPoint(Point startPoint) {
		this.startPoint = startPoint;
	}
	
	public Point getEndPoint() {
		return endPoint;
	}
	public void setEndPoint(Point endPoint) {
		this.endPoint = endPoint;
	}
	public double length() {
		return startPoint.distance(endPoint);
	}
	public String toString() {
		// (xStart, yStart) -- > (xEnd, yEnd)
		return startPoint + "-->" + endPoint;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Line) {
			Line pomocna = (Line)obj;
			if (this.startPoint == pomocna.startPoint &&
					this.endPoint == pomocna.endPoint)
				return true;
			else 
				return false;
		} else 
			return false;
	}
	
	public boolean contains(int x, int y) {
		return this.getStartPoint().distance(new Point(x,y))
				+ this.getEndPoint().distance(new Point(x,y)) 
				- this.length() <=2 ;
	}
	@Override
	public void draw(Graphics g) {
		g.drawLine(startPoint.getXCoordinate(), startPoint.getYCoordinate(),
				endPoint.getXCoordinate(), endPoint.getYCoordinate());
		
	}
}
