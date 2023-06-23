package refactorSample;

public class Engineer {
	private String name;
	private EngineerType type;

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getLevel() {
		return type.getLevel();
	}
	
	public void setLevel(int level) {
		type = type.getInstance(level);
	}
	Engineer(String name, int level) {
		setName(name);
		setLevel(level);
	}

	public int calcPayment(int daysEnrollment) {
		return type.calcPayment(daysEnrollment);
	}
}
