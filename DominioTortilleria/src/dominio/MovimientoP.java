package dominio;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Objects;

/**
 *
 * @author Comunidad del anillo
 */
public class MovimientoP {

    private Integer id;
    private Calendar fecha;
    private ArrayList<ListaPedidosProd> prod;

    public MovimientoP(Integer id, Calendar fecha, ArrayList<ListaPedidosProd> prod) {
        this.id = id;
        this.fecha = fecha;
        this.prod = prod;
    }

    public MovimientoP(Calendar fecha, ArrayList<ListaPedidosProd> prod) {
        this.fecha = fecha;
        this.prod = prod;
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

    public ArrayList<ListaPedidosProd> getProd() {
        return prod;
    }

    public void setProd(ArrayList<ListaPedidosProd> prod) {
        this.prod = prod;
    }

    @Override
    public int hashCode() {
        int hash = 3;
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
        final MovimientoP other = (MovimientoP) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "MovimientoP{" + "id=" + id + ", fecha=" + fecha + ", prod=" + prod + '}';
    }

}
