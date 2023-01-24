# Hola me llamo Sidney.

## Hola me llamo Sidney.

### Hola me llamo Sidney.

**Texto en negrita**

*Texto en cursiva*

~~Texto tachado.~~

I need to highlight these ==very important words==.

H~2~O

X^2^

Texto normal

> Frase o algo, ns como se llama.

1. Hola
2. Hola
3. Hola

- Lista desordenada.
- Lista desordenada.
- Lista desordenada.

`let var = 0`

---
linea orizontal

[Minecraft](https://www.minecraft.com) Link.

## Tablas


| Nombre | Apellidos |
| ----------- | ----------- |
| Sidney | Silva |
| Iván | Carreras |



#### Table of Contents

- [Underline](#underline)
- [Indent](#indent)
- [Center](#center)
- [Color](#color)

## Alineamiento de tablas.

| Syntax      | Description | Test Text     |
| :---        |    :----:   |          ---: |
| Header      | Title       | Here's this   |
| Paragraph   | Text        | And more      |

## Tabla con salto de linea.

| Syntax      | Description |
| ----------- | ----------- |
| Header      | Title |
| Paragraph   | First paragraph. <br><br> Second paragraph. |

Bloque de código.

```mysql
SELECT * FROM
WHERE perfect_condition

-- Hacer funcion castingActors(character_id)
```



```java
package actividad6_9;

import java.util.Scanner;

public class mainProgram {

    static int op = 0;

    static Qualificat[] qualificats = new Qualificat[100];
    static int qualificatsCreats = 0;

    static Obrer[] obrers = new Obrer[100];
    static int obrersCreats = 0;

    static CapDepartament[] capsdepartament = new CapDepartament[100];
    static int capsdepartamentsCreats = 0;

     static Scanner sc = new Scanner(System.in);
    
    public static void main (String[] args) {

        do {
            
            System.out.println("Elige una de las siguientes opciones: ");
            System.out.println("1. Crear un nuevo ( Obrer )");
            System.out.println("2. Crear un nuevo ( Qualificat )"); 
            System.out.println("3. Crear un nuevo ( Cap de departament )");
            System.out.println("4. Mostrar todos los ( Obrer )");
            System.out.println("5. Mostrar todos los ( Qualificat )");
            System.out.println("6. Mostrar todos los ( Cap de departament )");
            System.out.println("7. Mostrar TODOS."); 
            System.out.println("8. Salir del programa...");

            op = sc.nextInt();
            sc.nextLine();

            if (op == 1) {
                crearObrer();
            }

            if (op == 2) {
                crearQualificat();
            }

            if (op == 3) {
                crearCapDeDepartament();
            }

            if (op == 4) {
                
                for (int i = 0; i < obrersCreats; i++) {
                    System.out.println(obrers[i]); 
                }

            }

            if (op == 5) {
                
            }

            if (op == 6) {
                
            }

            if (op == 7) {
                
            }

            if (op < 0 || op >= 9 ) {
                System.out.println();
                System.out.println("No has introducido una opcion valida.");
                System.out.println();
            }
        } while (op != 8);
        System.out.println();
        System.out.println("Has salido del programa.");
        System.out.println();
    }
    // Funciones.
    public static void crearQualificat() {
        System.out.println("Introduzca tu nombre:");
            String Nom = sc.nextLine();
            System.out.println("Introduzca  tus apellidos:");
            String Cognoms = sc.nextLine();
            System.out.println("Introduzca tu DNI:");
            String DNI = sc.nextLine();
            System.out.println("Introduzca el salario base:");
            double salariBase = sc.nextDouble();
            sc.nextLine();
            System.out.println("Introduzca tu titulacio:");
            String titulacio = sc.nextLine();
            System.out.println("Introduzca el departamento:");
            String departamento = sc.nextLine();
            System.out.println("Introduzca el plus:");
            double plus = sc.nextInt();
            sc.nextLine();
            qualificats[qualificatsCreats] = new Qualificat(Nom, Cognoms, DNI, salariBase, titulacio, departamento, plus);
    }

    public static void crearCapDeDepartament() {
        System.out.println("Introduzca tu nombre:");
            String Nom = sc.nextLine();
            System.out.println("Introduzca  tus apellidos:");
            String Cognoms = sc.nextLine();
            System.out.println("Introduzca tu DNI:");
            String DNI = sc.nextLine();
            System.out.println("Introduzca el salario base:");
            double salariBase = sc.nextDouble();
            sc.nextLine();
            System.out.println("Introduzca tu titulacio:");
            String titulacio = sc.nextLine();
            System.out.println("Introduzca el departamento:");
            String departamento = sc.nextLine();
            System.out.println("Introduzca el plus:");
            double plus = sc.nextInt();
            sc.nextLine();
            System.out.println("Introduzca els treballadors al carrec:");
            int treballadorsAlCarrec = sc.nextInt();
            sc.nextLine();
            System.out.println("Introduzca los proyectos:");
            int projectes = sc.nextInt();
            sc.nextLine();
            capsdepartament[capsdepartamentsCreats] = new CapDepartament(Nom, Cognoms, DNI, salariBase, titulacio, departamento, plus, treballadorsAlCarrec, projectes);
    }

    public static void crearObrer() {
        System.out.println("Introduzca tu nombre:");
        String Nom = sc.nextLine();
        System.out.println("Introduzca  tus apellidos:");
        String Cognoms = sc.nextLine();
        System.out.println("Introduzca tu DNI:");
        String DNI = sc.nextLine();
        System.out.println("Introduzca el salario base:");
        double salariBase = sc.nextDouble();
        sc.nextLine();
        System.out.println("Introduzca tu destino:");
        String desti = sc.nextLine();
        System.out.println("Introduzca tus horas extra:");
        int horasExtra = sc.nextInt();
        sc.nextLine();
        System.out.println("Introduzca el preo de les hores extra:");
        double preuHoresExtra = sc.nextDouble();
        sc.nextLine();
        obrers[obrersCreats] = new Obrer(Nom, Cognoms, DNI, salariBase, desti, horasExtra, preuHoresExtra);
    }
}
```

Here's a sentence with a footnote. [^1]

### My Great Heading {#custom-id}

<center>This text is centered.</center>
<center>This text is centered.</center>
<center>This text is centered.</center>
<center>This text is centered.</center>
<center>This text is centered.</center>

> :warning: **Warning:** Do not push the big red button.

> :memo: **Note:** Sunrises are beautiful.

> :bulb: **Tip:** Remember to appreciate the little things in life.

Sidney Silva
: definition

First Term
: This is the definition of the first term.

Second Term
: This is one definition of the second term.
: This is another definition of the second term.

That is so funny! 😂

- [ ] Write the press release
- [ ] Update the website
- [ ] Contact the media



[^1]: This is the footnote.