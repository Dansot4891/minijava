package graphics;
import javax.swing.*;
import java.awt.*;

public class GuiTest extends JFrame{
	public GuiTest() {
		setTitle("New Student Riegistration");
		setSize(400,400);
		JPanel panel = new JPanel();
		add(panel);
		
		panel.add(new JLabel("Name :            "));
		panel.add(new JTextField(40));
		panel.add(new JLabel("Email Address :"));
		panel.add(new JTextField(40));
		panel.add(new JLabel("Create Password :"));
		panel.add(new JPasswordField(40));
		panel.add(new JLabel("Confirm Password :"));
		panel.add(new JPasswordField(40));
		
		panel.add(new JLabel("Country"));
		String[] coutries = { "America", "Korea", "Sweden" };
		JComboBox countryBox = new JComboBox(coutries);
		panel.add(countryBox);
		panel.add(new JButton("Submit"));
		panel.add(new JButton("Clear"));
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		GuiTest g = new GuiTest();
	}
}

