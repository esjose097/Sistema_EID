package dominio;

/**
 *
 * @author Comunidad del anillo
 */
public class ExistenciaMp {

    private Integer id;
    private MateriaPrima materiaprima;
    private int cantidad;

    public ExistenciaMp(MateriaPrima materiaprima, int cantidad) {
        this.materiaprima = materiaprima;
        this.cantidad = cantidad;
    }

    public ExistenciaMp(Integer id, MateriaPrima materiaprima, int cantidad) {
        this.id = id;
        this.materiaprima = materiaprima;
        this.cantidad = cantidad;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
    public String toString() {
        return "ExistenciaMp{" + "materiaprima=" + materiaprima + ", cantidad=" + cantidad + '}';
    }

}
