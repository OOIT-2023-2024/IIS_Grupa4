package geometry;

public class Rectangle {

	private Point upperLeftPoint;
	private int width;
	private int height;
	private boolean selected;
	
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
	

}
