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
    private Producto producto;
    private int cantidad;

    public ListaPedidosProd(Integer id, Subgerente subgerente, SucursalE sucursalExterna, Producto producto, int cantidad) {
        this.id = id;
        this.subgerente = subgerente;
        this.sucursalExterna = sucursalExterna;
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public ListaPedidosProd(Subgerente subgerente, SucursalE sucursalExterna, Producto producto, int cantidad) {
        this.subgerente = subgerente;
        this.sucursalExterna = sucursalExterna;
        this.producto = producto;
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

    public SucursalE getSucursalExterna() {
        return sucursalExterna;
    }

    public void setSucursalExterna(SucursalE sucursalExterna) {
        this.sucursalExterna = sucursalExterna;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.id);
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
        return "ListaPedidosProd{" + "id=" + id + ", subgerente=" + subgerente + ", sucursalExterna=" + sucursalExterna + ", producto=" + producto + ", cantidad=" + cantidad + '}';
    }

}
