package dominio;

import java.util.Objects;

/**
 *
 * @author Comunidad del anillo
 */
public class ListaPedidosMat {

    private Integer id;
    private Subgerente subgerente;
    private MateriaPrima materiaprima;
    private int cantidad;

    public ListaPedidosMat(Integer id, Subgerente subgerente, MateriaPrima materiaprima, int cantidad) {
        this.id = id;
        this.subgerente = subgerente;
        this.materiaprima = materiaprima;
        this.cantidad = cantidad;
    }

    public ListaPedidosMat(Subgerente subgerente, MateriaPrima materiaprima, int cantidad) {
        this.subgerente = subgerente;
        this.materiaprima = materiaprima;
        this.cantidad = cantidad;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Subgerente getSubgerente() {
        return subgerente;
    }

    public void setSubgerente(Subgerente subgerente) {
        this.subgerente = subgerente;
    }

    public MateriaPrima getMateriaprima() {
        return materiaprima;
    }

    public void setMateriaprima(MateriaPrima materiaprima) {
        this.materiaprima = materiaprima;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + Objects.hashCode(this.id);
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
        return "ListaPedidosMat{" + "id=" + id + ", subgerente=" + subgerente + ", materiaprima=" + materiaprima + ", cantidad=" + cantidad + '}';
    }

}
