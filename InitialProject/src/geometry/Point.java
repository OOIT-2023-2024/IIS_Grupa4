package geometry;

public class Point {

	private int xCoordinate;
	private int yCoordinate;
	private boolean selected;
	
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
	
	
}
