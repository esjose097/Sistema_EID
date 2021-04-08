package control;

import dominio.DetalleMovimientoMP;
import dominio.Empleado;
import dominio.ExistenciaMp;
import dominio.ListaPedidosMat;
import dominio.MateriaPrima;
import dominio.MovimientoMP;
import interfaces.IMateriaPrima;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import persistencia.CRUD;
import persistencia.DAODetalleMovimientoMp;
import persistencia.DAOEmpleado;
import persistencia.DAOExistenciaMp;
import persistencia.DAOListaPedidosMat;
import persistencia.DAOMateriaPrima;
import persistencia.DAOMovimientoMp;

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
        DAOMovimientoMp crudMMP = new DAOMovimientoMp();
        DAODetalleMovimientoMp crudDMMP = new DAODetalleMovimientoMp();

        ExistenciaMp ex = null;
        MovimientoMP mmp = null;
        DetalleMovimientoMP dmmp = null;
        Calendar fecha = new GregorianCalendar();
        int ultimoNumMov = crudDMMP.numeroMovimientoMasAlto() + 1;
        int ultimoID = -1;

        for (ExistenciaMp existenciaMp : Existencia) {
            //Si no esta registrada la existenciaMP en la BD
            if (!crudextra.existeExistenciaMP(existenciaMp.getMateriaprima().getNombre())) {
                ultimoID = crudMMP.numeroIDMasAlto() + 1;
                crudextra.guardar(existenciaMp);
                mmp = new MovimientoMP(ultimoID, "Entrada", fecha, existenciaMp.getMateriaprima(), existenciaMp.getCantidad());
                crudMMP.guardar(mmp);
                dmmp = new DetalleMovimientoMP(mmp, ultimoNumMov);
                crudDMMP.guardar(dmmp);
            } //Si esta registrada la existenciaMP en la BD
            else {
                ultimoID = crudMMP.numeroIDMasAlto() + 1;
                ex = (ExistenciaMp) crudextra.consultarUno(existenciaMp.getMateriaprima().getNombre());
                ex.setCantidad(ex.getCantidad() + existenciaMp.getCantidad());
                crudextra.actualizar(ex);
                mmp = new MovimientoMP(ultimoID, "Entrada", fecha, existenciaMp.getMateriaprima(), existenciaMp.getCantidad());
                crudMMP.guardar(mmp);
                dmmp = new DetalleMovimientoMP(mmp, ultimoNumMov);
                crudDMMP.guardar(dmmp);
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
        DAOMovimientoMp crudMMP = new DAOMovimientoMp();
        DAODetalleMovimientoMp crudDMMP = new DAODetalleMovimientoMp();

        ExistenciaMp ex = null;
        MovimientoMP mmp = null;
        DetalleMovimientoMP dmmp = null;
        Calendar fecha = new GregorianCalendar();
        int ultimoNumMov = crudDMMP.numeroMovimientoMasAlto() + 1;
        int ultimoID = -1;

        for (ExistenciaMp existenciaMp : Existencia) {
            ultimoID = crudMMP.numeroIDMasAlto() + 1;
            ex = (ExistenciaMp) crudextra.consultarUno(existenciaMp.getMateriaprima().getNombre());
            ex.setCantidad(ex.getCantidad() - existenciaMp.getCantidad());
            if (ex.getCantidad() > 0) {
                crudextra.actualizar(ex);
            } else {
                // Lo borrara o lo actualizara, no se decide
                ex.setCantidad(0);
                crudextra.actualizar(ex);
            }
            mmp = new MovimientoMP(ultimoID, "Salida", fecha, existenciaMp.getMateriaprima(), existenciaMp.getCantidad());
            crudMMP.guardar(mmp);
            dmmp = new DetalleMovimientoMP(mmp, ultimoNumMov);
            crudDMMP.guardar(dmmp);
        }
    }

    @Override
    public ArrayList<ListaPedidosMat> ObtenerListaPedidosMat() {
        crud = new DAOListaPedidosMat();
        return crud.consultarTodos();
    }

    @Override
    public ArrayList<MateriaPrima> buscarMateria(String buscar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
