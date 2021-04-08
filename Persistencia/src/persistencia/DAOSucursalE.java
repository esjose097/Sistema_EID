package persistencia;

import dominio.SucursalE;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Comunidad del anillo
 */
public class DAOSucursalE extends CRUD<SucursalE> {

    @Override
    public void guardar(SucursalE entidad) {
        try{
            Connection conexion = this.getConexion();
            Statement comando = conexion.createStatement();            
            String sql = String.format("INSERT INTO `tortilleria`.`sucursale` (`nombre`,`direccion`,`telefono`) VALUES ('%s','%s','%s');", 
                    entidad.getNombre(), entidad.getDireccion(), entidad.getTelefono());
            comando.executeUpdate(sql);
            conexion.close();
        }
        catch(SQLException ex){
            System.err.println(ex.getMessage());
        }        
    }

    @Override
    public void actualizar(SucursalE entidad) {
        try{
            Connection conexion = this.getConexion();
            Statement comando = conexion.createStatement();
            String sql = String.format("UPDATE `tortilleria`.`sucursale` SET `nombre` = '%s',`direccion` = '%s',`telefono` = '%s' WHERE (`idsucursale` = '%s');", 
                    entidad.getNombre(),entidad.getDireccion(),entidad.getTelefono(),entidad.getId());
            comando.executeUpdate(sql);
            conexion.close();
            }
        catch(SQLException ex){
            System.err.println(ex.getMessage());
        }
    }

    @Override
    public void eliminar(SucursalE entidad) {
        try{
            Connection conexion = this.getConexion();
            Statement comando = conexion.createStatement();
            String sql = String.format("Delete From sucursale where idsucursale = %s;",  entidad.getId());
            comando.executeUpdate(sql);
            conexion.close();
        }
        catch(SQLException ex){
            System.err.println(ex.getMessage());
        }                
    }

    @Override
    public ArrayList<SucursalE> consultarTodos() {
        ArrayList<SucursalE> listaSucursalE = new ArrayList<>();
        try{            
            Connection conexion = this.getConexion();
            Statement comando = conexion.createStatement();
            String sql = "SELECT idsucursale, nombre, direccion, telefono FROM tortilleria.sucursal;";
            ResultSet resultado = comando.executeQuery(sql);
            while(resultado.next())
            {                
                int id = resultado.getInt("idsucursal");
                String nombre = resultado.getString("nombre");
                String direccion = resultado.getString("direccion");
                String telefono = resultado.getString("telefono");
                SucursalE sucursalE = new SucursalE(id, nombre, direccion, telefono);
                listaSucursalE.add(sucursalE);
            }
            conexion.close();
            return listaSucursalE;
        }
        catch(SQLException ex){
            System.err.println(ex.getMessage());
            return listaSucursalE;
        }

    }

    @Override
    public SucursalE consultarUno(String textoBusqueda) {
        ArrayList<SucursalE> listaSucursalE = new ArrayList<>();
        try{            
            Connection conexion = this.getConexion();
            Statement comando = conexion.createStatement();
            String sql = "SELECT idsucursale, nombre, direccion, telefono FROM tortilleria.sucursal;";
            ResultSet resultado = comando.executeQuery(sql);
            while(resultado.next())
            {                
                int id = resultado.getInt("idsucursal");
                String nombre = resultado.getString("nombre");
                String direccion = resultado.getString("direccion");
                String telefono = resultado.getString("telefono");
                SucursalE sucursalE = new SucursalE(id, nombre, direccion, telefono);
                listaSucursalE.add(sucursalE);
            }
            conexion.close();
            for(SucursalE sucE : listaSucursalE)
            {
                String idSE = sucE.getId()+"";
                if(idSE.equalsIgnoreCase(textoBusqueda))
                {
                    return sucE;
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
