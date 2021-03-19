package persistencia;

import dominio.Subgerente;
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
public class DAOSubgerente extends CRUD<Subgerente> {

    @Override
    public void guardar(Subgerente entidad) {
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
    public void actualizar(Subgerente entidad) {
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
    public void eliminar(Subgerente entidad) {
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
    public ArrayList<Subgerente> consultarTodos() {
        ArrayList<Subgerente> listaSubG = new ArrayList<>();
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
                Subgerente subG = new Subgerente(id, nombre, userName, pass, puesto, sucursal);
                listaSubG.add(subG);
            }
            conexion.close();
            return listaSubG;
        }
        catch(SQLException ex){
            System.err.println(ex.getMessage());
            return listaSubG;
        }

    }

    @Override
    public Subgerente consultarUno(String textoBusqueda) {
        ArrayList<Subgerente> listaSubG = new ArrayList<>();
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
                Subgerente subG = new Subgerente(id, nombre, userName, pass, puesto, sucursal);
                listaSubG.add(subG);
            }
            conexion.close();
            for(Subgerente subG : listaSubG)
            {
                String idSubG = subG.getId()+"";
                if(idSubG.equalsIgnoreCase(textoBusqueda))
                {
                    return subG;
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
