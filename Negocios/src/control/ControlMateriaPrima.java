package control;

import dominio.Empleado;
import dominio.ExistenciaMp;
import dominio.ListaPedidosMat;
import dominio.MateriaPrima;
import interfaces.IMateriaPrima;
import java.util.ArrayList;
import persistencia.CRUD;
import persistencia.DAOEmpleado;
import persistencia.DAOExistenciaMp;
import persistencia.DAOListaPedidosMat;
import persistencia.DAOMateriaPrima;

/**
 *
 * @author Comunidad del anillo
 */
public class ControlMateriaPrima implements IMateriaPrima {

    private CRUD crud;

    @Override
    public ArrayList<MateriaPrima> ObtenerMateriaPrima() {
        crud = new DAOMateriaPrima();

        return crud.consultarTodos();
    }

    @Override
    public void guardarMateria(ArrayList<MateriaPrima> materia) {
        crud = new DAOMateriaPrima();

        for (MateriaPrima materiaPrima : materia) {
            crud.guardar(materiaPrima);
        }

    }

    @Override
    public void eliminarMateria(ArrayList<MateriaPrima> materia) {
        crud = new DAOMateriaPrima();

        for (MateriaPrima materiaPrima : materia) {
            crud.eliminar(materiaPrima.getId());
        }

    }

    @Override
    public void actualizarMateria(ArrayList<MateriaPrima> materia) {
        crud = new DAOMateriaPrima();

        for (MateriaPrima materiaPrima : materia) {
            crud.actualizar(materiaPrima);
        }
    }

    @Override
    public void agregarPedidosMateria(ArrayList<ListaPedidosMat> materia) {
        crud = new DAOListaPedidosMat();

        for (ListaPedidosMat listaPedidosMat : materia) {
            crud.guardar(listaPedidosMat);
        }
    }

    @Override
    public void elimnarPedidosMateria(ArrayList<ListaPedidosMat> materia) {
        crud = new DAOListaPedidosMat();

        for (ListaPedidosMat listaPedidosMat : materia) {
            crud.eliminar(listaPedidosMat);
        }
    }

    @Override
    public Empleado obtenerEmpleado(String nombre) {
        crud = new DAOEmpleado();
        Empleado empleado;
        empleado = (Empleado) crud.consultarUno(nombre);

        return empleado;
    }

    @Override
    public void guardarEntrada(ArrayList<ExistenciaMp> Existencia) {
        
        DAOExistenciaMp crudextra = new DAOExistenciaMp();
        ExistenciaMp ex;
        
        for (ExistenciaMp existenciaMp : Existencia) {
            if (!crudextra.existeExistenciaMP(existenciaMp.getMateriaprima().getNombre())) {
                crudextra.guardar(existenciaMp);
            } else {
               ex = (ExistenciaMp) crudextra.consultarUno(existenciaMp.getMateriaprima().getNombre());
                   ex.setCantidad(ex.getCantidad() + existenciaMp.getCantidad());
                  crudextra.actualizar(ex);
            }

        }

    }

    @Override
    public ArrayList<ExistenciaMp> ObtenerExistencia() {
        crud = new DAOExistenciaMp();

        return crud.consultarTodos();
    }

    @Override
    public void guardarSalida(ArrayList<ExistenciaMp> Existencia) {
        DAOExistenciaMp crudextra = new DAOExistenciaMp();
        ExistenciaMp ex;
        
        for (ExistenciaMp existenciaMp : Existencia) {
               ex = (ExistenciaMp) crudextra.consultarUno(existenciaMp.getMateriaprima().getNombre());
                   ex.setCantidad(ex.getCantidad() - existenciaMp.getCantidad());
                  crudextra.actualizar(ex);
        }

    }

    @Override
    public ArrayList<ListaPedidosMat> ObtenerListaPedidosMat() {
        crud = new DAOListaPedidosMat();
        return crud.consultarTodos();
    }

}
