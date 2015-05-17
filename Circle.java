import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Circle extends JPanel{

	Calculate_Circle calculate1 = new Calculate_Circle();
	
	// Square square1 = new Square();
	
	//Four label
	JLabel label1 = new JLabel("Circle:");
	JLabel label2 = new JLabel("Radius:");//ok
	JLabel label3 = new JLabel("The area is:");
	JLabel label4 = new JLabel("The perimeter is:");
	
	JButton buttonC = new JButton("Calculate");//Calculate
	JButton buttonR = new JButton("Clear");//Remove
	
	JTextField field11 = new JTextField(10);//Radius input
	JTextField field12 = new JTextField(10);//Show area
	JTextField field13 = new JTextField(10);//Show perimeter
	
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel panel3 = new JPanel();
	 
	public Circle(){
		 // Set GridLayout, 12 rows, 4 columns, and gaps 5 between
		setLayout(new GridLayout(6, 4, 2, 2));
		
		panel1.add(label2);
		panel1.add(field11);
		panel1.add(buttonC);
		panel1.add(buttonR);
		
		panel2.add(label3);
		panel2.add(field12);
		
		panel3.add(label4);
		panel3.add(field13);
		
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
			double radius = Double.parseDouble(field11.getText());
			calculate1.setRadious(radius);
			field12.setText(String.format("%.3f", calculate1.getArea()));
			field13.setText(String.format("%.3f", calculate1.getPerimeter()));
		}
	}
	
	private class ButtonRListener implements ActionListener {
	@Override 
		public void actionPerformed(ActionEvent e) {
		// Get values from text fields
			field11.setText("");
			field12.setText("");
			field13.setText("");
		}
	}
}

class Calculate_Circle extends JPanel{
	//Circle radius
	private double radius;
	
	void setRadious(double newradius){
		radius = newradius; 
		}
	
	double getRadius(){
		return radius;
	}
	
	public double getArea(){
		//Calculate  the area
		return radius * radius * 3.141;
	}
	
	public double getPerimeter(){
		//Calculate the Perimeter
		return radius * 2 * 3.141;
	}
}
