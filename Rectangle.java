/*名字:王懷謙
 *學號:U10316039
 *ex:15_10
 */
 
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Rectangle extends JPanel{

	Calculate_Rectangle calculate1 = new Calculate_Rectangle();
	
	//Four label
	JLabel label1 = new JLabel("Rectangle:");
	JLabel label2 = new JLabel("width:");
	JLabel label3 = new JLabel("length:");
	JLabel label4 = new JLabel("The area is:");
	JLabel label5 = new JLabel("The perimeter is:");
	
	JButton buttonC = new JButton("Calculate");//Calculate
	JButton buttonR = new JButton("Clear");//Remove
	
	JTextField field11 = new JTextField(10);//width input
	JTextField field12 = new JTextField(10);//length input
	JTextField field13 = new JTextField(10);//Show area
	JTextField field14 = new JTextField(10);//Show perimeter
	
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel panel3 = new JPanel();
	 
	public Rectangle(){
		 // Set GridLayout, 3 rows, 2 columns, and gaps 5 between
		setLayout(new GridLayout(4, 4, 5, 5));
		
		panel1.add(label2);
		panel1.add(field11);
		panel1.add(label3);
		panel1.add(field12);
		panel1.add(buttonC);
		panel1.add(buttonR);
		
		panel2.add(label4);
		panel2.add(field13);
		
		panel3.add(label5);
		panel3.add(field14);
		
		add(label1);
		add(panel1);
		add(panel2);
		add(panel3);
		
		buttonC.addActionListener(new ButtonCListener());
		buttonR.addActionListener(new ButtonRListener());
	}
	
	/** Handle the Compute Payment button */
	private class ButtonCListener implements ActionListener {
	@Override 
		public void actionPerformed(ActionEvent e) {
		// Get values from text fields
			double width = Double.parseDouble(field11.getText());
			double length = Double.parseDouble(field12.getText());
			calculate1.setWidth(width);
			calculate1.setLength(length);
			field13.setText(String.format("%.3f", calculate1.getArea()));
			field14.setText(String.format("%.3f", calculate1.getPerimeter()));
		}
	}
	
	private class ButtonRListener implements ActionListener {
	@Override 
		public void actionPerformed(ActionEvent e) {
		// Get values from text fields
			field11.setText("");
			field12.setText("");
			field13.setText("");
			field14.setText("");
		}
	}
}

class Calculate_Rectangle{
	//Rectangle 長 寬
	private double width;
	private double length;

	//Set width 
	void setWidth(double newwidth){
		width = newwidth; 
	}
	//Get width
	double getWidth(){
		return width;
	}
	
	//Set length
	void setLength(double newlength){
		length = newlength; 
	}
	//Get length
	double getLength(){
		return length;
	}
	
	
	double getArea(){
		//Calculate  the area
		return width * length;
	}
	
	double getPerimeter(){
		//Calculate the Perimeter
		return (width + length) * 2;
	}
}
