package resources;

import java.io.Serializable;

public class Partida implements Serializable {
    
    int idPartida = 0;
    String nombrePartida = new String();
    Usuario usuarioPartida = new Usuario();
    Codigo codigoSecretoPartida = new Codigo();
    int intentosPartida = 0;

    public Partida() {

    }

    public Partida(int idPartida, String nombrePartida, Usuario usuarioPartida, Codigo codigoSecretoPartida, int intentosPartida) {
        this.idPartida = idPartida;
        this.nombrePartida = nombrePartida;
        this.usuarioPartida = usuarioPartida;
        this.codigoSecretoPartida = codigoSecretoPartida;
        this.intentosPartida = intentosPartida;
    }

    public String getNombrePartida() {
        return nombrePartida;
    }

    public void setNombrePartida(String nombrePartida) {
        this.nombrePartida = nombrePartida;
    }

    public Usuario getUsuarioPartida() {
        return usuarioPartida;
    }

    public void setUsuarioPartida(Usuario usuarioPartida) {
        this.usuarioPartida = usuarioPartida;
    }

    public Codigo getCodigoSecretoPartida() {
        return codigoSecretoPartida;
    }

    public void setCodigoSecretoPartida(Codigo codigoSecretoPartida) {
        this.codigoSecretoPartida = codigoSecretoPartida;
    }

    public int getIntentosPartida() {
        return intentosPartida;
    }

    public void setIntentosPartida(int intentosPartida) {
        this.intentosPartida = intentosPartida;
    }

    @Override
    public String toString() {
        return "ID partida: " + idPartida + ", nombre partida: " + nombrePartida;
    }

    public String toStringComplete() {
        return "ID partida: " + idPartida + ", Nombre partida: " + nombrePartida + ", Usuario: " + usuarioPartida + ", Intentos de la partida: " +  intentosPartida;
    }

    public int getIdPartida() {
        return idPartida;
    }

    public void setIdPartida(int idPartida) {
        this.idPartida = idPartida;
    }

}
