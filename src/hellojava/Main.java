package hellojava;

public class Main {

	public static void main(String[] args) {
		Customer me = new Customer("DO");
		me.addRental(new Rental(5, new Movie("WaterWorld", MovieType.CLASSIC)));
		me.addRental(new Rental(6, new Movie("IronMan", MovieType.REGULAR)));
		me.addRental(new Rental(7, new Movie("Avengers", MovieType.RELEASE)));
		me.addRental(new Rental(8, new Movie("Hulk", MovieType.CLASSIC)));
		System.out.println(me.getNmae());
		System.out.println(me.statement());
		me = new Customer("GO");
		me.addRental(new Rental(5, new Movie("WaterWorld2", MovieType.CLASSIC)));
		me.addRental(new Rental(6, new Movie("IronMan2", MovieType.REGULAR)));
		me.addRental(new Rental(7, new Movie("AvengersEndgame", MovieType.RELEASE)));
		me.addRental(new Rental(8, new Movie("Hulk", MovieType.CLASSIC)));
		System.out.println(me.getNmae());
		System.out.println(me.statement());
	}
}
