package persistencia;

import dominio.DetalleMovimientoP;
import dominio.MovimientoP;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Comunidad del anillo
 */
public class DAODetalleMovimientoP extends CRUD<DetalleMovimientoP>{

    @Override
    public void guardar(DetalleMovimientoP entidad) {
        try {
            Connection conexion = this.getConexion();
            String sql = "INSERT INTO tortilleria.detallemovimientop (movimientop, nummovimiento) VALUES (?, ?);";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, entidad.getMovimientop().getId());
            ps.setInt(2, entidad.getNumMovimiento());
            ps.executeUpdate();
            conexion.close();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }

    @Override
    public void actualizar(DetalleMovimientoP entidad) {
        try {
            Connection conexion = this.getConexion();
            String sql = "UPDATE tortilleria.detallemovimientop SET movimientop = ?, nummovimiento = ? WHERE (iddetallemovimientop = ?);";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, entidad.getMovimientop().getId());
            ps.setInt(2, entidad.getNumMovimiento());
            ps.setInt(3, entidad.getId());
            ps.executeUpdate();
            conexion.close();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }

    @Override
    public void eliminar(DetalleMovimientoP entidad) {
        try {
            Connection conexion = this.getConexion();
            String sql = "DELETE FROM tortilleria.detallemovimientop WHERE (iddetallemovimientop = ? );";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, entidad.getId());
            ps.executeUpdate();
            conexion.close();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }

    }

    @Override
    public ArrayList<DetalleMovimientoP> consultarTodos() {
        ArrayList<DetalleMovimientoP> listMP = new ArrayList();
        try {
            Connection conexion = this.getConexion();
            String sql = "SELECT * FROM tortilleria.detallemovimientop;";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            CRUD<MovimientoP> mop = new DAOMovimientoP();

            while (rs.next()) {
                int id = rs.getInt(1);
                MovimientoP movimientoP = mop.consultarUno(rs.getInt(2) + "");
                int num = rs.getInt(3);
                listMP.add(new DetalleMovimientoP(id, movimientoP, num));
            }

            conexion.close();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }

        return listMP;

    }

    @Override
    public DetalleMovimientoP consultarUno(String textoBusqueda) {
        DetalleMovimientoP detalle = null;
        try {
            Connection conexion = this.getConexion();
            String sql = "SELECT * FROM tortilleria.detallemovimientop WHERE iddetallemovimientop = ? ;";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, Integer.parseInt(textoBusqueda));
            ResultSet rs = ps.executeQuery();
            CRUD<MovimientoP> mop = new DAOMovimientoP();

            rs.next();
            int id = rs.getInt(1);
            MovimientoP movimientoP = mop.consultarUno(rs.getInt(2) + "");
            int num = rs.getInt(3);
            detalle = new DetalleMovimientoP(id, movimientoP, num);

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
            String sql = "SELECT MAX(nummovimiento) FROM tortilleria.detallemovimientop;";
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
