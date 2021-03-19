package dominio;

import java.util.ArrayList;
import java.util.Objects;

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
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ListaPedidosMat other = (ListaPedidosMat) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ListaPedidosMat{" + "subgerente=" + subgerente + ", listaMateriaPrima=" + listaMateriaPrima + '}';
    }

}
