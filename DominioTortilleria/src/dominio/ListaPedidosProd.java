/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.util.ArrayList;

/**
 *
 * @author Comunidad del anillo
*/

public class ListaPedidosProd {

    private Integer id;
    private Subgerente subgerente;
    private ArrayList<ExistenciaP> listaProductos;

    public ListaPedidosProd(Subgerente subgerente, ArrayList<ExistenciaP> listaProductos) {
        this.subgerente = subgerente;
        this.listaProductos = listaProductos;
    }

    public Subgerente getSubgerente() {
        return subgerente;
    }

    public void setSubgerente(Subgerente subgerente) {
        this.subgerente = subgerente;
    }

    public ArrayList<ExistenciaP> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList<ExistenciaP> listaProductos) {
        this.listaProductos = listaProductos;
    }

    @Override
    public String toString() {
        return "ListaPedidosProd{" + "subgerente=" + subgerente + ", listaProductos=" + listaProductos + '}';
    }

}
