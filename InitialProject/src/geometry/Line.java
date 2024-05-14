package geometry;

import java.awt.Color;
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
	
	@Override
	public void moveTo(int x, int y) {
		//ostaviti neimplementirano
	}
	@Override
	public void moveBy(int x, int y) {
		this.startPoint.moveBy(x, y);
		this.endPoint.moveBy(x, y);
	}
	
	@Override
	public int compareTo(Object obj) {
		if(obj instanceof Line) {
			Line shapeToCompare = (Line)obj;
			return (int)(this.length() - shapeToCompare.length());
		}
		return 0;
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
		g.setColor(Color.BLACK);
		g.drawLine(startPoint.getXCoordinate(), startPoint.getYCoordinate(),
				endPoint.getXCoordinate(), endPoint.getYCoordinate());
		if(this.isSelected()) {
			g.setColor(Color.BLUE);
			g.drawRect(startPoint.getXCoordinate() - 2, startPoint.getYCoordinate() - 2,
					4, 4);
			g.drawRect(endPoint.getXCoordinate() - 2, endPoint.getYCoordinate() - 2,
					4, 4);
		}
		
	}
}
