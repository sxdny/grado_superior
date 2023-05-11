package resources;

import java.io.Serializable;

public class Usuario implements Serializable {
    
    int id = 0;
    String nombre = new String();
    int puntiacionR = 0;

    public Usuario() {

    }

    public Usuario(int id,String nombre, int puntiacionR) {
        this.id = id;
        this.nombre = nombre;
        this.puntiacionR = puntiacionR;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntiacionR() {
        return puntiacionR;
    }

    public void setPuntiacionR(int puntiacionR) {
        this.puntiacionR = puntiacionR;
    }

    @Override
    public String toString() {
        return "Usuario [id=" + id + ", nombre=" + nombre + ", puntiacionR=" + puntiacionR + "]";
    }

    public String toStringEssentials() {
        return "Usuario [id=" + id + "nombre=" + nombre + "]";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
