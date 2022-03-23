package com.desarrollador.view;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class PLogin extends JPanel {

	private static final long serialVersionUID = 1L;

	private JLabel lusuario, lclave;
	private JTextField usuario;
	private JPasswordField clave;
	private JButton bIngresar;

	public PLogin() {
		setLayout(null);
		setBounds(0, 0, 1200, 1000);
		inicializarComponentes();
		setVisible(true);
	}

	public void inicializarComponentes() {

		lusuario = new JLabel("Usuario :");
		lusuario.setBounds(500, 400, 150, 30);
		lusuario.setFont(new Font("Accidental Presidency", Font.BOLD, 16));
		add(lusuario);

		lclave = new JLabel("Contraseña :");
		lclave.setBounds(500, 440, 150, 30);
		lclave.setFont(new Font("Accidental Presidency", Font.BOLD, 16));
		add(lclave);

		usuario = new JTextField();
		usuario.setFont(new Font("Accidental Presidency", Font.BOLD, 16));
		usuario.setBounds(650, 400, 250, 30);
		add(usuario);

		clave = new JPasswordField();
		clave.setBounds(650, 440, 250, 30);
		add(clave);

		bIngresar = new JButton("Ingresar");
		bIngresar.setBounds(650, 480, 100, 50);
		bIngresar.setContentAreaFilled(false);
		add(bIngresar);
	}

	public void limpiarCampos() {
		usuario.setText("");
		clave.setText("");
	}

	// COMIENCO SETTERS Y GETTERS

	public JTextField getUsuario() {
		return usuario;
	}

	public JPasswordField getClave() {
		return clave;
	}

	public JButton getbIngresar() {
		return bIngresar;
	}

}
