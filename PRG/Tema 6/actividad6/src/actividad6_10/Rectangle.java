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

}