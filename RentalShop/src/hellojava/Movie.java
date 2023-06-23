package hellojava;

public class Movie {
	private String name;
	private int priceCode;

	public Movie() {
	}

	public Movie(String name, int priceCode) {
		this.name = name;
		this.priceCode = priceCode;
	}

	public String getName() {
		return this.name;
	}

	public int getPriceCode() {
		return this.priceCode;
	}

	public void setPriceCode(int priceCode) {
		this.priceCode = priceCode;
	}
}
