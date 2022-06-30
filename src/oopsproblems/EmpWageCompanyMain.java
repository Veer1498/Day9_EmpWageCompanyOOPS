package oopsproblems;

/**
 * 
 * Employee Wage using OOPS Concept
 * @author singa
 *
 */
public class EmpWageCompanyMain {
	/*
	 * Created a Class EmpWageMain.
	 * Created a function Main
	 * Created a New Object EmpWageObj.
	 * Call the Required Functions using new Object name.
	 * Here, welcome and Method Functions were Called Directly
	 * 
	 */
	public static void main(String[] args) {
		EmpWageCompany empwage =new EmpWageCompany();
		empwage.Welcome();
		empwage.EmpWageCompany("Dmart",20, 20,100);
		empwage.EmpWageCompany("Reliance",28, 20,100);

	}
}
