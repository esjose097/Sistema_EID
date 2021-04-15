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
public class DetalleMovimientoMP {
    private Integer id;
    private MovimientoMP movimientomp;
    private int numMovimiento;
    private int cantidad;

    public DetalleMovimientoMP(MovimientoMP movimientomp, int numMovimiento, int cantidad) {
        this.movimientomp = movimientomp;
        this.numMovimiento = numMovimiento;
        this.cantidad = cantidad;
    }

    public DetalleMovimientoMP(Integer id, MovimientoMP movimientomp, int numMovimiento, int cantidad) {
        this.id = id;
        this.movimientomp = movimientomp;
        this.numMovimiento = numMovimiento;
        this.cantidad = cantidad;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public MovimientoMP getMovimientomp() {
        return movimientomp;
    }

    public void setMovimientomp(MovimientoMP movimientomp) {
        this.movimientomp = movimientomp;
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
        final DetalleMovimientoMP other = (DetalleMovimientoMP) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DetalleMovimientoMP{" + "id=" + id + ", movimientomp=" + movimientomp + ", numMovimiento=" + numMovimiento + ", cantidad=" + cantidad + '}';
    }

    
    
    
}
