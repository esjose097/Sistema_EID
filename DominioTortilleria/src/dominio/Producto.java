package dominio;

import java.util.ArrayList;

/**
 *
 * @author Comunidad del anillo
 */
public class Producto {

    private Integer id;
    private String nombre;
    private String tipo;
    private String unidad;
    private ArrayList<MateriaPrima> materiasPrimas;

    public Producto(int id, String nombre, String tipo, String unidad, ArrayList<MateriaPrima> materiasPrimas) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.unidad = unidad;
        this.materiasPrimas = materiasPrimas;
    }

    public Producto(String nombre, String tipo, String unidad) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.unidad = unidad;
    }

    public Producto(int id, String nombre, String tipo, String unidad) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.unidad = unidad;
    }

    public Producto(int id, String nombre, String tipo) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.materiasPrimas = null;
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
    public String toString() {
        return "Producto{" + "id=" + id + ", nombre=" + nombre + ", tipo=" + tipo + ", unidad=" + unidad + ", materiasPrimas=" + materiasPrimas + '}';
    }

}
