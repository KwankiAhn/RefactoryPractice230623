package refactorSample;

public class JuniorEngineer extends EngineerType {

	@Override
	public int getLevel() {
		// TODO Auto-generated method stub
		return EngineerType.JuniorEngineer;
	}

	public int calcPayment(int daysEnrollment) {

		return (200000 * daysEnrollment);

	}

}
