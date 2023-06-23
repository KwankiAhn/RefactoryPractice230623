package refactorSample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RefactorUnitTest {

	@Test
	void test() {
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
		
		String goldenMaster = "Budget Report for Project <Refactoring>\n"
				+ "\n"
				+ "	Kim	 pay: 20000000\n"
				+ "	Lee	 pay: 2500000\n"
				+ "	Park	 pay: 3000000\n"
				+ "	Choi	 pay: 1500000\n"
				+ "\n"
				+ "Total Payment: 27000000\n"
				+ "Total Expense: 9800000\n"
				+ "\n"
				+ "*Estimated budget: 36800000\n";
		assertEquals(goldenMaster,reportResult);
	}

}
