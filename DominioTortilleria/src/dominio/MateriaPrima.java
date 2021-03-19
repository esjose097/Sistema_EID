package dominio;

/**
 *
 * @author Comunidad del anillo
 */
public class MateriaPrima {

    private Integer id;
    private String nombre;
    private String distribuidora;
    private String unidad;

    public MateriaPrima(int id, String nombre, String distribuidora, String unidad) {
        this.id = id;
        this.nombre = nombre;
        this.distribuidora = distribuidora;
        this.unidad = unidad;
    }

    public MateriaPrima(String nombre, String distribuidora, String unidad) {
        this.nombre = nombre;
        this.distribuidora = distribuidora;
        this.unidad = unidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDistribuidora() {
        return distribuidora;
    }

    public void setDistribuidora(String distribuidora) {
        this.distribuidora = distribuidora;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + this.id;
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
        final MateriaPrima other = (MateriaPrima) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "MateriaPrima{" + "id=" + id + ", nombre=" + nombre + ", tipo=" + distribuidora + ", unidad=" + unidad + '}';
    }

}
