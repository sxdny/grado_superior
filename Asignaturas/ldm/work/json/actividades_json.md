# Actividades JSON

Sidney Silva Braz de Oliveira 1º DAW


**1.  Representa en un fichero JSON un lenguaje de programación. La información que va a contener es la siguiente:**

+ Nombre del lenguaje.
+ Año de creación.
+ Nombres de los autores.
+ Indicador de si es compilado o no (boolean)

````json
{
    "lenguaje": "Java",
    "anyo_creacion" : 1995,
    "autores" : ["James Gosling", "Sidney Silva"],
    "compilado" : true

````

**2. Representa en un fichero JSON un equipo de baloncesto. La información que va a contener es la siguiente:**  

+ Nombre del equipo.
+ Color de la equipación.
+ Nombre del estadio.
+ Nombre del entrenador.
+ Indicador de si la plantilla del equipo se corresponde con una plantilla histórica (boolean).
+ Referencia a su página web, si está disponible (pensad como si no tuviera web).
+ Jugadores. Por cada jugador se almacena el nombre y el dorsal. Se agrupan según las siguientes  posiciones: base, alero y pívot.

````json
[
    {
        "equipo": "Chicago Bulls",
        "caracteristicas": [
            {
                "color_equipacion": "Roja",
                "estadio": "United Center",
                "entrenador": "Billy Donovan",
                "plantilla_historica": false,
                "pagina_web": "https://shop.bulls.com/",
                "jugadores" : [
                    ["Lonzo Ball", 2],
                    ["Alex Caruso", 6],
                    ["Carlik Jones", 22]
                ]
            }
        ]
    },
    {
        "equipo": "Los Angeles Lakers",
        "caracteristicas": [
            {
                "color_equipacion": "Amarilla",
                "estadio": "Crypto.com Arena",
                "entrenador": "Darvin Ham",
                "plantilla_historica": false,
                "pagina_web": "https://lakersnation.com/",
                "jugadores" : [
                    ["Mo Bamba", 12],
                    ["Lebron James", 6],
                    ["Anthony Davis", 3]
                ]
            }
        ]
    },
    {
        "equipo": "Boston Celtics",
        "caracteristicas": [
            {
                "color_equipacion": "Verde",
                "estadio": "TD Garden",
                "entrenador": "Joe Mazulla",
                "plantilla_historica": false,
                "pagina_web": "https://www.celticsstore.com/",
                "jugadores" : [
                    ["Jaylen Brown", 7],
                    ["JD Davison", 20],
                    ["Marcus Smart", 36]
                ]
            }
        ]
    },
    {
        "equipo": "Golden State Warriors",
        "caracteristicas": [
            {
                "color_equipacion": "Azul",
                "estadio": "Chase Center",
                "entrenador": "Steve Kerr",
                "plantilla_historica": true,
                "pagina_web": null,
                "jugadores" : [
                    ["Stephen Curry", 35],
                    ["Ty Jerome", 10],
                    ["Jordan Poole", 3]
                ]
            }
        ]
    }
]
````