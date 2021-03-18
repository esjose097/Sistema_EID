package dominio;

/**
 *
 * @author Comunidad del anillo
 */
public class MateriaPrima {

    private Integer id;
    private String nombre;
    private String tipo;
    private String unidad;

    public MateriaPrima(int id, String nombre, String tipo, String unidad) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.unidad = unidad;
    }

    public MateriaPrima(String nombre, String tipo, String unidad) {
        this.nombre = nombre;
        this.tipo = tipo;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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
        return "MateriaPrima{" + "id=" + id + ", nombre=" + nombre + ", tipo=" + tipo + ", unidad=" + unidad + '}';
    }

}
