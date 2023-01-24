package actividad6_10;

public class Rombo extends FiguraGeometrica {
    
    int diagonalMayor = 0;
    int diagonalMenor = 0;
    int lado;

    public Rombo() {
        
    }

    public Rombo(int x, int y, int height, int width, int diagonalMayor, int diagonalMenor, int lado) {
        super(x, y, height, width);
        this.diagonalMayor = diagonalMayor;
        this.diagonalMenor = diagonalMenor;
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Rombo [diagonalMayor=" + diagonalMayor + ", diagonalMenor=" + diagonalMenor + ", lado=" + lado + "]";
    }

    public int getDiagonalMayor() {
        return diagonalMayor;
    }

    public void setDiagonalMayor(int diagonalMayor) {
        this.diagonalMayor = diagonalMayor;
    }

    public int getDiagonalMenor() {
        return diagonalMenor;
    }

    public void setDiagonalMenor(int diagonalMenor) {
        this.diagonalMenor = diagonalMenor;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

}
