package persistencia;

import dominio.ExistenciaP;
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
public class DAOExistenciaP extends CRUD<ExistenciaP> {

    @Override
    public void guardar(ExistenciaP entidad) {
        try{
            Connection conexion = this.getConexion();
            Statement comando = conexion.createStatement();            
            String sql = String.format("INSERT INTO `tortilleria`.`existenciaP` (`producto`, `cantidad`) VALUES ('%s', '%s');", 
                    entidad.getProducto().getId(), entidad.getCantidad());
            comando.executeUpdate(sql);
            conexion.close();
        }
        catch(SQLException ex){
            System.err.println(ex.getMessage());
        }        
    }

    @Override
    public void actualizar(ExistenciaP entidad) {
        try{
            Connection conexion = this.getConexion();
            Statement comando = conexion.createStatement();
            String sql = String.format("UPDATE `tortilleria`.`existenciap` SET `producto` = '%s', `cantidad` = '%s' WHERE (`idexistenciap` = '%s');",
                entidad.getProducto().getId(), entidad.getCantidad(),entidad.getId());
            comando.executeUpdate(sql);
            conexion.close();
            }
        catch(SQLException ex){
            System.err.println(ex.getMessage());
        }
    }

    @Override
    public void eliminar(ExistenciaP entidad) {
        try{
            Connection conexion = this.getConexion();
            Statement comando = conexion.createStatement();
            String sql = String.format("Delete From existenciap where idexistenciap = %s;",  entidad.getId());
            comando.executeUpdate(sql);
            conexion.close();
        }
        catch(SQLException ex){
            System.err.println(ex.getMessage());
        }                
    }

    @Override
    public ArrayList<ExistenciaP> consultarTodos() {
        ArrayList<ExistenciaP> listaEXP = new ArrayList<>();
        try{            
            Connection conexion = this.getConexion();
            Statement comando = conexion.createStatement();
            String sql = "SELECT idexistenciap, producto, cantidad FROM tortilleria.existenciap;";
            ResultSet resultado = comando.executeQuery(sql);
            while(resultado.next())
            {                
                int id = resultado.getInt("idexistenciap");
                int id_producto = resultado.getInt("producto");
                int cantidad = resultado.getInt("cantidad");                
                Producto producto = new DAOProducto().consultarUno(id_producto+"");
                ExistenciaP exp = new ExistenciaP(id, producto, cantidad);
                listaEXP.add(exp);
            }
            conexion.close();
            return listaEXP;
        }
        catch(SQLException ex){
            System.err.println(ex.getMessage());
            return listaEXP;
        }
    }

    @Override
    public ExistenciaP consultarUno(String textoBusqueda) {
        ArrayList<ExistenciaP> listaEXP = new ArrayList<>();
        try{            
            Connection conexion = this.getConexion();
            Statement comando = conexion.createStatement();
            String sql = "SELECT idexistenciap, producto, cantidad FROM tortilleria.existenciap;";
            ResultSet resultado = comando.executeQuery(sql);
            while(resultado.next())
            {                
                int id = resultado.getInt("idexistenciap");
                int id_producto = resultado.getInt("producto");
                int cantidad = resultado.getInt("cantidad");                
                Producto producto = new DAOProducto().consultarUno(id_producto+"");
                ExistenciaP exp = new ExistenciaP(id, producto, cantidad);
                listaEXP.add(exp);
            }
            conexion.close();
            for(ExistenciaP ep : listaEXP)
            {
                String idEP = ep.getId()+"";
                if(idEP.equalsIgnoreCase(textoBusqueda))
                {
                    return ep;
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
