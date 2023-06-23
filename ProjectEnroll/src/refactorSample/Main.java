package refactorSample;

public class Main {
	public static void main(String[] args) {
		Project myProject = new Project("Refactoring");
		Engineer kim = new Engineer("Kim",EngineerType.JuniorEngineer);
		Engineer lee = new Engineer("Lee",EngineerType.AssitantEngineer);
		Engineer park = new Engineer("Park",EngineerType.AssociateEngineer);
		Engineer choi = new Engineer("Choi",EngineerType.SeniorEngineer);
		
		myProject.addEnrollment(new Enrollment(kim, 100));
		myProject.addEnrollment(new Enrollment(lee, 10));
		myProject.addEnrollment(new Enrollment(park, 10));
		myProject.addEnrollment(new Enrollment(choi, 3));
		
		String reportResult = myProject.budgetReport();
		System.out.println(reportResult);
	}
}
