/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import dominio.DetalleMovimientoMP;
import dominio.MovimientoMP;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Comunidad del anillo
 */
public class DAODetalleMovimientoMp extends CRUD<DetalleMovimientoMP> {

    @Override
    public void guardar(DetalleMovimientoMP entidad) {
        try {
            Connection conexion = this.getConexion();
            String sql = "INSERT INTO tortilleria.detallemovimientomp (movimientomp, nummovimiento) VALUES (?, ?);";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, entidad.getMovimientomp().getId());
            ps.setInt(2, entidad.getNumMovimiento());
            ps.executeUpdate();
            conexion.close();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }

    @Override
    public void actualizar(DetalleMovimientoMP entidad) {
        try {
            Connection conexion = this.getConexion();
            String sql = "UPDATE tortilleria.detallemovimientomp SET movimientomp = ?, nummovimiento = ? WHERE (iddetallemovimientomp = ?);";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, entidad.getMovimientomp().getId());
            ps.setInt(2, entidad.getNumMovimiento());
            ps.setInt(3, entidad.getId());
            ps.executeUpdate();
            conexion.close();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }

    @Override
    public void eliminar(DetalleMovimientoMP entidad) {
        try {
            Connection conexion = this.getConexion();
            String sql = "DELETE FROM tortilleria.detallemovimientomp WHERE (iddetallemovimientomp = ? );";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, entidad.getId());
            ps.executeUpdate();
            conexion.close();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }

    @Override
    public ArrayList<DetalleMovimientoMP> consultarTodos() {
        ArrayList<DetalleMovimientoMP> listMP = new ArrayList();
        try {
            Connection conexion = this.getConexion();
            String sql = "SELECT * FROM tortilleria.detallemovimientomp;";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            CRUD<MovimientoMP> mp = new DAOMovimientoMp();

            while (rs.next()) {
                int id = rs.getInt(1);
                MovimientoMP movimiento = mp.consultarUno(rs.getInt(2) + "");
                int num = rs.getInt(3);
                listMP.add(new DetalleMovimientoMP(id, movimiento, num));
            }

            conexion.close();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }

        return listMP;
    }

    @Override
    public DetalleMovimientoMP consultarUno(String textoBusqueda) {
        DetalleMovimientoMP detalle = null;
        try {
            Connection conexion = this.getConexion();
            String sql = "SELECT * FROM tortilleria.detallemovimientomp WHERE iddetallemovimientomp = ? ;";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, Integer.parseInt(textoBusqueda));
            ResultSet rs = ps.executeQuery();
            CRUD<MovimientoMP> mp = new DAOMovimientoMp();

            rs.next();
            int id = rs.getInt(1);
            MovimientoMP movimiento = mp.consultarUno(rs.getInt(2) + "");
            int num = rs.getInt(3);
            detalle = new DetalleMovimientoMP(id, movimiento, num);

            conexion.close();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }

        return detalle;
    }
    
    public int numeroMovimientoMasAlto() {
        int masAlto = 0;
        try {
            Connection conexion = this.getConexion();
            String sql = "SELECT MAX(nummovimiento) FROM tortilleria.detallemovimientomp;";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            rs.next();
            masAlto = rs.getInt(1);
            conexion.close();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return masAlto;
    }

}
