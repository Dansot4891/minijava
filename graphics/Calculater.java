package graphics;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.temporal.TemporalUnit;

import javax.swing.*;

public class Calculater extends JFrame {

	String operand;		
	String operator;		
	
	public Calculater() {
    
  
		setSize(500, 500);				
		
		JTextField textField = new JTextField();
		
		add(textField, BorderLayout.NORTH);
		
		var panel = new JPanel( new GridLayout(4, 4) );
		
		String[] buttons = { "7", "8", "9", "-", "4", "5", "6", "+", "1", "2", "3", "*", "/", "0", "Clear", "=" };
		
		for(String button : buttons) {
			JButton btn = new JButton(button);

			btn.addActionListener(e -> {
				if (button.charAt(0) >= '0' && button.charAt(0) <= '9') {
					textField.setText(textField.getText() + button);
				}
				else if (button.equals("Clear")) {
					textField.setText("");
					operand = "";
					operator = "";
				}
				else if (button.equals("=")) {
                	//operand�� ����� ��, �� ���� �Է��� ���� ���ڿ��� LongŸ������ ��ȯ�� op1�� ����
					long op1 = Long.valueOf(operand);
                    //�ؽ�Ʈ �ʵ忡 �ִ� ���� LongŸ������ ��ȯ�� op2�� ����
					long op2 = Long.valueOf(textField.getText());
					
                    //�Է¹��� �����ڷ� �����ϱ�
                    //������ ���� textField�� setText�ϱ�
					if (operator.equals("+")) {							
						textField.setText(String.valueOf(op1 + op2));		
					} else if (operator.equals("-")) {
						textField.setText(String.valueOf(op1 - op2));						
					} else if (operator.equals("*")) {
						textField.setText(String.valueOf(op1 * op2));						
					} else if (operator.equals("/")) {
						textField.setText(String.valueOf(op1 / op2));						
					}
				}
                //������ ��ư�� ������ ���
				else {
					// ���� �Էµ� �ǿ����� ����
					operand = textField.getText();
                    //���� �Է��� �����ڸ� operator�� ����
					operator = button;
                    //���ο� �ǿ����ڸ� �Է¹ޱ� ���� textField �ʱ�ȭ
					textField.setText("");
				}	
			});
			//�̷��� ������� ��ư ��ü�� �����̳��� panel�� ��´�
			panel.add(btn);
		}// for�� end
		
		add(panel);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
    
    	//���� CalculatorFrame�� ������ ���� ��ü ����
		Calculater frame = new Calculater();
        
	}

}

