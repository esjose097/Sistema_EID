package dominio;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Objects;

/**
 *
 * @author Comunidad del anillo
 */
public class MovimientoMP {

    private Integer id;
    private Calendar fecha;
    private ArrayList<ListaPedidosMat> prod;

    public MovimientoMP(Integer id, Calendar fecha, ArrayList<ListaPedidosMat> prod) {
        this.id = id;
        this.fecha = fecha;
        this.prod = prod;
    }

    public MovimientoMP(Calendar fecha, ArrayList<ListaPedidosMat> prod) {
        this.fecha = fecha;
        this.prod = prod;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public ArrayList<ListaPedidosMat> getProd() {
        return prod;
    }

    public void setProd(ArrayList<ListaPedidosMat> prod) {
        this.prod = prod;
    }

    @Override
    public int hashCode() {
        int hash = 5;
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
        final MovimientoMP other = (MovimientoMP) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "MovimientoMP{" + "id=" + id + ", fecha=" + fecha + ", prod=" + prod + '}';
    }

}
