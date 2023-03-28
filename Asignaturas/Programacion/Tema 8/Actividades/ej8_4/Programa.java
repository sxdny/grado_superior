package ej8_4;

public class Programa {
  
public static void main(String[] args) {
  try {

    metodoDePrueba();

  } catch (ExceptionPersonalizada e) {
    
    System.out.println("ExceptionPersonalizada");

  }
}

public static void metodoDePrueba() throws ExceptionPersonalizada {
  throw new ExceptionPersonalizada("Test.");
}

}
