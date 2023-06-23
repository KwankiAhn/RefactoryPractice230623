package refactorSample;

public class Enrollment {
	private Engineer engineer;
	private int daysEnrollment;

	public Engineer getEngineer() {
		return engineer;
	}
	
	public int calcLineExpense() {
		int expense = 1000000;
		if(getEngineer().getLevel() == EngineerType.SeniorEngineer) {
			expense += 800000;
		}
		return expense;
	}

	public int calcPayment() {
		return engineer.calcPayment(daysEnrollment);

	}

	Enrollment(Engineer engineer, int days) {
		this.engineer = engineer;
		daysEnrollment = days;
	}
}
