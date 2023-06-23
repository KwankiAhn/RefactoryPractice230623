package hellojava;

public class ClassicMovie extends MovieType {

	@Override
	public int getLineAmount(int daysRented) {
		int lineAmount = 1500;
		if (daysRented > 3) {
			lineAmount += (daysRented - 3) * 1500;
		}
		return lineAmount;
	}
}
