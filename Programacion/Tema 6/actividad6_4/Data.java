package ejercicio6_4;


public class Data {
    int dia, mes, anyo = 0;

    public Data() {

    }

    // Getter y Setter

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }


    // Constructor.
    public Data(int dia, int mes, int anyo) {
        this.dia = dia;
        this.mes = mes;
        this.anyo = anyo;
    }

    public static void dema(Data data) {
        data.dia++;
        if (data.dia > 31) {
            data.mes++;
            data.dia = 1;
            if (data.mes > 12) {
                data.anyo++;
                data.dia = 1;
                data.mes = 1;
            }
        }

        System.out.println("Manyana:");
        System.out.println(data.dia + "-" + data.mes + "-" + data.anyo);
    }

}
