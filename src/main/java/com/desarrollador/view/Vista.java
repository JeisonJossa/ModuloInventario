package com.desarrollador.view;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Vista extends JFrame {

	private static final long serialVersionUID = 1L;
	private PLogin plogin = new PLogin();
	private PArticulos pArticulos = new PArticulos();

	public Vista() {
		setLayout(null);
		setSize(1200, 1000);
		setLocationRelativeTo(null);
		setResizable(false);
		getContentPane().setBackground(Color.white);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setDefaultLookAndFeelDecorated(true);
		setVisible(true);
		//pArticulos.setVisible(false);
		add(pArticulos);
		//add(plogin);
	}

	public void mostrarMensajes(String mensaje) {
		if (mensaje.equalsIgnoreCase("LOGIN_FAILURE")) {
			JOptionPane.showMessageDialog(null, "EL USUARIO O CONTRASEÑA INGRESADA ES ERRONEO", "INVENTORY",
					JOptionPane.WARNING_MESSAGE);
		}
	}

	public PLogin getPlogin() {
		return plogin;
	}
	public PArticulos getPArticulos() {
		return pArticulos;
	}
}
