package graphics;
import javax.swing.*;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.*;
import java.awt.Dimension;
import java.awt.*;

public class Event2 extends JFrame implements ActionListener {
	private JTextField t;
	private JPanel p;
	public Event2() {
		t = new JTextField(20);
		setTitle("°è»ê±â");
		setSize(200,100);
		add(t, BorderLayout.NORTH);
		p = new JPanel();
		p.setLayout(new GridLayout(4,3));
		add(p,BorderLayout.CENTER);
		for(int i = 1; i<=9;i++) {
			JButton bt = new JButton(""+i);
			bt.addActionListener(this);
			//bt.setPreferredSize(new Dimension(100,30));
			p.add(bt);
		}
		JButton b1 = new JButton("0");
		JButton b2 = new JButton("C");
		b1.addActionListener(this);
		b2.addActionListener(this);
		p.add(b1);
		p.add(b2);
		pack();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		String AC = e.getActionCommand();
		if(AC.equals("C")) {
			AC="";
		}
		t.setText(t.getText()+AC);
		
		
	}
	public static void main(String[] args) {
		Event2 E = new Event2();
	}
}
