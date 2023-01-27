package actividad6_10;

public class Rectangle extends FiguraGeometrica {

    public Rectangle() {

    }

    public Rectangle(int x, int y, int height, int width) {
        super(x, y, height, width);
    }

    @Override
    public String toString() {
        return "Rectangle []";
    }

    public void mostrarAreaRectangle(int height, int width) {

        int area = width * height;
        System.out.println("El area del Rectangle es: " + area);

    }

    public void mostrarPerimetreRectangle(int height, int width) {

        int perimetre = height + height * width * width;
        System.out.println("El perimetro del Rectangle es: " + perimetre);

    }

}