package geometry;

public class Test {

	public static void main(String[] args) {
		Point tacka1 = new Point();
		//tacka1.xCoordinate = 5;
		tacka1.setXCoordinate(5);
		tacka1.setYCoordinate(10);
		System.out.println("X kooridinata je: " + tacka1.getXCoordinate());
		System.out.println("Y koordinata je: " + tacka1.getYCoordinate());
		
		Point tacka2 = new Point();
		tacka2.setXCoordinate(2);
		tacka2.setYCoordinate(4);
		System.out.println("X kooridinata je: " + tacka2.getXCoordinate());
		System.out.println("Y koordinata je: " + tacka2.getYCoordinate());

	}

}
