package ejercicio6_3;

import java.util.Random;

public class Password {
    static String password = new String();
    static int longitud = 8;

    public Password() {
        
    }
    
    // Constructor.
    public Password(String password, int longitud) {
        Password.password = password;
        Password.longitud = longitud;
    }

    // Getters y setters.

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        Password.password = password;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        Password.longitud = longitud;
    }

    // Generar password.
    public static void generarPassword(Password password) {

        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < Password.longitud; i++) {
	        char numero = (char)((char)random.nextInt(('~' - '!') + 1) + '!');
            sb.append(numero);
            Password.password = sb.toString();
		}

    }

    public static void comprovar(Password password) {

        // Requisitos de la contraseña.
        final int MAJ = 1;
        final int MIN = 1;
        final int NUM = 1;
        final int SCP = 1;

        // Contadores.
        int MAJcont = 0;
        int MINcont = 0;
        int NUMcont = 0;
        int SPCcont = 0;

        for (int i=0; i < Password.password.length(); i++ ) {
            char c = Password.password.charAt(i);
            if(Character.isUpperCase(c)) 
                  MAJcont++;
            else if(Character.isLowerCase(c)) 
                  MINcont++;
            else if(Character.isDigit(c)) 
                  NUMcont++;     
             if(c>=32&&c<=126) {
              SPCcont++;
            }
        }

        if (MAJcont >= MAJ && MINcont >= MIN && NUMcont >= NUM && SPCcont >= SCP) { 
            System.out.println("La contrasenya: " + Password.password + " es VALIDA.");
        }
        else {
            System.out.println("La contrasenya: " + Password.password + " NO es VALIDA.");
        } 
    }
}
