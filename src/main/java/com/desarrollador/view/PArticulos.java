package com.desarrollador.view;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class PArticulos extends JPanel {
//********** VARIABLES **********\\
	private static final long serialVersionUID = 1L;
	private DefaultTableModel modelo =new DefaultTableModel();
	private JTable tData = new JTable();
	private JButton bCrear, bModificar, bMostrar, bEliminar;
	private String[] nombresColumnas = {"CODIGO","NOMBRE","DESCRIPCION","CANTIDAD","PRECIO UNITARIO"};
	
//********** METODO CONSTRUCTOR **********\\
	public PArticulos() {
		setLayout(null);
		setBounds(0, 0, 1200, 1000);
		inicializarComponentes();
		setVisible(true);
	}
	
		
//********** COMPONENTES GRAFICOS **********\\
	public void inicializarComponentes() {

		bCrear = new JButton("Crear");
		bCrear.setBounds(20, 20, 100, 50);
		bCrear.setContentAreaFilled(false);
		add(bCrear);

		bModificar = new JButton("Modificar");
		bModificar.setBounds(130, 20, 100, 50);
		bModificar.setContentAreaFilled(false);
		add(bModificar);

		bEliminar = new JButton("Eliminar");
		bEliminar.setBounds(240, 20, 100, 50);
		bEliminar.setContentAreaFilled(false);
		add(bEliminar);

		bMostrar = new JButton("Mostrar Articulos");
		bMostrar.setBounds(350, 20, 150, 50);
		bMostrar.setContentAreaFilled(false);
		add(bMostrar);
		
		
		tData.setBounds(20,80,1150,800);
		add(tData);
		
	}
//********** METODOS **********\\
	public void limpiarCampos() {

	}
		
//********** SET & GET **********\\
	public JButton getbCrear() {
		return bCrear;
	}

	public JButton getbModificar() {
		return bModificar;
	}

	public JButton getbMostrar() {
		return bMostrar;
	}

	public JButton getbEliminar() {
		return bEliminar;
	}

	public JTable gettData() {
		return tData;
	}

	public void settData(JTable tData) {
		this.tData = tData;
	}

	public String[] getNombresColumnas() {
		return nombresColumnas;
	}

	public void setNombresColumnas(String[] nombresColumnas) {
		this.nombresColumnas = nombresColumnas;
	}

	public DefaultTableModel getModelo() {
		return modelo;
	}

	public void setModelo(DefaultTableModel modelo) {
		this.modelo = modelo;
	}
	
	//********** END **********\\

}
