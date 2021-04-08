package persistencia;

import dominio.Producto;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Comunidad del anillo
 */
public class DAOProducto extends CRUD<Producto> {

    @Override
    public void guardar(Producto entidad) {
        try{
            Connection conexion = this.getConexion();
            Statement comando = conexion.createStatement();            
            String sql = String.format("INSERT INTO `tortilleria`.`producto` (`nombre`, `tipo`, `unidad`) VALUES ('%s', '%s', '%s');", 
                    entidad.getNombre(), entidad.getTipo(), entidad.getUnidad());
            comando.executeUpdate(sql);
            conexion.close();
        }
        catch(SQLException ex){
            System.err.println(ex.getMessage());
        }        
    }

    @Override
    public void actualizar(Producto entidad) {
        try{
            Connection conexion = this.getConexion();
            Statement comando = conexion.createStatement();
            String sql = String.format("UPDATE `tortilleria`.`producto` SET `nombre` = '%s', `tipo` = '%s', `unidad` = '%s' WHERE (`idproducto` = '%s');",
                entidad.getNombre(), entidad.getTipo(), entidad.getUnidad(), entidad.getId());
            comando.executeUpdate(sql);
            conexion.close();
            }
        catch(SQLException ex){
            System.err.println(ex.getMessage());
        }
    }

    @Override
    public void eliminar(Producto entidad) {
        try{
            Connection conexion = this.getConexion();
            Statement comando = conexion.createStatement();
            String sql = String.format("Delete From producto where idproducto = %s;",  entidad.getId());
            comando.executeUpdate(sql);
            conexion.close();
        }
        catch(SQLException ex){
            System.err.println(ex.getMessage());
        }                

    }

    @Override
    public ArrayList<Producto> consultarTodos() {
        ArrayList<Producto> listaP = new ArrayList<>();
        try{            
            Connection conexion = this.getConexion();
            Statement comando = conexion.createStatement();
            String sql = "SELECT idproducto, nombre, tipo, unidad FROM tortilleria.producto;";
            ResultSet resultado = comando.executeQuery(sql);
            while(resultado.next())
            {                
                int id = resultado.getInt("idproducto");
                String nombre = resultado.getString("nombre");
                String tipo = resultado.getString("tipo");
                String unidad = resultado.getString("unidad");
                Producto p = new Producto(id, nombre, tipo, unidad);
                listaP.add(p);
            }
            conexion.close();
            return listaP;
        }
        catch(SQLException ex){
            System.err.println(ex.getMessage());
            return listaP;
        }
    }

    @Override
    public Producto consultarUno(String textoBusqueda) {
        ArrayList<Producto> listaP = new ArrayList<>();
        try{            
            Connection conexion = this.getConexion();
            Statement comando = conexion.createStatement();
            String sql = "SELECT idproducto, nombre, tipo, unidad FROM tortilleria.producto;";
            ResultSet resultado = comando.executeQuery(sql);
            while(resultado.next())
            {                
                int id = resultado.getInt("idproducto");
                String nombre = resultado.getString("nombre");
                String tipo = resultado.getString("tipo");
                String unidad = resultado.getString("unidad");
                Producto p = new Producto(id, nombre, tipo, unidad);
                listaP.add(p);
            }
            conexion.close();
            for(Producto p : listaP)
            {
                String idP = p.getId()+"";
                if(idP.equalsIgnoreCase(textoBusqueda))
                {
                    return p;
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
