tags:: #Programacion #repaso_examen 

# Cosas importante examen Programación - Interfaz Gráfica.

---

## 1. Archivos.

Si necesitamos crear un nuevo archivo para guardar objetos, texto o cualquier otra cosa, crearemos un objeto `File`:

```java
static File directorio = new File("./partidas"); // archivo
static File partidas = new File("./partidas/partidas.dat"); // directorio
```

### Definición de un objeto.

Para crear un objeto:

```java
public class nombre_clase {
    
	// definició de variables
	int var1 = 0;
	String var2 = new String();
	
	// constructores
	public Partida() {
	
	}
	public Partida(int var1, String var2) {
		this.var1 = var1;
		this.var2 = var2;
	}
	// getters y setters
	public int getVar1() {
		return var1;
	}
	
	public void setVar1(int var1) {
		this.var1 = var1;
	}
	
	...
	// toString(opcional)
	
	@Override
	public String toString() {
		return "Var1: " + var1 + ", var2: " + var2;
	}
	
```

### Guardar una serie de objetos:

Para guardar un conjunto de objetos, podemos usar un `Vector<Objeto> nombre_vector`.

```java
static Vector<Usuario> usuariosArchivo = new Vector<>();
```

### Lectura y escritura de objetos en un archivo.

>[!caution]
>**Importante** en las clases que vayamos utilizar para escribir en un archivo, implementaremos el `Serializable` para que no haya problemas.
>```java
>public class Partida implements Serializable {
>	...
>}
>```

Para leer archivos:

1. Definimos un `FileInputStream` y un `ObjectInputStream`.

```java
FileInputStream fis = new FileInputStream(partidas);
ObjectInputStream ois = new ObjectInputStream(fis);
```

2. Dentro de un loop, usamos un `ois.readObject()` y vamos leyendo. Por ejemplo, si quiero leer los usuarios del archivo:

```java
while (true) { // recorremos el archivo
	Usuario usuario = (Usuario) ois.readObject(); // leemos y hacemos cast.
	usuariosArchivo.add(usuario);
}
```

Para escribir en un archivo:

1. Definimos un `FileOutputStream` y un `ObjectOutputStream`:

```java
FileOutputStream fos = new FileOutputStream(partidas);
ObjectOutputStream oos = new ObjectOutputStream(fos);
```

2. Dentro de un `for looop`, escribimos los usuarios (por ejemplo) en el archivo con un `oos.writeObject(usuario)`:

```java
for (Usuario usuario2 : usuariosArchivo) {
	oos.writeObject(usuario2);
}

oos.flush();
oos.close(); // importante cerrar el archivo
```

## 2. Java Swing

Para una vista a todos *los layouts* ir [aquí](https://docs.oracle.com/javase/tutorial/uiswing/layout/visual.html)

Elementos útiles:

- **JLabel.** Para textos.
- **JTextField.** Para cajas de texto (introducir texto).
- **JRadioButton.** Para radio buttons.
- **JComboBox.** Para crear desplegables.

- **JMenuBar.** Para crear un menú en nuestro programa. ==Solo puede haber 1.==
- **JMenu.** Contenedor que representa un menú (una opción por ejemplo: "Archivo").
- **JMenuItem.** Menú dentro de un menú (una opción dentro de "Archivo", que sea "Guardar como...").
- **JCheckBoxMenuItem.** Menú de check boxes.
- **JRadioButtonMenuItem.** Menú de radio buttons.

![[Pasted image 20230606123509.png]]

### Acciones botones programa.

Para implementar acciones en un botón (Ejemplo):

```java
btnCount.addActionListener( new ActionListener() {
	@Override
	public void actionPerformed(ActionEvent e) {
		times++;
		textField.setText("El botó s'ha pitjat " + times + "vegades");
	}
}
);
```

<br>
---
<br>
El resto de cosas se puede hacer muy fácil con el WindowBuilder del Eclipse.
