package graphics;
import javax.swing.*;
import java.awt.*;

public class FrameTest2 extends JFrame{
	public FrameTest2(){
		setTitle("MW Frame");
		setSize(500,500);
		getContentPane().setBackground(Color.green);
		setLayout(new FlowLayout());
		JButton bt1 = new JButton("1");
		JButton bt2 = new JButton("2");
		add(bt1);
		add(bt2);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		FrameTest2 f = new FrameTest2();
	}
}
