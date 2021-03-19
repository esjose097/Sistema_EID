package persistencia;

import dominio.Empleado;
import dominio.Sucursal;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Comunidad del anillo
 */
public class DAOEmpleado extends CRUD<Empleado> {

    @Override
    public void guardar(Empleado entidad) {
        try{
            Connection conexion = this.getConexion();
            Statement comando = conexion.createStatement();            
            String sql = String.format("INSERT INTO `tortilleria`.`empleado` (`nombre`, `username`, `pass`, `puesto`, `sucursal`) VALUES ('%s', '%s', '%s', '%s','%s');", 
                    entidad.getNombre(), entidad.getUserName(),entidad.getPass(), entidad.getPuesto(), entidad.getSucursal().getId());
            comando.executeUpdate(sql);
            conexion.close();
        }
        catch(SQLException ex){
            System.err.println(ex.getMessage());
        }        
    }

    @Override
    public void actualizar(Empleado entidad) {
        try{
            Connection conexion = this.getConexion();
            Statement comando = conexion.createStatement();
            String sql = String.format("UPDATE `tortilleria`.`empleado` SET `nombre` = '%s', `username` = '%s', `pass` = '%s', `puesto` = '%s', `sucursal` = '%s' WHERE (`idempleado` = '%s');", 
                    entidad.getNombre(), entidad.getUserName(),entidad.getPass(), entidad.getPuesto(), entidad.getSucursal().getId(), entidad.getId());
            comando.executeUpdate(sql);
            conexion.close();
            }
        catch(SQLException ex){
            System.err.println(ex.getMessage());
        }
    }

    @Override
    public void eliminar(Empleado entidad) {
        try{
            Connection conexion = this.getConexion();
            Statement comando = conexion.createStatement();
            String sql = String.format("Delete From empleado where idempleado = %s;",  entidad.getId());
            comando.executeUpdate(sql);
            conexion.close();
        }
        catch(SQLException ex){
            System.err.println(ex.getMessage());
        }                
    }

    @Override
    public ArrayList<Empleado> consultarTodos() {
        ArrayList<Empleado> listaEmpleado = new ArrayList<>();
        try{            
            Connection conexion = this.getConexion();
            Statement comando = conexion.createStatement();
            String sql = "SELECT idempleado, nombre, username, pass, puesto, sucursal FROM tortilleria.empleado;";
            ResultSet resultado = comando.executeQuery(sql);
            while(resultado.next())
            {                
                int id = resultado.getInt("idempleado");
                String nombre = resultado.getString("nombre");
                String userName = resultado.getString("username");
                String pass = resultado.getString("pass");
                String puesto = resultado.getString("puesto");
                int idSucursal = resultado.getInt("sucursal");
                Sucursal sucursal = new DAOSucursal().consultarUno(idSucursal + "");
                Empleado emp = new Empleado(id, nombre, userName, pass, puesto, sucursal);
                listaEmpleado.add(emp);
            }
            conexion.close();
            return listaEmpleado;
        }
        catch(SQLException ex){
            System.err.println(ex.getMessage());
            return listaEmpleado;
        }
    }

    @Override
    public Empleado consultarUno(String textoBusqueda) {
        ArrayList<Empleado> listaEmpleado = new ArrayList<>();
        try{            
            Connection conexion = this.getConexion();
            Statement comando = conexion.createStatement();
            String sql = "SELECT idempleado, nombre, username, pass, puesto, sucursal FROM tortilleria.empleado;";
            ResultSet resultado = comando.executeQuery(sql);
            while(resultado.next())
            {                
                int id = resultado.getInt("idempleado");
                String nombre = resultado.getString("nombre");
                String userName = resultado.getString("username");
                String pass = resultado.getString("pass");
                String puesto = resultado.getString("puesto");
                int idSucursal = resultado.getInt("sucursal");                
                Sucursal sucursal = new DAOSucursal().consultarUno(idSucursal + "");
                Empleado emp = new Empleado(id, nombre, userName, pass, puesto, sucursal);
                listaEmpleado.add(emp);
            }
            conexion.close();
            for(Empleado emp : listaEmpleado)
            {
                String idE = emp.getId()+"";
                if(idE.equalsIgnoreCase(textoBusqueda))
                {
                    return emp;
                }
            }
            return null;
        }    
        catch(SQLException ex){
            System.err.println(ex.getMessage());
            return null;
        }
    }
}
        
