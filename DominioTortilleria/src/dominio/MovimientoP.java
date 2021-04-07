package dominio;

import java.util.Calendar;
import java.util.Objects;

/**
 *
 * @author Comunidad del anillo
 */
public class MovimientoP //MovimientoP 
{

    private Integer id;
    private String tipo;
    private Calendar fecha;
    private Producto producto;
    private int cantidad;

    public MovimientoP(Integer id, String tipo, Calendar fecha, Producto producto, int cantidad) {
        this.id = id;
        this.tipo = tipo;
        this.fecha = fecha;
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public MovimientoP(String tipo, Calendar fecha, Producto producto, int cantidad) {
        this.tipo = tipo;
        this.fecha = fecha;
        this.producto = producto;
        this.cantidad = cantidad;
    }

    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
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
        hash = 61 * hash + Objects.hashCode(this.id);
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
        final MovimientoP other = (MovimientoP) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DetalleMovimientoP{" + "id=" + id + ", tipo=" + tipo + ", fecha=" + fecha + ", producto=" + producto + ", cantidad=" + cantidad + '}';
    }

    

}
