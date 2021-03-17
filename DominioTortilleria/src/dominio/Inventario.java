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

public class Inventario {
    
    private Integer id;
    private Subgerente subgerente;
    private ArrayList<ExistenciaMp> listaMateriaPrima;
    private ArrayList<ExistenciaP> listaProductos;

    public Inventario(Subgerente subgerente, ArrayList<ExistenciaMp> listaMateriaPrima, ArrayList<ExistenciaP> listaProductos) {
        this.subgerente = subgerente;
        this.listaMateriaPrima = listaMateriaPrima;
        this.listaProductos = listaProductos;
    }

    public Subgerente getSubgerente() {
        return subgerente;
    }

    public void setSubgerente(Subgerente subgerente) {
        this.subgerente = subgerente;
    }

    public ArrayList<ExistenciaMp> getListaMateriaPrima() {
        return listaMateriaPrima;
    }

    public void setListaMateriaPrima(ArrayList<ExistenciaMp> listaMateriaPrima) {
        this.listaMateriaPrima = listaMateriaPrima;
    }

    public ArrayList<ExistenciaP> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList<ExistenciaP> listaProductos) {
        this.listaProductos = listaProductos;
    }

    @Override
    public String toString() {
        return "Inventario{" + "subgerente=" + subgerente + ", listaMateriaPrima=" + listaMateriaPrima + ", listaProductos=" + listaProductos + '}';
    }

}
