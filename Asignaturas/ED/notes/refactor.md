tags:: #repaso_examen #ed #refactor

# Repaso Examen Refactor

Repaso Examen Refactor ED - 2023-06-12

## Bad smells.

- **Bloaters.** Son métodos, funciones, etc que son muy grandes y se podrían dividir en varios submétodos.
- **Object-Orientation abusers**. Código que no implementa correctamente los principios de la programación orientada a objetos.
- **Change Preventers**. Este es código que si lo tienes que cambiar, tendrán que cambiarlo en varios otros lugares. Básicamente los *magic numbers*, hacer CONSTANTES.
- **Dispensables.** Código inútil y que no hace falta que esté.
- **Couplers.** Código que depende demasiado de otro.

- **Freeloader.** Clase muy simple.
- **Large class.** Clase MUY larga.
- **Feature envy.** Cuando un método utiliza más elementos que el suyo propio.
- **Divergent change.** Cuando tienes que hacer muchos cambios en una clase, también tienes que cambiar muchos métodos. 

- **Message chains.** Cuando en un método se llama a otro método que este llama a otro método...
- **Long method.** Método MUY largo.
- **Long parameters list.** Cuando un método tiene MUCHOS parámetros,