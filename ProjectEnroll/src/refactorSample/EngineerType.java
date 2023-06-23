package refactorSample;

public abstract class EngineerType {

	public static final int SeniorEngineer =4;
	public static final int AssociateEngineer =3;
	public static final int AssitantEngineer =2;
	public static final int JuniorEngineer =1;

	public abstract int getLevel();
	public abstract int calcPayment(int daysEnrollment);
	public static EngineerType getInstance(int level) {
		switch (level) {
			case EngineerType.JuniorEngineer:
				return new JuniorEngineer();
			
			case EngineerType.SeniorEngineer:
				return new SeniorEngineer();
				
			case EngineerType.AssitantEngineer:
				return new AssistantEngineer();
				
			case EngineerType.AssociateEngineer:
				return new AssociateEngineer();
				
		}
		return null;
	}
	
}
