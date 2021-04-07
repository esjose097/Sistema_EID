package dominio;

import java.util.Calendar;
import java.util.Objects;

/**
 *
 * @author Comunidad del anillo
 */
public class DetallePedidosP //DetallePedidosP
{

    private Integer id;
    private Calendar fecha;
    private SucursalE sucursalexterno;
    private Producto producto; 
    private int cantidad;

    public DetallePedidosP(Integer id, Calendar fecha, SucursalE sucursalexterno, Producto producto, int cantidad) {
        this.id = id;
        this.fecha = fecha;
        this.sucursalexterno = sucursalexterno;
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public DetallePedidosP(Calendar fecha, SucursalE sucursalexterno, Producto producto, int cantidad) {
        this.fecha = fecha;
        this.sucursalexterno = sucursalexterno;
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public SucursalE getSucursalexterno() {
        return sucursalexterno;
    }

    public void setSucursalexterno(SucursalE sucursalexterno) {
        this.sucursalexterno = sucursalexterno;
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
        hash = 59 * hash + Objects.hashCode(this.id);
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
        final DetallePedidosP other = (DetallePedidosP) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "MovimientoP{" + "id=" + id + ", fecha=" + fecha + ", sucursalexterno=" + sucursalexterno + ", producto=" + producto + ", cantidad=" + cantidad + '}';
    }

}
