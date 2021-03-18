package dominio;

import java.util.ArrayList;

/**
 *
 * @author Comunidad del anillo
 */
public class ListaPedidosMat {

    private Integer id;
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
