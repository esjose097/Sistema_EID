package dominio;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Objects;

/**
 *
 * @author Comunidad del anillo
 */
public class DetalleMovimientoP {

    private Integer id;
    private String tipo;
    private Calendar fecha;
    private ArrayList<ExistenciaP> listaExP;

    public DetalleMovimientoP(Integer id, String tipo, Calendar fecha, ArrayList<ExistenciaP> listaExP) {
        this.id = id;
        this.tipo = tipo;
        this.fecha = fecha;
        this.listaExP = listaExP;
    }

    public DetalleMovimientoP(String tipo, Calendar fecha, ArrayList<ExistenciaP> listaExP) {
        this.tipo = tipo;
        this.fecha = fecha;
        this.listaExP = listaExP;
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

    public ArrayList<ExistenciaP> getListaExP() {
        return listaExP;
    }

    public void setListaExP(ArrayList<ExistenciaP> listaExP) {
        this.listaExP = listaExP;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.id);
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
        final DetalleMovimientoP other = (DetalleMovimientoP) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DetalleMovimientoP{" + "id=" + id + ", tipo=" + tipo + ", fecha=" + fecha + ", listaExP=" + listaExP + '}';
    }

}
