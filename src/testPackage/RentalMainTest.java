package testPackage;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

import hellojava.Customer;
import hellojava.Rental;
import hellojava.Movie;
import hellojava.MovieType;

class RentalMainTest {

	@Test
	void test() {
		ByteArrayOutputStream testOut = new ByteArrayOutputStream();
		PrintStream stdOut = System.out;
		System.setOut(new PrintStream(testOut));
		
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
		
		String goldenMaster = "DO\n"
				+ "Statement\n"
				+ "WaterWorld	4500\n"
				+ "IronMan	8000\n"
				+ "Avengers	21000\n"
				+ "Hulk	9000\n"
				+ "Total	42500\n"
				+ "Bonus Point:	5\n"
				+ "\n"
				+ "GO\n"
				+ "Statement\n"
				+ "WaterWorld2	4500\n"
				+ "IronMan2	8000\n"
				+ "AvengersEndgame	21000\n"
				+ "Hulk	9000\n"
				+ "Total	42500\n"
				+ "Bonus Point:	5\n\n"
				+ "";
		assertEquals(goldenMaster, testOut.toString());
		
		System.setOut(stdOut);
		
	}

}
