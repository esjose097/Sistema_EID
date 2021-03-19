package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Comunidad del anillo
 * @param <T>
 */
public abstract class CRUD<T> {

    private static String CADENA_CONEXION = "jdbc:mysql://localhost/tortilleria?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private static String USUARIO = "root";
    private static String CONTRASENIA = "1234";

    protected Connection getConexion() throws SQLException {
        try {
            Connection conexion = DriverManager.getConnection(CADENA_CONEXION, USUARIO, CONTRASENIA);
            return conexion;
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            throw ex;
        }
    }

    public abstract void guardar(T entidad);

    public abstract void actualizar(T entidad);

    public abstract void eliminar(T entidad);

    public abstract ArrayList<T> consultarTodos();

    public abstract T consultarUno(String textoBusqueda);
}
