package persistencia;

import com.mysql.cj.jdbc.PreparedStatementWrapper;
import com.mysql.cj.xdevapi.PreparableStatement;
import dominio.ExistenciaMp;
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
public class DAOExistenciaMp extends CRUD<ExistenciaMp> {

    @Override
    public void guardar(ExistenciaMp entidad) {
        try{
            Connection conexion = this.getConexion();
            Statement comando = conexion.createStatement(); 
            String sql = String.format("INSERT INTO `tortilleria`.`existenciamp` (`materiaprima`, `cantidad`) VALUES ('%s', '%s');", 
                    entidad.getMateriaprima().getId(), entidad.getCantidad());
            comando.executeUpdate(sql);
            conexion.close();
        }
        catch(SQLException ex){
            System.err.println(ex.getMessage());
        }        
    }

    @Override
    public void actualizar(ExistenciaMp entidad) {
        try{
            Connection conexion = this.getConexion();
            Statement comando = conexion.createStatement();
            String sql = String.format("UPDATE `tortilleria`.`existenciamp` SET `materiaprima` = '%s', `cantidad` = '%s' WHERE (`idexistenciamp` = '%s');",
                entidad.getMateriaprima().getId(), entidad.getCantidad(), entidad.getId());
            comando.executeUpdate(sql);
            conexion.close();
            }
        catch(SQLException ex){
            System.err.println(ex.getMessage());
        }
    }

    @Override
    public void eliminar(ExistenciaMp entidad) {
        try{
            Connection conexion = this.getConexion();
            Statement comando = conexion.createStatement();
            String sql = String.format("Delete From existenciamp where idexistenciamp = %s;",  entidad.getId());
            comando.executeUpdate(sql);
            conexion.close();
        }
        catch(SQLException ex){
            System.err.println(ex.getMessage());
        }                
    }

    @Override
    public ArrayList<ExistenciaMp> consultarTodos() {
        ArrayList<ExistenciaMp> listaEMP = new ArrayList<>();
        try{            
            Connection conexion = this.getConexion();
            Statement comando = conexion.createStatement();
            String sql = "SELECT idexistenciamp, materiaprima, cantidad FROM tortilleria.existenciamp;";
            ResultSet resultado = comando.executeQuery(sql);
            while(resultado.next())
            {                
                int id = resultado.getInt("idexistenciamp");
                int materia_Prima_Id = resultado.getInt("materiaprima");
                int cantidad = resultado.getInt("cantidad");
                MateriaPrima materiaprima = new DAOMateriaPrima().consultarUno(materia_Prima_Id +"");
                ExistenciaMp existmp = new ExistenciaMp(id, materiaprima, cantidad);
                listaEMP.add(existmp);
            }
            conexion.close();
            return listaEMP;
        }
        catch(SQLException ex){
            System.err.println(ex.getMessage());
            return listaEMP;
        }
    }

    @Override
    public ExistenciaMp consultarUno(String textoBusqueda) {
        ArrayList<ExistenciaMp> listaEMP = new ArrayList<>();
        try{            
            Connection conexion = this.getConexion();
            Statement comando = conexion.createStatement();
            String sql = "SELECT idexistenciamp, materiaprima, cantidad FROM tortilleria.existenciamp;";
            ResultSet resultado = comando.executeQuery(sql);
            while(resultado.next())
            {                
                int id = resultado.getInt("idexistenciamp");
                int materia_Prima_id = resultado.getInt("materiaprima");
                int cantidad = resultado.getInt("cantidad");
                MateriaPrima materiaprima = new DAOMateriaPrima().consultarUno(materia_Prima_id +"");
                ExistenciaMp existmp = new ExistenciaMp(id, materiaprima, cantidad);
                listaEMP.add(existmp);
            }
            conexion.close();
            for(ExistenciaMp emp : listaEMP)
            {
                String idM = emp.getId()+"";
                if(emp.getMateriaprima().getNombre().equalsIgnoreCase(textoBusqueda))
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
    
    public boolean existeExistenciaMP(String nombre){
        ArrayList<ExistenciaMp> listaEMP = consultarTodos();
        
        for (ExistenciaMp existenciaMp : listaEMP) {
            if(existenciaMp.getMateriaprima().getNombre().equalsIgnoreCase(nombre)){
                return true;
            }
        }
        return false;
    }
    
}
