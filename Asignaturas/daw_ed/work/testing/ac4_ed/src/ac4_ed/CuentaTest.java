package ac4_ed;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class CuentaTest {
	
	@BeforeAll
	void createCuenta( ) {
		Cuenta c1 = new Cuenta();
	}

	@Test
	void testDeposito() {
	}

	@Test
	void testRetiro() {
		fail("Not yet implemented");
	}

	@Test
	void testTransferencia() {
		fail("Not yet implemented");
	}

	@Test
	void testBalance() {
		fail("Not yet implemented");
	}

}
