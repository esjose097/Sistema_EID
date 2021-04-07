package dominio;

import java.util.Calendar;
import java.util.Objects;

/**
 *
 * @author Comunidad del anillo
 */
public class DetallePedidosMP //DetallePedidosMP
{

    private Integer id;
    private Calendar fecha; 
    private MateriaPrima materiaprima; 
    private int cantidad;

    public DetallePedidosMP(Calendar fecha, MateriaPrima materiaprima, int cantidad) {
        this.fecha = fecha;
        this.materiaprima = materiaprima;
        this.cantidad = cantidad;
    }
    
    public DetallePedidosMP(Integer id, Calendar fecha, MateriaPrima materiaprima, int cantidad) {
        this.id = id;
        this.fecha = fecha;
        this.materiaprima = materiaprima;
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
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.id);
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
        final DetallePedidosMP other = (DetallePedidosMP) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "MovimientoMP{" + "id=" + id + ", fecha=" + fecha + ", materiaprima=" + materiaprima + ", cantidad=" + cantidad + '}';
    }

}
