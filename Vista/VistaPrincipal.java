package Vista;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class VistaPrincipal extends JFrame{
	
	private Top t;
	private Center c;
	private Bottom b;
	
	public VistaPrincipal() {
		t = new Top();
		
		c = new Center();
		
		b = new Bottom();
		
		setTitle("Login");
		setLayout(new BorderLayout());
		add(t,BorderLayout.NORTH);
		add(c,BorderLayout.CENTER);
		add(b, BorderLayout.SOUTH);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
		

	}

}
