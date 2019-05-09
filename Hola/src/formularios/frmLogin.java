package formularios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import bean.Usuario;
import mantenimientos.GestionUsuario;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmLogin extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JPasswordField txtContraseña;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmLogin frame = new frmLogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public frmLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setBounds(100, 81, 64, 14);
		contentPane.add(lblUsuario);

		JLabel lblContrasea = new JLabel("Contrase\u00F1a:");
		lblContrasea.setBounds(100, 110, 85, 14);
		contentPane.add(lblContrasea);

		txtUsuario = new JTextField();
		txtUsuario.setBounds(200, 78, 106, 20);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);

		txtContraseña = new JPasswordField();
		txtContraseña.setBounds(200, 107, 106, 20);
		contentPane.add(txtContraseña);

		JButton btnSalir = new JButton("Registrar");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				salir();
			}
		});
		btnSalir.setBounds(210, 177, 106, 23);
		contentPane.add(btnSalir);

		JButton btnIngresar = new JButton("ACEPTAR");
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ingresar();
			}
		});
		btnIngresar.setBounds(80, 177, 89, 23);
		contentPane.add(btnIngresar);
	}

	protected void ingresar() {

		String usuario = txtUsuario.getText();
		String clave = String.valueOf(txtContraseña.getPassword());

		GestionUsuario gestionUsuario = new GestionUsuario();

		Usuario usuario2 = new Usuario();
		usuario2.setUsuario(usuario);
		usuario2.setClave(clave);

		Usuario usu = gestionUsuario.obtenerUsuario(usuario2);

		if (usu != null) {
			JOptionPane.showMessageDialog(contentPane, "Bienvenido");

			this.dispose();
			
			frmBienvenida bienvenida = new frmBienvenida();
			bienvenida.setVisible(true);

		} else {
			JOptionPane.showMessageDialog(contentPane, "Datos invalidos", "Error", JOptionPane.ERROR_MESSAGE);
		}

	}

	protected void salir() {
		System.exit(0);
	}
}
