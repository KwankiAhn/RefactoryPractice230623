package hellojava;

public class ReleaseMovie extends MovieType {

	@Override
	public int getLineAmount(int daysRented) {
		int lineAmount = (daysRented * 3000);
		return lineAmount;
	}
}
