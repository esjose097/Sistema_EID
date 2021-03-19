
package dominio;

/**
 *
 * @author Comunidad del anillo
*/

public class ExistenciaP {
    
    private Integer id;
    private Producto producto;
    private int cantidad;

    public ExistenciaP(Integer id, Producto producto, int cantidad) {
        this.id = id;
        this.producto = producto;
        this.cantidad = cantidad;
    }
        
    public ExistenciaP(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
    public String toString() {
        return "ExistenciaP{" + "producto=" + producto + ", cantidad=" + cantidad + '}';
    }

}
