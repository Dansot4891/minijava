package graphics;
import javax.swing.*;
import java.awt.*;

public class FrameTest extends JFrame {
	public FrameTest() {
		setTitle("MyFrame");
		setSize(300,150);
		setLayout(new FlowLayout());
		getContentPane().setBackground(Color.yellow);
		JButton button1 = new JButton("확인");
		JButton button2 = new JButton("취소");
		this.add(button1);
		this.add(button2);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		FrameTest f = new FrameTest();
	}
}
