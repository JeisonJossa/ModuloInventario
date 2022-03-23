package com.desarrollador.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import com.desarrollador.dao.DAOArticuloImp;
import com.desarrollador.dao.IArticulo;
import com.desarrollador.model.Articulo;
import com.desarrollador.view.Vista;

public class Controller implements ActionListener {
	private Vista view;

	public Controller() {
		view = new Vista();
		actionListener(this);
		mouseListener(this);
	}

	private void actionListener(Controller controller) {
	//***** BOTONES LOGIN******\\
		view.getPlogin().getbIngresar().addActionListener(controller);
	//***** BOTONES PANEL ARTICULOS******\\
		view.getPArticulos().getbCrear().addActionListener(controller);
		view.getPArticulos().getbEliminar().addActionListener(controller);
		view.getPArticulos().getbModificar().addActionListener(controller);
		view.getPArticulos().getbMostrar().addActionListener(controller);
		view.getPArticulos().getbLimpiarTabla().addActionListener(controller);
		view.getPArticulos().getbExportarTabla().addActionListener(controller);
	}

	private void mouseListener(Controller controller) {

	}

	public void actionPerformed(ActionEvent event) {

//********** VALIDACION DE BOTON INGRESAR EN EL INICIO DE SESION **********\\
		if (view.getPlogin().getbIngresar() == event.getSource()) {
			view.getPlogin().setVisible(false);
			view.getPArticulos().setVisible(true);
			// view.mostrarMensajes("LOGIN_FAILURE");
		}

//************************************************************\\	
//************INICIO BOTONES PANEL ARTICULOS******************\\
//************************************************************\\		

		{
//********** BOTON CREAR ARTICULOS **********\\
			if (view.getPArticulos().getbCrear() == event.getSource()) {

			}
//********** BOTON ELIMINAR ARTICULOS **********\\
			if (view.getPArticulos().getbEliminar() == event.getSource()) {

			}
//********** BOTON MODIFICAR ARTICULOS **********\\		
			if (view.getPArticulos().getbModificar() == event.getSource()) {

			}
//********** BOTON MOSTRAR ARTICULOS **********\\	
			if (view.getPArticulos().getbMostrar() == event.getSource()) {
				view.getPArticulos().limpiarTabla();
				try {
					IArticulo dao = new DAOArticuloImp();
					List<Articulo> lista = new ArrayList<Articulo>();
					lista = dao.listar();

					view.getPArticulos().getModelo().setColumnIdentifiers(view.getPArticulos().getNombresColumnas());
					// view.getPArticulos().getModelo().addRow(view.getPArticulos().getNombresColumnas());
					// creamos un vector de objeto con una longitud del tamaño de columnas de la
					// tabla
					Object[] fila = new Object[view.getPArticulos().getModelo().getColumnCount()];
					/*
					 * Para obtener cada elemento de nuestro vector rankingAsesorPorCiudad, tenemos
					 * que crear la clase AsesorPorCiudad (supongo que ya lo tienes) con sus
					 * respectivos set y get para acceder a cada elemento
					 */
					for (int i = 0; i < lista.size(); i++) {
						fila[0] = lista.get(i).getCodigo();
						fila[1] = lista.get(i).getNombre();
						fila[2] = lista.get(i).getDescripcion();
						fila[3] = lista.get(i).getCantidad();
						fila[4] = lista.get(i).getPreciounitario();
						view.getPArticulos().getModelo().addRow(fila);// agregamos una fila a nuestro modelo de tabla
					}
					// agregamos nuestro modelo a nuestra tabla
					view.getPArticulos().gettData().setModel(view.getPArticulos().getModelo());
				} catch (Exception e) {
					System.err.println("Ha ocurrido un error!" + e.getMessage());
				}
			}
//********** BOTON LIMPIAR TABLA ARTICULOS **********\\	
			if (view.getPArticulos().getbLimpiarTabla() == event.getSource()) {
				view.getPArticulos().limpiarTabla();
			}
//********** BOTON EXPORTAR ARTICULOS **********\\		
			if (view.getPArticulos().getbExportarTabla() == event.getSource()) {

			}
		}
//************************************************************\\	
//**************FIN BOTONES PANEL ARTICULOS*******************\\
//************************************************************\\		

	}

}
