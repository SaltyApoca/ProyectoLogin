package Vista;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Center extends JPanel{
	
	private JPasswordField textPass;
	private JLabel labelPass;
	
	public Center() {
		
		setLayout(new FlowLayout());
		
		labelPass = new JLabel("Password");
		
		textPass = new JPasswordField();
		textPass.setPreferredSize(new Dimension(150,25));
		
		this.add(labelPass);
		this.add(textPass);
		
		
	}

}
