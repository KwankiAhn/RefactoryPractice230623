package primenumber;

public class GeneratePrimes {
	Boolean[] isPrime;


	void createIntegerList(int max) {
		this.isPrime = new Boolean[max + 1];
		for (int i = 0; i < isPrime.length; i++) {
			isPrime[i] = true;
		}
	}

	void crossOutMultiples() {
		for (int i = 2; i * i <= isPrime.length; i++) {
			if (isPrime[i]) {
				for (int j = 2 * i; j <= isPrime.length; j += i) {
					isPrime[j] = false;
				}
			}
		}
	}
	int numOfRemainings() {
		int count = 0;
		for (int i = 2; i < isPrime.length; i++) {
			if (isPrime[i])
				count++;
		}
		return count;
	}
	int[] extractRemainings() {
		int[] primes = new int[numOfRemainings()];
		int index = 0;
		for (int i = 2; i < isPrime.length; i++) {
			if (isPrime[i])
				primes[index++] = i;
		}
		return primes;
	}

	public int[] primes(int max) {
		if (max < 2)
			return null;

		this.createIntegerList(max);
		this.crossOutMultiples();
		int[] primes = this.extractRemainings();
		return primes;
	}

	public static void main(String[] args) {
		GeneratePrimes prime = new GeneratePrimes();
		int[] primes = prime.primes(10);
		for (int i = 0; i < primes.length; i++) {
			System.out.println(primes[i]);
		}
	}
}
