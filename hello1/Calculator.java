package hello1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.temporal.TemporalUnit;

import javax.swing.*;

public class Calculator extends JFrame {

	String operand;		
	String operator;		
	
	public Calculator() {
    
  
		setSize(500, 500);				
		
		JTextField textField = new JTextField();
		JTextField textField2 = new JTextField();
		add(textField, BorderLayout.NORTH);
		add(textField2, BorderLayout.CENTER);
		var panel = new JPanel( new GridLayout(4, 4) );
		
		String[] buttons = { "7", "8", "9", "-", "4", "5", "6", "+", "1", "2", "3", "*", "/", "0", "Clear", "=" };
		
		for(String button : buttons) {
			JButton btn = new JButton(button);

			btn.addActionListener(e ->{
				if (button.charAt(0) >= '0' && button.charAt(0) <= '9') {
					int a = Integer.parseInt(button);
					textField.setText(textField.getText()+button);
					//textField2.setText(textField2.getText()+button);
					if(textField.getText().equals("00")) {
						textField.setText("0");
					}for(int i = 1;i<=9;i++) {
						if(textField.getText().equals("0"+i)) {
							textField.setText(""+i);
						}
					}
					textField2.setText(textField.getText());
					/*if(textField2.getText().equals("00")) {
						textField2.setText("0");
					}for(int i = 1;i<=9;i++) {
						if(textField2.getText().equals("0"+i)) {
							textField2.setText(""+i);
						}
					}*/
				}
				else if (button.equals("Clear")) {
					textField.setText("");
					textField2.setText("");
					operand = "";
					operator = "";
				}
				else if (button.equals("=")) {
					long op1 = Long.valueOf(operand);
					long op2 = Long.valueOf(textField.getText());
					
					if (operator.equals("+")) {							
						textField.setText(String.valueOf(op1 + op2));
						textField2.setText(op1 + "+" + op2 + "=" + String.valueOf(op1 + op2));
					} else if (operator.equals("-")) {
						textField.setText(String.valueOf(op1 - op2));
						textField2.setText(op1 + "-" + op2 + "=" + String.valueOf(op1 - op2));
					} else if (operator.equals("*")) {
						textField.setText(String.valueOf(op1 * op2));
						textField2.setText(op1 + "*" + op2 + "=" + String.valueOf(op1 * op2));
					} else if (operator.equals("/")) {
						textField.setText(String.valueOf(op1 / op2));
						textField2.setText(op1 + "/" + op2 + "=" + String.valueOf(op1 / op2));
					}
				}
				else {
					operand = textField.getText();
					operator = button;
					textField.setText("");
					textField2.setText(textField2.getText()+button);
				}
			});
			panel.add(btn);
		}
		
		add(panel,BorderLayout.SOUTH);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		Calculator frame = new Calculator();
	}
}

