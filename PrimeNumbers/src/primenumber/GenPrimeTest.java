package primenumber;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

class GenPrimeTest {
	@Test
	void testPrimes() {
		GeneratePrimes generater = new GeneratePrimes();
		int[] nullArray = generater.primes(0);
		assertEquals(null, nullArray);
		int[] minArray = generater.primes(2);
		assertEquals(1, minArray.length);
		assertEquals(2, minArray[0]);
		int[] primeArray = generater.primes(3);
		assertEquals(2, primeArray.length);
		assertEquals(2, primeArray[0]);
		assertEquals(3, primeArray[1]);
		primeArray = generater.primes(100);
		assertEquals(25, primeArray.length);
		assertEquals(97, primeArray[24]);
	}
	@Test
	void testBurning() {
		GeneratePrimes generater = new GeneratePrimes();
		int[] primeArray = generater.primes(500);
		for(int i = 2; i < primeArray.length; i++) {
			for(int j = 2; j < primeArray[i]; j++) {
				assertNotEquals(0, primeArray[i]%j);
			}
		}
	}
}
