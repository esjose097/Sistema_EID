/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

public class Empleado {

    protected Integer id;
    protected String nombre;
    protected String userName;
    protected String pass;
    protected String puesto;
    protected Sucursal sucursal;

    public Empleado(int id, String nombre, String userName, String pass, String puesto) {
        this.id = id;
        this.nombre = nombre;
        this.userName = userName;
        this.pass = pass;
        this.puesto = puesto;
    }

    public Empleado(String nombre, String userName, String pass, String puesto, Sucursal sucursal) {
        this.nombre = nombre;
        this.userName = userName;
        this.pass = pass;
        this.puesto = puesto;
        this.sucursal = sucursal;
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + this.id;
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
        final Empleado other = (Empleado) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", nombre=" + nombre + ", userName=" + userName + ", pass=" + pass + ", puesto=" + puesto + '}';
    }

}
