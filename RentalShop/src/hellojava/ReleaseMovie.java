package hellojava;

public class ReleaseMovie extends MovieType {

	@Override
	public int getLineAmount(int daysRented) {
		return (daysRented * 3000);
	}
}
