package oopsproblems;

public class EmpWageCompany {

	public static final int employeePresent = 1;
	public static final int employeePartTime = 2;
	public static final int WagePerHour = 20;

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		System.out.println("Welcome to Employee Wage Computation Program");
	
		int numberOfHours = 0;
		int empWagePerDay = 0;
		int isPresent = (int) Math.floor(Math.random()*10) %3;
		switch (isPresent) {
			case employeePresent :
				numberOfHours =8;
				System.out.println("Employee is Present");
				break;
			case employeePartTime :
				numberOfHours =4;
				System.out.println("Employee is Part Time ");
				break;
			default :
				numberOfHours = 0;
				System.out.println("Employee is Absent");
		
		}
		empWagePerDay = numberOfHours * WagePerHour;
		System.out.println("Employee Wage daily =" + empWagePerDay);
	}

}
