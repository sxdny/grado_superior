package resources;

public class Colores {
    
    String[] set = new String[] {"R", "G", "B", "M", "Y", "C"};

    public Colores() {

    }

    public Colores(String[] set) {
        this.set = set;
    }

    public String[] getColores() {
        return set;
    }

    public void setColores(String[] set) {
        this.set = set;
    }

    public int getSize() {
        return set.length;
    }

    
}
