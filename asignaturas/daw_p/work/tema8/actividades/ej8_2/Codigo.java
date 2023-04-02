package ej8_2;

import java.util.Arrays;

public class Codigo {
    
    String[] codigo = new String[4];

    public Codigo() {

    }

    public Codigo(String[] codigo) {
        this.codigo = codigo;
    }

    // Getters y setters.

    public String[] getCodigo() {
        return codigo;
    }

    public void setCodigo(String[] codigo) {
        this.codigo = codigo;
    }

    

    @Override
    public String toString() {
        return Arrays.toString(codigo);
    }

    public void generarCodigoAleatorio(Codigo codigo, Colores colores) {

        for (int i = 0; i < codigo.codigo.length; i++) {
           int pick = (int) Math.floor(Math.random() * (colores.getSize() - 1 + 1));
           codigo.codigo[i] = colores.set[pick];
        }

    }

    

}
