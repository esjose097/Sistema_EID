/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import dominio.Empleado;
import dominio.ExistenciaMp;
import dominio.ListaPedidosMat;
import dominio.MateriaPrima;
import java.util.ArrayList;

/**
 *
 * @author Eliu
 */
public interface IMateriaPrima {
   public ArrayList<MateriaPrima> ObtenerMateriaPrima();
    
   public void guardarMateria(ArrayList<MateriaPrima> materia);

   public void eliminarMateria(ArrayList<MateriaPrima> materia);

   public void actualizarMateria(ArrayList<MateriaPrima> materia);

   public void agregarPedidosMateria(ArrayList<ListaPedidosMat> materia);

   public void elimnarPedidosMateria(ArrayList<ListaPedidosMat> materia);

   public Empleado obtenerEmpleado(String nombre);

   public void guardarEntrada(ArrayList<ExistenciaMp> Existencia);

   public ArrayList<ExistenciaMp> ObtenerExistencia();

   public void guardarSalida(ArrayList<ExistenciaMp> Existencia);

   public ArrayList<ListaPedidosMat> ObtenerListaPedidosMat();
   
   public ArrayList<MateriaPrima> buscarMateria(String buscar);
   
}
