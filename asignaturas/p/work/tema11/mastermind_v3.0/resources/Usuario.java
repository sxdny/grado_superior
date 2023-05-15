package resources;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Vector;

public class Usuario implements Serializable {
    
    int id = 0;
    String nombre = new String();
    int puntiacionR = 0;
    Vector<Partida> partidasUsuario = new Vector<>();

    public Usuario() {

    }

    public Usuario(int id,String nombre, int puntiacionR, Vector<Partida> partidasUsuario) {
        this.id = id;
        this.nombre = nombre;
        this.puntiacionR = puntiacionR;
        this.partidasUsuario = partidasUsuario;
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
        return "Usuario [id=" + id + ", nombre=" + nombre + ", puntiacionR=" + puntiacionR + ", partidasUsuario="
                + partidasUsuario.toArray().toString() + "]";
    }

    public String toStringEssentials() {
        return "ID usuario: " + id + " , " + "Nombre usuario: " + nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Vector<Partida> getPartidasUsuario() {
        return partidasUsuario;
    }

    public void setPartidasUsuario(Vector<Partida> partidasUsuario) {
        this.partidasUsuario = partidasUsuario;
    }

}
