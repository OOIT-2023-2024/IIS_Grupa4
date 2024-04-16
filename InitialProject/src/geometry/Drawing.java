package geometry;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Drawing extends JPanel {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Drawing Grupa 4");
		frame.setSize(800, 600);
		Drawing crtez = new Drawing();
		frame.getContentPane().add(crtez);
		frame.setVisible(true);
	}
	public Drawing() {
		
	}
	public void paint(Graphics g) {
		Point p1 = new Point(30,60);
		p1.draw(g);
		
		g.setColor(Color.MAGENTA);
		Line l1 = new Line(new Point(50,70), new Point(90,150));
		l1.draw(g);
		
		Circle c1 = new Circle(new Point(150,150), 70);
		c1.draw(g);
		
		g.setColor(Color.BLUE);
		Donut d1 = new Donut(new Point(350,350), 60, 30);
		d1.draw(g);
		
		Rectangle r1 = new Rectangle(new Point(300, 30), 70, 40);
		r1.draw(g);
	}

}
