package ac4_ed;

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

	public float Balance() {
		return balance;
	}
}

// Ctrl + Shift + S para dar formato al documento.