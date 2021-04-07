/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;
import dominio.DetalleMovimientoMP;
import persistencia.*;

/**
 *
 * @author La comunidad del anillo
 */
public class prueba_Conexion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // DAOMateriaPrima dMP = new DAOMateriaPrima();
//        DAOSucursal dS = new DAOSucursal();
//        DAOEmpleado dE = new DAOEmpleado();
//        DAOProducto dP = new DAOProducto();
//        DAOExistenciaP dEP = new DAOExistenciaP();
//        DAOExistenciaMp dEMP = new DAOExistenciaMp();
//        
//        MateriaPrima matP = new MateriaPrima("Harina", "HarinasFPS", "Costales");
//        
//        System.out.println(dMP.consultarTodos());
//        
//        dEMP.actualizar(new ExistenciaMp(1, new MateriaPrima(1, "Harina" , "Molino", "Costal"), 3));
//        
//        Sucursal sucursal = new Sucursal("Matriz");
//        daoS.guardar(sucursal);
//        
//        daoE.guardar(emp);
//
//        Producto p = new Producto("Frijol", "Frijoles", "1/2Litro");
//        dP.guardar(p);
//        ExistenciaP ep = new ExistenciaP(dP.consultarUno("1"), 500);
//        dEP.guardar(ep);
//        
//        ExistenciaMp emp = new ExistenciaMp(dMP.consultarUno("1"), 200);
//        dEMP.guardar(emp);
    
    //DAOMovimientoMp dmp=new DAOMovimientoMp();
    //MateriaPrima mp= dMP.consultarUno("2");
    //dmp.actualizar(new MovimientoMP("Entrada", new GregorianCalendar(),mp , 100));
//   ArrayList<MovimientoMP> mat= dmp.consultarTodos();
//    
//        for (MovimientoMP movimientoMP : mat) {
//            System.out.println(movimientoMP);
//        }

//        MovimientoMP m=  dmp.consultarUno("5");
//        dmp.eliminar(m);

        DAODetalleMovimientoMp dmp=new DAODetalleMovimientoMp();
//        System.out.println(dmp.numeroMovimientoMasAlto());

//       dmp.consultarTodos().forEach((elemento) -> {
//           System.out.println(elemento);
//       });

        
        
    }
    
}
