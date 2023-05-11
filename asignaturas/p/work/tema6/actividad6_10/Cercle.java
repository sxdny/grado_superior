package actividad6_10;

public class Cercle extends FiguraGeometrica {
    
    private int radi = 0;

    public Cercle() {

    }

    public Cercle(int x, int y, int height, int width, int radi) {
        super(x, y, height, width);
        this.radi = radi;
    }

    public int getRadi() {
        return radi;
    }

    public void setRadi(int radi) {
        this.radi = radi;
    }

    @Override
    public String toString() {
        return "Cercle [radi=" + radi + "]";
    }

    public String mostrarDadesCercle() {
        return super.mostrarDades() + "Radi: " + this.radi;
    }

    public void mostrarAreaCercle(int radio) {
        double area = 3.14159 * Math.pow(radio, 2);
        System.out.println("El perimetro del Ciruclo es: " + area);
    }

    public void mostrarCircunferenciaCercle(int radi) {
        double area = 3.14159 * 2 * radi;
        System.out.println("La circunferencia del Circulo es: " + area);
    }

    
    
}
