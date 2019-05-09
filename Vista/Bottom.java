package Vista;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Bottom extends JPanel{
	
	private JButton botonAceptar;
	private JButton botonRegistrar; 
	
	public Bottom() {
		
		setLayout(new FlowLayout());
		
		botonAceptar = new JButton("ACEPTAR");
		botonRegistrar = new JButton("REGISTRAR");

	
		this.add(botonAceptar);
		this.add(botonRegistrar);
		
	}

}
