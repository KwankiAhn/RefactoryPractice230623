package refactorSample;

public class AssociateEngineer extends EngineerType {

	@Override
	public int getLevel() {
		// TODO Auto-generated method stub
		return EngineerType.AssociateEngineer;
	}

	public int calcPayment(int daysEnrollment) {

		return (300000 * daysEnrollment);

	}

}
