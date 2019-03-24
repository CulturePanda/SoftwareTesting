package PrimeTest;
import static org.junit.Assert.assertEquals;

import org.junit.*;
import PrintPrime.PrintPrime;

public class primeTest {

	public PrintPrime prim = new PrintPrime();
	@Test
	public void testPrime() {
		String expected = "2 3 5 ";
		assertEquals(expected,prim.printPrimes(3));
	}
}
