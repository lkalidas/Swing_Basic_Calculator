package samplecode;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener{
	
	JLabel displayLabel;
	JButton num1,num2,num3,
			num4,num5,num6,
			num7,num8,num9,
			num0,div,mul,
			plus,minus,equal,
			dot,clear,backspace;
	
	public Calculator() {
		JFrame jf = new JFrame("Calculator");
		jf.setSize(500, 600);
		jf.setLayout(null);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		displayLabel = new JLabel("");
		displayLabel.setBounds(40, 20, 400, 40);
		displayLabel.setBackground(Color.gray);
		displayLabel.setOpaque(true);
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		jf.add(displayLabel);
		
		backspace = new JButton("Backspace");
	    backspace.setBounds(150, 70, 180, 80);
	    backspace.addActionListener(this);
	    jf.add(backspace);
		
		clear = new JButton("Clear");
		clear.setBounds(50, 70, 80, 80);
		clear.addActionListener(this);
		jf.add(clear);
		
		num7 = new JButton("7");
		num7.setBounds(50, 170, 80, 80);
		num7.addActionListener(this);
		jf.add(num7);
		
		num8 = new JButton("8");
		num8.setBounds(150, 170, 80, 80);
		num8.addActionListener(this);
		jf.add(num8);
		
		num9 = new JButton("9");
		num9.setBounds(250, 170, 80, 80);
		num9.addActionListener(this);
		jf.add(num9);
		
		div = new JButton("/");
		div.setBounds(350, 170, 80, 80);
		div.addActionListener(this);
		jf.add(div);
		
		num4 = new JButton("4");
		num4.setBounds(50, 270, 80, 80);
		num4.addActionListener(this);
		jf.add(num4);
		
		num5 = new JButton("5");
		num5.setBounds(150, 270, 80, 80);
		num5.addActionListener(this);
		jf.add(num5);
		
		num6 = new JButton("6");
		num6.setBounds(250, 270, 80,80);
		num6.addActionListener(this);
		jf.add(num6);
		
		mul = new JButton("*");
		mul.setBounds(350, 270, 80, 80);
		mul.addActionListener(this);
		jf.add(mul);
		
		num3 = new JButton("3");
		num3.setBounds(50, 370, 80, 80);
		num3.addActionListener(this);
		jf.add(num3);
		
		num2 = new JButton("2");
		num2.setBounds(150, 370, 80, 80);
		num2.addActionListener(this);
		jf.add(num2);
		
		num1 = new JButton("1");
		num1.setBounds(250, 370, 80, 80);
		num1.addActionListener(this);
		jf.add(num1);
		
		minus = new JButton("-");
		minus.setBounds(350, 370, 80, 80);
		minus.addActionListener(this);
		jf.add(minus);
		
		dot = new JButton(".");
		dot.setBounds(50, 470, 80, 80);
		dot.addActionListener(this);
		jf.add(dot);
		
		num0 = new JButton("0");
		num0.setBounds(150, 470, 80,80);
		num0.addActionListener(this);
		jf.add(num0);
		
		equal = new JButton("=");;
		equal.setBounds(250, 470, 80, 80);
		equal.addActionListener(this);
		jf.add(equal);
		
		plus = new JButton("+");
		plus.setBounds(350, 470, 80, 80);;
		plus.addActionListener(this);
		jf.add(plus);
		
	}
	public static void main(String[] args) {
		new Calculator();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == backspace) {
            String currentText = displayLabel.getText();
            if (currentText.length() > 0) {
                displayLabel.setText(currentText.substring(0, currentText.length() - 1));
            }
		}
		if(e.getSource()==clear) {
			displayLabel.setText("");
		}else if(e.getSource()==num7) {
		displayLabel.setText(displayLabel.getText()+"7");
		}else if(e.getSource()==num8) {
			displayLabel.setText(displayLabel.getText()+"8");
		}else if(e.getSource()==num9) {
			displayLabel.setText(displayLabel.getText()+"9");
		}else if(e.getSource()==div) {
			displayLabel.setText(displayLabel.getText()+"/");
		}else if(e.getSource()==num4) {
			displayLabel.setText(displayLabel.getText()+"4");
		}else if(e.getSource()==num5) {
			displayLabel.setText(displayLabel.getText()+"5");
		}else if(e.getSource()==num6) {
			displayLabel.setText(displayLabel.getText()+"6");
		}else if(e.getSource()==mul) {
			displayLabel.setText(displayLabel.getText()+"*");
		}else if(e.getSource()==num3) {
			displayLabel.setText(displayLabel.getText()+"3");
		}else if(e.getSource()==num2) {
			displayLabel.setText(displayLabel.getText()+"2");
		}else if(e.getSource()==num1) {
			displayLabel.setText(displayLabel.getText()+"1");
		}else if(e.getSource()==minus) {
			displayLabel.setText(displayLabel.getText()+"-");
		}else if(e.getSource()==dot) {
			displayLabel.setText(displayLabel.getText()+".");
		}else if(e.getSource()==num0) {
			displayLabel.setText(displayLabel.getText()+"0");
		}else if(e.getSource()==plus) {
			displayLabel.setText(displayLabel.getText()+"+");
		}else if(e.getSource()==equal) {
		    try {
		        String expression = displayLabel.getText(); // Get the text from the display
		        double result = evaluateExpression(expression); // Call the method to calculate
		        displayLabel.setText(String.valueOf(result)); // Show the result
		    } catch (Exception ex) {
		        displayLabel.setText("Error"); // If something goes wrong, show an error
		    }
		}
	}
	private double evaluateExpression(String expression) {
	    double result = 0;

	    // Split the expression into numbers and operators
	    String[] numbers;
	    if (expression.contains("+")) {
	        numbers = expression.split("\\+");
	        result = Double.parseDouble(numbers[0]) + Double.parseDouble(numbers[1]);
	    } else if (expression.contains("-")) {
	        numbers = expression.split("-");
	        result = Double.parseDouble(numbers[0]) - Double.parseDouble(numbers[1]);
	    } else if (expression.contains("\\*")) {
	        numbers = expression.split("\\*");
	        result = Double.parseDouble(numbers[0]) * Double.parseDouble(numbers[1]);
	    } else if (expression.contains("/")) {
	        numbers = expression.split("/");
	        result = Double.parseDouble(numbers[0]) / Double.parseDouble(numbers[1]);
	    }

	    return result;
	}


	
}	
	