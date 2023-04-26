let json = `[
    {
        "personas": [
            {
                "name": "Sidney",
                "apellidos" : "Silva Braz de Oliveira"
            },
            {
                "name": "Ivan"
            },
            {
                "name": "Joan"
            },
            {
                "name": "JSON"
            }
        ],
        "objetos": [
            {
                "name": "Pelota"
            },
            {
                "name": "Cuaderno"
            }
        ]
    }
]`

// lo de arriba también puede ser un String

console.log(JSON.parse(json)[0].personas[0])
document.write(JSON.stringify(JSON.parse(json)[0].personas[0]))

// el JSON.parte convierte de String a un .json como si no tuviese comillas.