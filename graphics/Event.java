package graphics;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Event extends JFrame {
    private JTextField inputSpace;  //ȭ���� JTextField�� ����
    private ArrayList<String> equation = new ArrayList<String>();   //������� �����ϱ� ���� ArrayList�� ���ڿ� ���� ��ȣ�� �ϳ��� ���п� ����ֱ�
    private String num ="";

    public JTextField getInputSpace() {
        return inputSpace;
    }

    public void setInputSpace(JTextField inputSpace) {
        this.inputSpace = inputSpace;
    }

    public Event() {
        setLayout(null);    //��ġ ������ ������ ������� �����ſ���.

        inputSpace = new JTextField();
        inputSpace.setEditable(false);
        inputSpace.setHorizontalAlignment(JTextField.CENTER);
        inputSpace.setBounds(0, 0, 300, 100);

        JPanel buttonPanel = new JPanel();//��ư���� ���� �г� ����
        buttonPanel.setLayout(new GridLayout(4, 4, 2, 2));
        buttonPanel.setBounds(0, 100, 300, 280);

        String[] buttonOrder = {"C", "/", "x", "=", "7", "8", "9", "+", "4", "5", "6", "-", "1", "2", "3", "0"};
        JButton[] buttons = new JButton[buttonOrder.length];

        for (int i = 0; i < buttonOrder.length; i++) {
            buttons[i] = new JButton(buttonOrder[i]);
            
            buttons[i].setFont(new Font("ITALIC", Font.BOLD, 25));

            if (buttonOrder[i] == "C") {
                buttons[i].setBackground(new Color(0xFF9300));
                buttons[i].setOpaque(true);
            } else if ((i >= 4 && i <= 6) || (i >= 8 && i <= 10) || (i >= 12 && i <= 14)) {
                buttons[i].setBackground(Color.black);
                buttons[i].setOpaque(true);
            } else {
                buttons[i].setBackground(Color.gray);
                buttons[i].setOpaque(true);
            }

            buttons[i].setForeground(Color.white);
            buttons[i].setOpaque(true);   //�ؽ�Ʈ ��
            buttons[i].setBorderPainted(false);
            buttons[i].setOpaque(true);
            buttons[i].addActionListener(new PadActionListener());

            buttonPanel.add(buttons[i]); //buttonPanel�� buttons �迭 �ֱ�
        }

        add(inputSpace);    //�����ӿ� �ؽ�Ʈ��Ʈ �ֱ�
        add(buttonPanel);   //�����ӿ� �����г� �ֱ�

        setTitle("����");    //â������
        setVisible(true);   //â�� ���̱� ����
        setSize(300, 400);   //â�� ������
        setLocationRelativeTo(null);    //ȭ�� ����� ����
        setResizable(true);    //������ ���� �Ұ����ϰ� �ϱ�
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //â�� ���� �� ���α׷� ���� ��
    }
        class PadActionListener implements ActionListener{//���� ��ư�� �׼� �����ʸ� �ٿ��� ��� �߰��ϱ�
            @Override
            public void actionPerformed(ActionEvent e) {
                String operation =e.getActionCommand(); //� ��ư�� ���ȴ��� Ȯ��

                if(operation.equals("C")){
                    inputSpace.setText(""); //"C"�� ������ �� �ʱ�ȭ��Ű��
                }else if(operation.equals("=")){    //��갪�� �������� ���ֱ�
                    String result = Double.toString(calculate(inputSpace.getText()));
                    inputSpace.setText("" + result);
                    num ="";
                }else{
                    inputSpace.setText(inputSpace.getText()+e.getActionCommand());  //������ ��ư�� ������ �� ���Ŀ� �߰��ǵ��� �ϱ�(�̺�Ʈ�� �߻���Ų ��ü�� ���ڿ��� �����´� )
                }
            }
        }

    private void fullTextParsing(String inputText) { //��� ����� ����, ArrayList�� ���ڿ� ���� ��ȣ�� �ϳ��� ���.
        equation.clear();  //������ �迭�� ��� null�� �ʱ�ȭ�ϰ� size�� 0���� �����մϴ�.
        for (int i = 0; i < inputText.length(); i++) {
            char ch = inputText.charAt(i);

            if (ch == '-' | ch == '+' | ch == 'x' | ch == '/') {
                equation.add(num);
                num = "";   //num�� �ʱ�ȭ
                equation.add(ch + ""); //��Ģ�����ȣ�� ArrayList�� �߰�.
            } else {
                num = num + ch; //������ ��쿡�� num �� �����ֱ�.
            }
        }
        equation.add(num); //�ݺ����� ������ �������� �ִ� num�� ArrayList�� �߰�
    }
        public double calculate(String inputText) {
            fullTextParsing(inputText);

            double prev = 0;
            double current = 0;
            String mode = "";   //mode��� ������ �����Ͽ� ���� ��ȣ�� ���� ó��

            for (String s : equation) {
                if (s.equals("+")) {
                    mode = "add";
                } else if (s.equals("-")) {
                    mode = "sub";
                } else if (s.equals("x")) {
                    mode = "mul";
                } else if (s.equals("/")) {
                    mode = "div";
                } else {
                    current = Double.parseDouble(s);    //������ ��쿡�� ���ڿ��� dobule������
                    if (mode == "add") {
                        prev += current;    //prev�� ��� ��갪�� ���ŵǾ� ����
                    } else if (mode == "sub") {
                        prev -= current;
                    } else if (mode == "mul") {
                        prev *= current;
                    } else if (mode == "div") {
                        prev /= current;
                    } else {
                        prev = current;
                    }
                }
            }
            return prev;    //��갪 ��ȯ
    }

    public static void main(String[] args) {
        Event e = new Event();

    }
}
