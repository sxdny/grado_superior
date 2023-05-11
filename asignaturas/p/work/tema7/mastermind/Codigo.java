import java.util.Arrays;

public class Codigo {

    String[] codigo = new String[4];

    // constructores
    public Codigo() {

    }

    public Codigo(String[] codigo) {
        this.codigo = codigo;
    }

    // getters y setters
    public String[] getCodigo() {
        return codigo;
    }

    public void setCodigo(String[] codigo) {
        this.codigo = codigo;
    }

    // Override del método toString
    @Override
    public String toString() {
        return Arrays.toString(codigo);
    }

    // función para generar un código aleatorio
    public void generarCodigoAleatorio(Codigo codigo, Colores colores) {

        for (int i = 0; i < codigo.codigo.length; i++) {
            int pick = (int) Math.floor(Math.random() * (colores.getSize() - 1 + 1));
            codigo.codigo[i] = colores.set[pick];
        }

    }

}
