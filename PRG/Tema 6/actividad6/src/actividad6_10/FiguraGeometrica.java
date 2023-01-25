package actividad6_10;

public class FiguraGeometrica {
    
    private int x = 0;
    private int y = 0;
    private int height = 0;
    private int width = 0;

    public FiguraGeometrica() {

    }

    public FiguraGeometrica(int x, int y, int height, int width) {
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
    }

    
    // toString()
    @Override
    public String toString() {
        return "FiguraGeometrica [x=" + x + ", y=" + y + ", height=" + height + ", width=" + width + "]";
    }
    
    // Getters y setters
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    // mostrarDades()
    public String mostrarDades() {
        return "Coordenada X: " + this.x + " " + "Coordenada Y: " + this.y + " " + "Altura: " + this.height + "Anchura: " + this.width;
    }

    
}
