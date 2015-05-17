import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;


public class TestGeometrics extends JPanel{
	/** Main method */
	public static void main(String[] args){

		JFrame frame = new JFrame();
		JPanel panel = new JPanel();

		Circle circle1 = new Circle();
		Square square1 = new Square();
		Rectangle Rectangle1 = new Rectangle();


		frame.setTitle("U10316039_Geometric");
		
		panel.add(circle1);
		panel.add(square1);
		panel.add(Rectangle1);
		
		frame.add(panel);

		frame.pack();
		frame.setLocationRelativeTo(null); // Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
