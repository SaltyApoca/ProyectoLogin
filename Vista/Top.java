package Vista;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Top extends JPanel{
	private JTextField textUser;
	private JLabel labelUser;
	
	public Top() {
		
		setLayout(new FlowLayout());
		
		labelUser = new JLabel("Usuario");
		
		textUser = new JTextField();
		textUser.setPreferredSize(new Dimension(150,25));
		
		this.add(labelUser);
		this.add(textUser);
		
		
		
	}
	
}
