package hellojava;

public class RegularMovie extends MovieType {

	@Override
	public int getLineAmount(int daysRented) {
		int lineAmount = 2000;
		if (daysRented > 2) {
			lineAmount += (daysRented - 2) * 1500;
		}
		return lineAmount;
	}

}
