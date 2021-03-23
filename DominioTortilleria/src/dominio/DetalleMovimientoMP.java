package dominio;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Objects;

/**
 *
 * @author Comunidad del anillo
 */

public class DetalleMovimientoMP {

    private Integer id;
    private String tipo;
    private Calendar fecha;
    private MateriaPrima materiaprima;
    private int cantidad;

    public DetalleMovimientoMP(Integer id, String tipo, Calendar fecha, MateriaPrima materiaprima, int cantidad) {
        this.id = id;
        this.tipo = tipo;
        this.fecha = fecha;
        this.materiaprima = materiaprima;
        this.cantidad = cantidad;
    }

    public DetalleMovimientoMP(String tipo, Calendar fecha, MateriaPrima materiaprima, int cantidad) {
        this.tipo = tipo;
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
        hash = 29 * hash + Objects.hashCode(this.id);
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
        final DetalleMovimientoMP other = (DetalleMovimientoMP) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DetalleMovimientoMP{" + "id=" + id + ", tipo=" + tipo + ", fecha=" + fecha + ", materiaprima=" + materiaprima + ", cantidad=" + cantidad + '}';
    }

    

}
