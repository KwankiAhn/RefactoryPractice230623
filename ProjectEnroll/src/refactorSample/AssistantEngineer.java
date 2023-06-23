package refactorSample;

public class AssistantEngineer extends EngineerType {

	@Override
	public int getLevel() {
		// TODO Auto-generated method stub
		return EngineerType.AssitantEngineer;
	}

	public int calcPayment(int daysEnrollment) {

		return (250000 * daysEnrollment);

	}

}
