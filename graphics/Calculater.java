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
                	//operand에 저장된 수, 즉 전에 입력한 숫자 문자열을 Long타입으로 변환해 op1에 저장
					long op1 = Long.valueOf(operand);
                    //텍스트 필드에 있는 값을 Long타입으로 변환해 op2에 저장
					long op2 = Long.valueOf(textField.getText());
					
                    //입력받은 연산자로 연산하기
                    //연산한 값을 textField에 setText하기
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
                //연산자 버튼을 눌렀을 경우
				else {
					// 현재 입력된 피연산자 저장
					operand = textField.getText();
                    //지금 입력한 연산자를 operator에 저장
					operator = button;
                    //새로운 피연산자를 입력받기 위해 textField 초기화
					textField.setText("");
				}	
			});
			//이렇게 만들어진 버튼 객체를 컨테이너인 panel에 담는다
			panel.add(btn);
		}// for문 end
		
		add(panel);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
    
    	//위의 CalculatorFrame의 정보를 가진 객체 생성
		Calculater frame = new Calculater();
        
	}

}

