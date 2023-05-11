## 👩‍💻 Actividad 2 XML.
### Sidney Silva 1º DAW.
---
### **1. Indiqueu si les següents afirmacions són vertaderas o falses. Si es fals, explica per què.**

a) XML és una tecnologia per a la creació de llenguatges de marcat.

**Falso.** Es una tecnologia para *almacenar* e *intercambiar* datos estructurados, como pueden ser documentos, transacciones, configuraciones, etc.

b) El marcat XML està delimitat per barres diagonals i cap enrere (/ i \\).

**Verdadero.**

c) Els caràcters àrabs només poden ser col·locats en un document XML utilitzant una teclat àrab.

**Falso.** También se pueden poner usando el ampersand y el código de la letra.

d) Totes les etiquetes d'inici XML han de tenir les etiquetes corresponents finals.

**Verdadero.**

e) Els analitzadors comproven la  sintaxi del document XML i poden donar suport al Document Object Model (DOM).

**Verdadero.**

f) Un document XML es considera ben format si conté espais en blanc.

**Falso.** Un documento XML bien formado no debe tener espacio en blanco entre el contenido de las etiquetas.

g) Els URI són cadenes que identifiquen recursos com ara arxius, imatges, serveis, correu-electrònic i altres.

**Verdadero.**

h) Quan es creen noves etiquetes XML, els autors del document han d'utilitzar el conjunt d'etiquetes XML que ofertes pel W3C.

**Falso.** Podemos usar cualquier nombre para las etiquetas.

i) El caràcter coixinet (#), el signe de dòlar ($), ampersand (&), major que (>) i menor que (<) són exemples de caràcters XML reservats.

**Falso.** Los carácteres reservados de XML son los siguientes:

| Nombre | Caracter |
|--------|----------|
|Menos que. | < |
|Mayor que. | > |
|AMPERSAND. | & |
|Apóstrofe. | ' |
|Comillas dobles. | " |

El resto se pueden usar libremente.

j) Qualsevol arxiu de text és automàticament considerat com un document XML mitjançant un analitzador.

**Falso.** Solo son identificados como documentos XML aquellos que finalicen con `.xml`.

### **2. Omplir els espais en blanc en cadascuna de les següents afirmacions.**

Un / una ***parser*** processa els documents XML.

Una referència entitat s'ha precedir per un/una	***&*** .

Un/una ***instrucción*** 	de processament està delimitada per `<? ?>`.

El text d'un/una secció ***CDATA*** no s'analitza.

Un document XML es considera ben format si és ***sintacticamente*** correcto.

Els ***Espai de noms*** ajuda als autors del document a evitar col·lisions.

Les línies que precedeixen l'element arrel d'un document XML se'ls denomina	***etiquetes***.

Els documents XML solen tenir ***.xml*** com extensió d'arxiu.


### **3. Identificar i corregir l'error (s) en cada un dels següents:**
a) Primer  error.
```xml
<!-- Incorrecto. -->
<myTag>This is my custom markup</Tag>

<!-- Correcto. -->
<myTag>This is my custom markup</myTag>
```
b) Segundo error.
```xml
<!-- Incorrecto -->
<!--PI value --> a sample processing instruction →

<!-- Correcto -->
<!-- PI value a sample processing intruction -->
```
c) Tercer error.
```xml
<!-- Incorrecto -->
<MyXML>I know XML!!!/>

<!-- Correcto -->
<MyXML> I know XML!!! <MyXML>
```
d) Cuarto error.
```xml
<!-- Incorrecto -->
<![CDATA(This is a CDATA section.)]>

<!-- Correcto -->
<![CDATA[

// Comentario
System.out.println("Me llamo Sidney");

]]>
```




