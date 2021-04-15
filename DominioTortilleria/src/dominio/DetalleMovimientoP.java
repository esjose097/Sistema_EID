/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.util.Objects;

/**
 *
 * @author Comunidad del anillo
 */
public class DetalleMovimientoP {
    private Integer id;
    private MovimientoP movimientop;
    private int numMovimiento;
    private int cantidad;
    
    public DetalleMovimientoP(MovimientoP movimientop, int numMovimiento, int cantidad) {
        this.movimientop = movimientop;
        this.numMovimiento = numMovimiento;
        this.cantidad = cantidad;
    }

    public DetalleMovimientoP(Integer id, MovimientoP movimientop, int numMovimiento, int cantidad) {
        this.id = id;
        this.movimientop = movimientop;
        this.numMovimiento = numMovimiento;
        this.cantidad = cantidad;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public MovimientoP getMovimientop() {
        return movimientop;
    }

    public void setMovimientop(MovimientoP movimientop) {
        this.movimientop = movimientop;
    }

    public int getNumMovimiento() {
        return numMovimiento;
    }

    public void setNumMovimiento(int numMovimiento) {
        this.numMovimiento = numMovimiento;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 73 * hash + Objects.hashCode(this.id);
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
        return "DetalleMovimientoP{" + "id=" + id + ", movimientop=" + movimientop + ", numMovimiento=" + numMovimiento + ", cantidad=" + cantidad + '}';
    }

    
    
    
    
    
    
    
}
