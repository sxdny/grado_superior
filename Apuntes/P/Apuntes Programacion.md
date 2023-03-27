## 📓 2023-03-17

### Tema 9. Colecciones de elementos.

Enlace para callouts --> [aquí](https://help.obsidian.md/Editing+and+formatting/Callouts)
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
gs.add(pepe) // Añade un objeto al vector. Especificar el lugar y el objeto. Lo moverá automáticamente.
````

Consultar la documentación en [este enlace.](https://docs.oracle.com/javase/8/docs/api/java/util/Vector.html)

## 📓 2023-03-21

Hashtable

Capacidad ilimitada. muy útil, tienen 2 tipos de objetos (una llave y el valor que realmente guarda). 

| K        | V       |
| -------- | ------- |
| DNI      | Persona |
| 41502... | Joan    |

ht.get(41502..) --> Persona a que corresponde a la K.

````java
.get(Object key);
````

Para crear una:

````java
HashTable <Integer, Persona> ht = new HashTable <>();

HashMap <Integer, String> hm = new HashMap <>(); // Versión más moderna.
````

Para insertar los objetos:

````java
hm.put(1, "Sidney");
````

## 📓 2023-03-23

List, Set, Map

````java
ArrayList ar;
// En vez de hacer un for con toda la movida, hacer esto en su lugar:
Iterator it = ar.iterador();

while(it.hasNext()) {
	System.out.println(it.next)
}
````

````java
Persona p1
Persona p2

p1.compareTo(p2) // Devuelve lo mismo que -->

String dni1;
String dni2;

dni.compareTo(dni2)

// Devuelve un numero positivo o negativo si es mayor o si no es mayor
````

````java
int compare(T o1, T o2) // Compara 2  objetos que no son del mismo tipo.
````

