package persistencia;

import dominio.MateriaPrima;
import java.sql.ResultSet;
import dominio.MovimientoMP;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Comunidad del anillo
 */
public class DAOMovimientoMp extends CRUD<MovimientoMP> {

    @Override
    public void guardar(MovimientoMP entidad) {
        try {
            Connection conexion = this.getConexion();
            String sql = "INSERT INTO tortilleria.movimientomp (materiaprima, tipo, fecha) VALUES (?,?,?);";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, entidad.getMateriaprima().getId());
            ps.setString(2, entidad.getTipo());
           
            java.sql.Date date = new Date(entidad.getFecha().getTimeInMillis());
            ps.setDate(3, date);
            ps.executeUpdate();
            conexion.close();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }

    }

    @Override
    public void actualizar(MovimientoMP entidad) {
        try {
            Connection conexion = this.getConexion();
            String sql = "UPDATE tortilleria.movimientomp SET materiaprima = ?, tipo = ?, fecha = ? WHERE (idmovimientomp = ?);";
            PreparedStatement ps = conexion.prepareStatement(sql);

            ps.setInt(1, entidad.getMateriaprima().getId());
            ps.setString(2, entidad.getTipo());
            java.sql.Date date = new Date(entidad.getFecha().getTimeInMillis());
            ps.setDate(3, date);
            ps.setInt(4, entidad.getId());
            ps.executeUpdate();
            conexion.close();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }

    @Override
    public void eliminar(MovimientoMP entidad) {
        try {
            Connection conexion = this.getConexion();
            String sql = "DELETE FROM tortilleria.movimientomp WHERE (idmovimientomp = ?);";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, entidad.getId());
            ps.executeUpdate();
            conexion.close();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }

    @Override
    public ArrayList<MovimientoMP> consultarTodos() {
        ArrayList<MovimientoMP> listMov = new ArrayList<>();
        try {
            Connection conexion = this.getConexion();
            String sql = "SELECT * FROM tortilleria.movimientomp;";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            CRUD<MateriaPrima> mp = new DAOMateriaPrima();

            while (rs.next()) {
                int id = rs.getInt(1);
                MateriaPrima materiaPrima = mp.consultarUno(rs.getInt(2) + "");
                String tipo = rs.getString(3);
                Calendar fecha = new GregorianCalendar();
                fecha.setTime(rs.getDate(4));
                listMov.add(new MovimientoMP(id, tipo, fecha, materiaPrima));
            }

            conexion.close();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }

        return listMov;
    }

    @Override
    public MovimientoMP consultarUno(String textoBusqueda) {
        MovimientoMP MP = null;
        try {
            Connection conexion = this.getConexion();
            String sql = "SELECT * FROM tortilleria.movimientomp WHERE idmovimientomp = ?";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, Integer.parseInt(textoBusqueda));
            ResultSet rs = ps.executeQuery();

            CRUD<MateriaPrima> mp = new DAOMateriaPrima();

            rs.next();
                int id = rs.getInt(1);
                MateriaPrima materiaPrima = mp.consultarUno(rs.getInt(2) + "");
                String tipo = rs.getString(3);
                Calendar fecha = new GregorianCalendar();
                fecha.setTime(rs.getDate(4));
                MP = new MovimientoMP(id, tipo, fecha, materiaPrima);

            conexion.close();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        
        return MP;
    }
    
    public int numeroIDMasAlto(){
        int masAlto = 0;
        try {
            Connection conexion = this.getConexion();
            String sql = "SELECT MAX(idmovimientomp) FROM tortilleria.movimientomp;";
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
