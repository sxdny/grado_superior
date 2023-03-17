## 📓 2023-03-17

### Tema 9. Colecciones de elementos.

[Enlace a la teoria del Tema 9 en el Classroom.](https://classroom.google.com/c/NTQ3OTA2ODI1NTg5/m/NTQ3OTA2ODI1NjU2/details)

#### Tipos de clases.

Clase normal:

````java
// La clase tiene un main.
// Se crea a si misma.
public class MyClassInteger {

	Integer i;

	public MyClassInteger (Integer i) {
		this.i = i;
	}

	public static void main (String[] args) {
		MyClassInteger classInteger = new MyClassInteger(7);
		System.out.println(classInteger.i);
	}

}
````

Clases genéricas:

````java
public class MyClass <T> {

	T obj;

	public MyClass (T obj) {
		this.obj = obj;
	}

	public static void main (String[] args) {
		// Todo lo que sea un objeto, se podrá usa (los definidos por el usuario tambien)
		MyClass<Integer> i = new MyClass<>(7);
		MyClass<Double> d = new MyClass<>(7.4);

		System.out.print(i.obj)
		System.out.print(d.obj)
	}

}
````

Métodos genéricos:

````java
public class GenericMethodTest {

	public static void main (String[] args) {

		GenericMethodClass gmc = new GenericMethodClass();

		Integer...
		// Continuar...
	}

}
````

Limitar los tipos de objetos en el parentesis.

````java
<T extends Number> // Number y sus hijos
// o
<T super Integer> // Integer y sus padres. 
````

Clases històriques:

````java
class EnumExample1 {
	public enum Season {WINTER, SPRING, SUMMER, AUTUMN}
}
````

#### Vectores.

Objeto como una array pero más flexible. No tiene tamaño fijo y no hace falta definirle un valor inicial.

Los vectores se hacen con ==objetos==, con int no funciona.

````java
Vector<E>

Vector<Alumnos> gradoSuperior = new Vector<>;

gs.capacity(); // Devuelve la capacidad del vector.
gs.size(); // Devuelve el número exacto de elementos. 2 objetos = 2 de size.
gs.get(3) // Objeto almacenado en la posicoin 3 (de 0 a size() - 1) --> size = 4
gs.add(1, pepe) // Añade un objeto al vector. Especificar el lugar y el objeto. Lo moverá automáticamente.
````

Consultar la documentación en [este enlace.](https://docs.oracle.com/javase/8/docs/api/java/util/Vector.html)
