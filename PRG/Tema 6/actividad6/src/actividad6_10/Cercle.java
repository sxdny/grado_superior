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

    

    
    
}
