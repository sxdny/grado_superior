# Actividad 2 JSON

Sidney Silva Braz de Oliveira 1º DAW

---

En una planta de envasado de líquidos, disponen de 5 tipos de envases, 3 tipos de contenedores para empaquetar grupos de envases y 10 tipos de líquidos que pueden ser almacenados en los envases.

Sin embargo, hay ciertas restricciones en los líquidos que pueden ser almacenados en cada envase y los tamaños de los envases hacen que no se pueda almacenar todos los envases en todos los contenedores.

- Tenemos contenedores:
	- Grandes, acepta envases grandes
	- Medianos, no acepta envases grandes
	- Verticales, acepta envases altos
- Tenemos envases:
	- Grande ancho, válido para alimentos
	- Grande alto, válido para alimentos
	- Mediano ancho, válido para alimentos
	- Mediano alto, resistente a sustancias corrosivas
	- Pequeño, resistente a sustancias corrosivas
- Tenemos líquidos:
	- Agua
	- Leche
	- Lejía
	- Amoniaco
	- Jabón
	- Aguarrás
	- Gasolina
	- Aceite
	- Vinagre
	- Alcohol

Para estos líquidos, envases y contenedores, crear un fichero JSON que represente
esta información relativa a lo que puede ser almacenado en cada uno de los tres
niveles

**Archivo JSON que he creado.**

````json
[
    {
        "contenedor_grande": {
            "envases": [
                {
                    "Grande ancho": {
                        "liquidos": [
                            {
                                "tipo": "alimento",
                                "texto": "agua"
                            },
                            {
                                "tipo": "alimento",
                                "texto": "agua"
                            },
                            {
                                "tipo": "alimento",
                                "texto": "aceite"
                            },
                            {
                                "tipo": "alimento",
                                "texto": "vinagre"
                            }
                        ]
                    },
                    "Grande alto": {
                        "liquidos": [
                            {
                                "tipo": "alimento",
                                "texto": "agua"
                            },
                            {
                                "tipo": "alimento",
                                "texto": "agua"
                            },
                            {
                                "tipo": "alimento",
                                "texto": "aceite"
                            },
                            {
                                "tipo": "alimento",
                                "texto": "vinagre"
                            }
                        ]
                    }
                }
            ]
        }
    },
    {
        "contenedor_mediano": {
            "envases": [
                {
                    "Mediano_ancho": {
                        "liquidos": [
                            {
                                "tipo": "alimento",
                                "texto": "agua"
                            },
                            {
                                "tipo": "alimento",
                                "texto": "agua"
                            },
                            {
                                "tipo": "alimento",
                                "texto": "aceite"
                            },
                            {
                                "tipo": "alimento",
                                "texto": "vinagre"
                            }
                        ]
                    },
                    "Mediano alto": {
                        "liquidos": [
                            {
                                "tipo": "sustancia_corrosiva",
                                "nombre": "Gasolina"
                            },
                            {
                                "tipo": "sustancia_corrosiva",
                                "nombre": "Aguarrás"
                            },
                            {
                                "tipo": "sustancia_corrosiva",
                                "nombre": "Amoniaco"
                            },
                            {
                                "tipo": "sustancia_corrosiva",
                                "nombre": "Lejía"
                            }
                        ]
                    },
                    "Pequeño": {
                        "liquidos": [
                            {
                                "tipo": "sustancia_corrosiva",
                                "nombre": "Gasolina"
                            },
                            {
                                "tipo": "sustancia_corrosiva",
                                "nombre": "Aguarrás"
                            },
                            {
                                "tipo": "sustancia_corrosiva",
                                "nombre": "Amoniaco"
                            },
                            {
                                "tipo": "sustancia_corrosiva",
                                "nombre": "Lejía"
                            }
                        ]
                    }
                }
            ]
        }
    },
    {
        "contenedor_vertical": {
            "envases": [
                {
                    "Grande alto": {
                        "liquidos": [
                            {
                                "tipo": "alimento",
                                "texto": "agua"
                            },
                            {
                                "tipo": "alimento",
                                "texto": "agua"
                            },
                            {
                                "tipo": "alimento",
                                "texto": "aceite"
                            },
                            {
                                "tipo": "alimento",
                                "texto": "vinagre"
                            }
                        ]
                    },
                    "Mediano alto": {
                        "liquidos": [
                            {
                                "tipo": "sustancia_corrosiva",
                                "nombre": "Gasolina"
                            },
                            {
                                "tipo": "sustancia_corrosiva",
                                "nombre": "Aguarrás"
                            },
                            {
                                "tipo": "sustancia_corrosiva",
                                "nombre": "Amoniaco"
                            },
                            {
                                "tipo": "sustancia_corrosiva",
                                "nombre": "Lejía"
                            }
                        ]
                    }
                }
            ]
        }
    }
]
````