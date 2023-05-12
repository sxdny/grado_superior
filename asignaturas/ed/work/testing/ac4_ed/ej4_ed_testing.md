# Ejercicio 4 ED - Testing
#### Sidney Silva Braz de Oliveira
---
Tenim una classe Cuenta amb un funcionament bàsic d’un compte virtual on tenim
cuatre operacions: ingressar, retirar, transferir i veure el saldo actual del compte.
**Crea una classe CuentaTest i les proves corresponents per tal de provar
aquesta classe.** Per provar la transferència per exemple, haurem d’instanciar la
classe Cuenta i realitzar diverses operacions amb ella, per després comprovar si el
balanç és l’esperat. Instanciarem un altre objecte de la mateixa classe per emprar-lo
com a compte de destí en la transferència.

````java
public class Cuenta {
    private float balance;

    public Cuenta() {
    }

    public void Deposito(float cantidad) {
        balance += cantidad;
    }

    public void Retiro(float cantidad) {
        balance -= cantidad;
    }

    public void Transferencia(Cuenta destino, float cantidad) {
        destino.Deposito(cantidad);
    Retiro(cantidad);
    }

    public float Balance (){
        return balance;
    }
}
````

#### Resultado

Capturas de pantalla:
