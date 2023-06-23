
package hellojava;

import java.util.ArrayList;

public class Customer {
	private String name;
	private ArrayList<Rental> rentals = new ArrayList<Rental>();

	public Customer(String name) {
		this.name = name;
	}

	public void addRental(Rental newRental) {
		rentals.add(newRental);
	}

	public String getNmae() {
		return this.name;
	}

	public String statement() {
		return calcRentalList(calcTotalAmount(), calcBounsPoints());
	}
	private int calcTotalAmount() {
		int totalAmount = 0;
		for (Rental rent : rentals) {
			totalAmount += rent.calcLineAmount();
		}
		return totalAmount;
	}
	private int calcBounsPoints() {
		int bonusPoints = 0;
		for (Rental rent : rentals) {
			bonusPoints = rent.calcBonusPoint(bonusPoints);
		}
		return bonusPoints;
	}
	private String calcRentalList(int totalAmount, int bonusPoints) {
		String rentalList = "Statement\n";
		for (Rental rent: rentals) {
			rentalList += rent.getMovie().getName() + "\t" + String.valueOf(rent.calcLineAmount()) + "\n";
		}

		rentalList += "Total\t" + String.valueOf(totalAmount) + "\n";
		rentalList += "Bonus Point:\t" + String.valueOf(bonusPoints) + "\n";
		return rentalList;
	}
}
