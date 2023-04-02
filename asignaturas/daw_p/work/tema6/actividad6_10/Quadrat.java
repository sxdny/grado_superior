package actividad6_10;

public class Quadrat extends FiguraGeometrica {

    public Quadrat() {

    }

    public Quadrat(int x, int y, int height, int width) {
        super(x, y, height, width);
    }

    public String mostrarDades() {
        return super.mostrarDades();
    }

    // Opcional.
    @Override
    public String toString() {
        return "Quadrat []";
    }

    public void mostrarAreaQuadrat(int height, int width) {

        int area = height * width;
        System.out.println("El area del Circulo es: " + area);

    }

    public void mostrarPerimetroQuadrat(int height, int width) {

        int perimetro = height + height + width + width;
        System.out.println("El perimetro del Circulo es: " + perimetro);

    }

}