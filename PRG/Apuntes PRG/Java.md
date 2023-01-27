
## Actividad 6.11

````java
Libro arrayLibros = new Libro[100];

// Objetos

Un objeto Libro;
Un objeto ListaLibro (arrayLibro);

// Clase Biblioteca

// Serie de estanterias.

Biblioteca

	arrayListaLibro biblio = new ListaLibro[50];

	main {

		new ListaLibro;
		new Libro;
	
	}

// Funciones

public static void insertarLibro() {
	
}
````

![[Pasted image 20230124154253.png]]
Calcular radio circulo.

## Borrar un libro

````java
Libro[5]; // Identificar posicion;
Libro[5] = null; 

// Queda un agujero;

// o

// Correrlo todo a -1.
````

## Ejercicio 6.12 Programacion.

Estructura del ejercicio:

````java
Persona pepe = new Persona();
Cua cuaCine = new Cua();

p = cuaCine.treurePersona();
````

````java
// Hacer la cola denrto de un programa ejecutable o dentro de una clase aparte.

// Objecte / Clase Cua --> Metodos --> insertarPersona(), sacarPersona(), mostraNumeroDePersonas()

// Solo 1 cola.

public void insertarPersona(Persona p) {
	arrayPersonas[index] = p;
}

public treurePersonas() {
	// Simpre sacara la primera persona.
	return arrayPersonas[0]; Primera persona.
}

public int mostrarNumeroPersona() {
	return index;
}
````

## Interfícies. Programación.

Ejercicio de los coches:

````java
// Clase Vehiculo

public class Vehicle {
	int nRodes;
	
	public void accelerar() {
	
	}

	public void frenar() {
		
	}

	public void girarDreta() {
	
	}

	public void girarEsquerra() {
	
	}
}

// Clase coche

public class Coche extends Vehicle {

	String color;
	String matricula;

	public void obrirPortes() {
	
	}
}

// Clase Camio

public class Camio extends Vehicle {

	int numeroEixos;
	int carregaMaxima;

	public void carregar() {
	
	}

	public void descarregar() {
	
	}
}

// Clase Bicicleta

public class Bicicleta extends Vehicle {

}

// Interfaz Electric

public interface Electric {
	public void carregar();
}

//  Interfaz SenseConductor

public interface SenseConductor {
	public void indicarDesti();
}

// Clase Citroen

public class Citroen extends Cotxe {

}

// Clase Tesla

public class Tesla extends Coche implements Electric {

	@Override
	public void carregar() {
		System.out.println("Carregant...")
	}
}

// Clase GoogleCar

public class GoogleCar extends Coche implements Electric, SenseConductor {

	@Override
	public void indicarDesti() {
	
	}

	@Override
	public void carregar() {
	
	}

}
````