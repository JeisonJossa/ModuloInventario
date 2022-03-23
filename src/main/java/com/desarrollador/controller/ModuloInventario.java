package com.desarrollador.controller;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class ModuloInventario {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
// INGRESO DE LOS PARAMETROS DEL ARTICULO PARA REGISTRAR

		Controller controller = new Controller();

		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (UnsupportedLookAndFeelException e) {
		} catch (ClassNotFoundException e) {
		} catch (InstantiationException e) {
		} catch (IllegalAccessException e) {
		}
	}

}
