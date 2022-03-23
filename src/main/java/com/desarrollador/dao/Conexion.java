package com.desarrollador.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	// CREAMOS LAS VARIABLE PARA LA CONEXION HACIA LA BASE DE DATOS
	protected Connection conexion;
	//private final String JDBC_DRIVER = "com.microsoft.jdbc.sqlserver.SQLServerDriver";
	private final String connectionUrl ="jdbc:sqlserver://DESKTOP-ILJ5R4C\\SQLEXPRESS:1433;databaseName=Inventory;user=sa;password=00001234;trustServerCertificate=True";
	
	// DEFINIMOS LOS METODOS QUE NOS VAN A AYUDAR A ABRIR O CERRAR LA CONEXION
	public void conectar() throws Exception {
		try {
			conexion = DriverManager.getConnection(connectionUrl);
			//Class.forName(JDBC_DRIVER);
		} catch (Exception e) {
			throw e;
		}
	}

	public void cerrar() throws SQLException {
		if (conexion != null) {
			if (!conexion.isClosed()) {
				conexion.close();
			}
		}
	}
}
