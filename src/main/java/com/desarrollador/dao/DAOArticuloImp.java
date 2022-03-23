package com.desarrollador.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.desarrollador.model.Articulo;

public class DAOArticuloImp extends Conexion implements IArticulo {
	@Override
	public void registrar(Articulo a) throws Exception {
		try {
			this.conectar();
			PreparedStatement ps = this.conexion.prepareStatement(
					"insert into articulo (Codigo,Nombre,Descripcion,PrecioUnitario,Cantidad) values (?,?,?,?,?);");
			ps.setString(1, a.getCodigo());
			ps.setString(2, a.getNombre());
			ps.setString(3, a.getDescripcion());
			ps.setDouble(4, a.getPreciounitario());
			ps.setInt(5, a.getCantidad());
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			this.cerrar();
		}
	}

	@Override
	public void modificar(Articulo a) throws Exception {
		try {
			this.conectar();
			PreparedStatement ps = this.conexion.prepareStatement(
					"update articulo set Codigo=?,Nombre=?,Descripcion=?,PrecioUnitario=?,Cantidad=? where idarticulo=?");
			ps.setString(1, a.getCodigo());
			ps.setString(2, a.getNombre());
			ps.setString(3, a.getDescripcion());
			ps.setDouble(4, a.getPreciounitario());
			ps.setInt(5, a.getCantidad());
			ps.setInt(6, a.getidArticulo());
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			this.cerrar();
		}
	}

	@Override
	public void eliminar(Articulo a) throws Exception {
		try {
			this.conectar();
			PreparedStatement ps = this.conexion.prepareStatement("delete articulo where idarticulo=?");
			ps.setInt(1, a.getidArticulo());
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			this.cerrar();
		}
	}

	@Override
	public List<Articulo> listar() throws Exception {
		List<Articulo> lista = null;
		try {
			this.conectar();
			PreparedStatement ps = this.conexion.prepareStatement("select * from articulo");
			lista = new ArrayList<Articulo>();
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Articulo a = new Articulo();
				a.setidArticulo(rs.getInt("IdArticulo"));
				a.setCodigo(rs.getString("Codigo"));
				a.setNombre(rs.getString("Nombre"));
				a.setDescripcion(rs.getString("Descripcion"));
				a.setPreciounitario(rs.getDouble("PrecioUnitario"));
				a.setCantidad(rs.getInt("Cantidad"));
				lista.add(a);
			}
			rs.close();
			ps.close();
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			this.cerrar();
		}
		return lista;
	}
}
