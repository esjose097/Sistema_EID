package persistencia;

import dominio.MateriaPrima;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Comunidad del anillo
 */
public class DAOMateriaPrima extends CRUD<MateriaPrima> {

    @Override
    public void guardar(MateriaPrima entidad) {
        try{
            Connection conexion = this.getConexion();
            Statement comando = conexion.createStatement();            
            String sql = String.format("INSERT INTO `tortilleria`.`materiaprima` (`nombre`, `distribuidora`, `unidad`) VALUES ('%s', '%s', '%s');", 
                    entidad.getNombre(), entidad.getDistribuidora(), entidad.getUnidad());
            comando.executeUpdate(sql);
            conexion.close();
        }
        catch(SQLException ex){
            System.err.println(ex.getMessage());
        }        
    }

    @Override
    public void actualizar(MateriaPrima entidad) {
        try{
            Connection conexion = this.getConexion();
            Statement comando = conexion.createStatement();
            String sql = String.format("UPDATE `tortilleria`.`materiaprima` SET `nombre` = '%s', `distribuidora` = '%s', `unidad` = '%s' WHERE (`idmateriaprima` = '%s');",
                entidad.getNombre(), entidad.getDistribuidora(), entidad.getUnidad(), entidad.getId());
            comando.executeUpdate(sql);
            conexion.close();
            }
        catch(SQLException ex){
            System.err.println(ex.getMessage());
        }
    }

    @Override
    public void eliminar(MateriaPrima entidad) {
        try{
            Connection conexion = this.getConexion();
            Statement comando = conexion.createStatement();
            String sql = String.format("Delete From materiaprima where idmateriaprima = %s;",  entidad.getId());
            comando.executeUpdate(sql);
            conexion.close();
        }
        catch(SQLException ex){
            System.err.println(ex.getMessage());
        }                
    }

    @Override
    public ArrayList<MateriaPrima> consultarTodos() {
        ArrayList<MateriaPrima> listaMatP = new ArrayList<>();
        try{            
            Connection conexion = this.getConexion();
            Statement comando = conexion.createStatement();
            String sql = "SELECT idmateriaprima, nombre, distribuidora, unidad FROM tortilleria.materiaprima;";
            ResultSet resultado = comando.executeQuery(sql);
            while(resultado.next())
            {                
                int id = resultado.getInt("idmateriaprima");
                String nombre = resultado.getString("nombre");
                String distribuidora = resultado.getString("distribuidora");
                String unidad = resultado.getString("unidad");
                MateriaPrima matP = new MateriaPrima(id, nombre, distribuidora, unidad);
                listaMatP.add(matP);
            }
            conexion.close();
            return listaMatP;
        }
        catch(SQLException ex){
            System.err.println(ex.getMessage());
            return listaMatP;
        }
    }

    @Override
    public MateriaPrima consultarUno(String textoBusqueda) {
        ArrayList<MateriaPrima> listaMatP = new ArrayList<>();
        try{            
            Connection conexion = this.getConexion();
            Statement comando = conexion.createStatement();
            String sql = "SELECT idmateriaprima, nombre, distribuidora, unidad FROM tortilleria.materiaprima;";
            ResultSet resultado = comando.executeQuery(sql);
            while(resultado.next())
            {                
                int id = resultado.getInt("idmateriaprima");
                String nombre = resultado.getString("nombre");
                String distribuidora = resultado.getString("distribuidora");
                String unidad = resultado.getString("unidad");
                MateriaPrima matP = new MateriaPrima(id, nombre, distribuidora, unidad);
                listaMatP.add(matP);
            }
            conexion.close();
            for(MateriaPrima mat : listaMatP)
            {
                String idM = mat.getId()+"";
                if(idM.equalsIgnoreCase(textoBusqueda))
                {
                    return mat;
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
