package persistencia;

import dominio.MateriaPrima;
import dominio.MovimientoMP;
import dominio.MovimientoP;
import dominio.Producto;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Comunidad del anillo
 */
public class DAOMovimientoP extends CRUD<MovimientoP> {

    @Override
    public void guardar(MovimientoP entidad) {
        try {
            Connection conexion = this.getConexion();
            String sql = "INSERT INTO `tortilleria`.`movimientop` (`producto`, `tipo`, `fecha`, `cantidad`) VALUES (?,?,?,?);";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, entidad.getProducto().getId());
            ps.setString(2, entidad.getTipo());           
            java.sql.Date date = new Date(entidad.getFecha().getTimeInMillis());
            ps.setDate(3, date);
            ps.setInt(4, entidad.getCantidad());
            ps.executeUpdate();
            conexion.close();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }

    @Override
    public void actualizar(MovimientoP entidad) {
        try {
            Connection conexion = this.getConexion();
            String sql = "UPDATE tortilleria.movimientop SET producto = ?, tipo = ?, fecha = ?, cantidad = ? WHERE (idmovimientop = ?);";
            PreparedStatement ps = conexion.prepareStatement(sql);

            ps.setInt(1, entidad.getProducto().getId());
            ps.setString(2, entidad.getTipo());
            java.sql.Date date = new Date(entidad.getFecha().getTimeInMillis());
            ps.setDate(3, date);
            ps.setInt(4, entidad.getCantidad());
            ps.setInt(5, entidad.getId());
            ps.executeUpdate();
            conexion.close();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }

    @Override
    public void eliminar(MovimientoP entidad) {
        try {
            Connection conexion = this.getConexion();
            String sql = "DELETE FROM tortilleria.movimientop WHERE (idmovimientomp = ?);";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, entidad.getId());
            ps.executeUpdate();
            conexion.close();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }

    @Override
    public ArrayList<MovimientoP> consultarTodos() {
        ArrayList<MovimientoP> listMovP = new ArrayList<>();
        try {
            Connection conexion = this.getConexion();
            String sql = "SELECT * FROM tortilleria.movimientop;";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            CRUD<Producto> dp = new DAOProducto();

            while (rs.next()) 
            {
                int id = rs.getInt(1);
                Producto producto = dp.consultarUno(rs.getInt(2) + "");
                String tipo = rs.getString(3);
                Calendar fecha = new GregorianCalendar();
                fecha.setTime(rs.getDate(4));
                int cant = rs.getInt(5);
                listMovP.add(new MovimientoP(id, tipo, fecha, producto, cant));
            }

            conexion.close();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }

        return listMovP;

    }

    @Override
    public MovimientoP consultarUno(String textoBusqueda) {
        MovimientoP mmp = null;
        try {
            Connection conexion = this.getConexion();
            String sql = "SELECT * FROM tortilleria.movimientop WHERE idmovimientop = ?";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, Integer.parseInt(textoBusqueda));
            ResultSet rs = ps.executeQuery();

            CRUD<Producto> cp = new DAOProducto();

            rs.next();
                int id = rs.getInt(1);
                Producto producto = cp.consultarUno(rs.getInt(2) + "");
                String tipo = rs.getString(3);
                Calendar fecha = new GregorianCalendar();
                fecha.setTime(rs.getDate(4));
                int cant = rs.getInt(5);
                mmp = new MovimientoP(id, tipo, fecha, producto, cant);

            conexion.close();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }        
        return mmp;
    }

}
