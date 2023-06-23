package refactorSample;

public class SeniorEngineer extends EngineerType {

	@Override
	public int getLevel() {
		// TODO Auto-generated method stub
		return EngineerType.SeniorEngineer;
	}

	public int calcPayment(int daysEnrollment) {
		return (500000 * daysEnrollment);
	}

}