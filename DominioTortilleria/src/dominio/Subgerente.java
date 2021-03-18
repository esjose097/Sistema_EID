package dominio;

import java.util.ArrayList;

/**
 *
 * @author Comunidad del anillo
 */
public class Subgerente extends Empleado {

    public Subgerente(int id, String nombre, String userName, String pass, String puesto) {
        super(id, nombre, userName, pass, puesto);
    }

    public Subgerente(String nombre, String userName, String pass, String puesto, Sucursal sucursal) {
        super(nombre, userName, pass, puesto, sucursal);
    }

    public void generarPedidoDeMP(ArrayList<ExistenciaMp> listaMp) {

    }

    public void generarReporteDeP(ArrayList<ExistenciaP> listaP) {

    }

    public void generarReporteDeMP(ArrayList<ExistenciaMp> listaMp) {

    }

}
