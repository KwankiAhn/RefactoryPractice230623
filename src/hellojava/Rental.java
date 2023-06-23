package hellojava;

public class Rental {
	private int daysRented;
	private Movie movie;
	private MovieType movieType;

	Rental() {		
	}

	public Rental(int days, Movie myMovie) {
		setMovie(myMovie);
		setDaysRented(days);
	}

	private void setMovie(Movie movie) {
		this.movie = movie;
		this.movieType = MovieType.getInstance(this.movie.getPriceCode());
	}
	private void setDaysRented(int daysRented) {
		this.daysRented = daysRented;
	}

	public Movie getMovie() {
		return this.movie;
	}

	public int calcBonusPoint(int bonusPoints) {
		bonusPoints++;
		if ((getMovie().getPriceCode() == MovieType.RELEASE) && (daysRented > 1)) {
			bonusPoints++;
		}
		return bonusPoints;
	}

	public int calcLineAmount() {
		int lineAmount = 0;
		lineAmount = movieType.getLineAmount(daysRented);

		return lineAmount;
	}
}