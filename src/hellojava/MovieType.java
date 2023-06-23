package hellojava;

public abstract class MovieType {
	public static final int REGULAR = 0;
	public static final int CLASSIC = 1;
	public static final int RELEASE = 2;

	public abstract int getLineAmount(int daysRented);
	
	public static MovieType getInstance(int movieType) {
		switch (movieType) {
		case REGULAR:
			return new RegularMovie();
		case CLASSIC:
			return new ClassicMovie();
		case RELEASE:
			return new ReleaseMovie();	
		}
		return null;
	}
}
