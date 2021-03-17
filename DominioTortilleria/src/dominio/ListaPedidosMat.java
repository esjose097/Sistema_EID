/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.util.ArrayList;

public class ListaPedidosMat {

    private Subgerente subgerente;
    private ArrayList<ExistenciaMp> listaMateriaPrima;

    public ListaPedidosMat(Subgerente subgerente, ArrayList<ExistenciaMp> listaMateriaPrima) {
        this.subgerente = subgerente;
        this.listaMateriaPrima = listaMateriaPrima;
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

    @Override
    public String toString() {
        return "ListaPedidosMat{" + "subgerente=" + subgerente + ", listaMateriaPrima=" + listaMateriaPrima + '}';
    }

}
