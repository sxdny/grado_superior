public class Integer1 {
    
    int valor = 0;

    public Integer1() {

    }

    public Integer1(int valor) {
        this.valor = valor;
    }


    // Métodos.

    private byte byteValue() {
        return (byte) this.getValor();
    }

    private static int compare(int valor1, int valor2) {
        if (valor1 > valor2) {
            return valor1;
        }
        else {
            return valor2;
        }
    }

    private int compareTo(Integer1 valor1, Integer1 valor2) {
        if (valor1.getValor() > valor2.getValor()) {
            return valor1.getValor();
        }
        else {
            return valor2.getValor();
        }
    }

    private double doubleValue() {
        return (double) this.getValor();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }  
        else {
            return false;
        }  
    }

    private float floatValue() {
        return (float) this.getValor();
    }

    private int intValue() {
        return (int) this.getValor();
    }

    private long longValue() {
        return (long) this.getValor();
    }

    private static int max(int a, int b) { // 5 y 2
        if (a > b) {
            return a;
        }
        else {
            return b;
        }
    }

    private static int min(int a, int b) {
        if (a < b) {
            return a;
        }
        else {
            return b;
        }
    }

    private static int parseInt(String s) {
        int i = 0, number = 0;
        boolean isNegative = false;
        int len = s.length();

        if (s.charAt(0) == '-') {
            isNegative = true;
            i = 1;
        }

        while( i < len ){
            number *= 10;
            number += ( s.charAt(i++) - '0' );
        }

        if(isNegative)
        number = -number;
        return number;
    }

    private short shortValue() {
        return (short) this.getValor();
    }

    private static int sum(int a, int b) {
        return a + b;
    }

    @Override
    public String toString() {
        return this.getValor() + "";
    }

    public static String toString2(int i) {
        return i + "";
    }

    public static Integer valueOf(int i) {
        return i;
    }

    public static Integer valueOf(String s) {
        return Integer1.parseInt(s);
    }

    public int getValor() {
        return valor;
    }



    public void setValor(int valor) {
        this.valor = valor;
    }

}
