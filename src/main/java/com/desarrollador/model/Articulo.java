package com.desarrollador.model;

public class Articulo {

	private int idArticulo;
	private String codigo;
	private String nombre;
	private String descripcion;
	private double preciounitario;
	private int cantidad;

	public Articulo() {
	}

	public Articulo(String codigo, String nombre, String descripcion, float preciounitario, int cantidad) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.preciounitario = preciounitario;
		this.cantidad = cantidad;
	}

	public int getidArticulo() {
		return idArticulo;
	}

	public void setidArticulo(int idArticulo) {
		this.idArticulo = idArticulo;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPreciounitario() {
		return preciounitario;
	}

	public void setPreciounitario(double preciounitario) {
		this.preciounitario = preciounitario;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

}
