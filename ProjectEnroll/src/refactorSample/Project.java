package refactorSample;

import java.util.ArrayList;

public class Project {
	private String name;
	private ArrayList<Enrollment> enrollments = new ArrayList<Enrollment>();
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	Project(String name) {
		setName(name);
	}
	
	public void addEnrollment(Enrollment enrollment) {
		this.enrollments.add(enrollment);
	}
	
	public String budgetReport() {
		int totalPayAmount = calcTotalPayment();
		int expense = calcExpense();
		String report = calcReport(totalPayAmount, expense);
		return report;
	}
	private int calcTotalPayment() {
		int totalPayAmount = 0;
		for(Enrollment enrollment: this.enrollments) {
			totalPayAmount += enrollment.calcPayment();
		}
		return totalPayAmount;
	}
	private int calcExpense() {
		int expense = 5000000;
		for(Enrollment enrollment: this.enrollments) {
			expense += enrollment.calcLineExpense();
		}
		return expense;
	}
	private String calcReport(int totalPayAmount, int expense) {
		String report = "Budget Report for Project <" + this.name + ">\n\n";
		for(Enrollment enrollment: this.enrollments) {
			report += "\t" + enrollment.getEngineer().getName() + "\t pay: " + enrollment.calcPayment() + "\n";
			
		}
		report += "\nTotal Payment: " + totalPayAmount + "\nTotal Expense: " +expense + "\n";
		report += "\n*Estimated budget: " + (totalPayAmount + expense) + "\n";
		return report;
	}
}
