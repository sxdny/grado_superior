package actividad6_11;


public class Llibre {
    
    String titulo = new String();
    String autor = new String();
    String genero = new String();
    String idLlibre = new String();
    int paginas = 0;

    public Llibre() {

    }

    public Llibre(String titulo, String autor, String genero, String idLlibre, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.idLlibre = idLlibre;
        this.paginas = paginas;
    }

    
    @Override
    public String toString() {
        return "Llibre [titulo=" + this.titulo + ", autor=" + this.autor + ", idLlibre=" + idLlibre + "]";
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getIdLlibre() {
        return idLlibre;
    }

    public void setIdLlibre(String idLlibre) {
        this.idLlibre = idLlibre;
    }

}
