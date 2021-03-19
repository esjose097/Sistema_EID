package dominio;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Comunidad del anillo
 */
public class ListaPedidosProd {

    private Integer id;
    private Subgerente subgerente;
    private SucursalE sucursalExterna; // <-
    private ArrayList<ExistenciaP> listaProductos;

    public ListaPedidosProd(Integer id, Subgerente subgerente, SucursalE sucursalExterna, ArrayList<ExistenciaP> listaProductos) {
        this.id = id;
        this.subgerente = subgerente;
        this.sucursalExterna = sucursalExterna;
        this.listaProductos = listaProductos;
    }

    public ListaPedidosProd(Subgerente subgerente, SucursalE sucursalExterna, ArrayList<ExistenciaP> listaProductos) {
        this.subgerente = subgerente;
        this.sucursalExterna = sucursalExterna;
        this.listaProductos = listaProductos;
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

    public SucursalE getSucursalExterna() {
        return sucursalExterna;
    }

    public void setSucursalExterna(SucursalE sucursalExterna) {
        this.sucursalExterna = sucursalExterna;
    }

    public ArrayList<ExistenciaP> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList<ExistenciaP> listaProductos) {
        this.listaProductos = listaProductos;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.id);
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
        final ListaPedidosProd other = (ListaPedidosProd) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ListaPedidosProd{" + "id=" + id + ", subgerente=" + subgerente + ", sucursalExterna=" + sucursalExterna + ", listaProductos=" + listaProductos + '}';
    }

}
