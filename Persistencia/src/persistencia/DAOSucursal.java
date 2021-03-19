package persistencia;

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
public class DAOSucursal extends CRUD<Sucursal> {

    @Override
    public void guardar(Sucursal entidad) {
        try{
            Connection conexion = this.getConexion();
            Statement comando = conexion.createStatement();            
            String sql = String.format("INSERT INTO `tortilleria`.`sucursal` (`nombre`) VALUES ('%s');", 
                    entidad.getNombre());
            comando.executeUpdate(sql);
            conexion.close();
        }
        catch(SQLException ex){
            System.err.println(ex.getMessage());
        }        
    }

    @Override
    public void actualizar(Sucursal entidad) {
        try{
            Connection conexion = this.getConexion();
            Statement comando = conexion.createStatement();
            String sql = String.format("UPDATE `tortilleria`.`sucursal` SET `nombre` = '%s' WHERE (`idsucursal` = '%s');", 
                    entidad.getNombre(),entidad.getId());
            comando.executeUpdate(sql);
            conexion.close();
            }
        catch(SQLException ex){
            System.err.println(ex.getMessage());
        }
    }

    @Override
    public void eliminar(Sucursal entidad) {
        try{
            Connection conexion = this.getConexion();
            Statement comando = conexion.createStatement();
            String sql = String.format("Delete From sucursal where idsucursal = %s;",  entidad.getId());
            comando.executeUpdate(sql);
            conexion.close();
        }
        catch(SQLException ex){
            System.err.println(ex.getMessage());
        }                
    }

    @Override
    public ArrayList<Sucursal> consultarTodos() {
        ArrayList<Sucursal> listaSucursal = new ArrayList<>();
        try{            
            Connection conexion = this.getConexion();
            Statement comando = conexion.createStatement();
            String sql = "SELECT idsucursal, nombre FROM tortilleria.sucursale;";
            ResultSet resultado = comando.executeQuery(sql);
            while(resultado.next())
            {                
                int id = resultado.getInt("idsucursale");
                String nombre = resultado.getString("nombre");
                Sucursal sucursal = new Sucursal(id, nombre);
                listaSucursal.add(sucursal);
            }
            conexion.close();
            return listaSucursal;
        }
        catch(SQLException ex){
            System.err.println(ex.getMessage());
            return listaSucursal;
        }
    }

    @Override
    public Sucursal consultarUno(String textoBusqueda) {
        ArrayList<Sucursal> listaSucursal = new ArrayList<>();
        try{            
            Connection conexion = this.getConexion();
            Statement comando = conexion.createStatement();
            String sql = "SELECT idsucursal, nombre FROM tortilleria.sucursal;";
            ResultSet resultado = comando.executeQuery(sql);
            while(resultado.next())
            {                
                int id = resultado.getInt("idsucursal");
                String nombre = resultado.getString("nombre");
                Sucursal sucursal = new Sucursal(id, nombre);
                listaSucursal.add(sucursal);
            }
            conexion.close();
            for(Sucursal suc : listaSucursal)
            {
                String idE = suc.getId()+"";
                if(idE.equalsIgnoreCase(textoBusqueda))
                {
                    return suc;
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
