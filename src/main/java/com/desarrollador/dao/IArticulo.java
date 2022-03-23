package com.desarrollador.dao;

import java.util.List;

import com.desarrollador.model.Articulo;

public interface IArticulo {
	public void registrar(Articulo a) throws Exception;

	public void modificar(Articulo a) throws Exception;

	public void eliminar(Articulo a) throws Exception;

	public List<Articulo> listar() throws Exception;
}
