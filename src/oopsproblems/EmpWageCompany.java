package oopsproblems;

public class EmpWageCompany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("welcome to Employee Wage Computation");
		int employeePresent = 1;
		int employeePartTime = 2;
		int WagePerHour = 20;
		int numberOfHours = 0;
		int empWagePerDay = 0;
		int isPresent = (int) Math.floor(Math.random()*10) %3;
		if (isPresent == employeePresent) {
			numberOfHours =8;
			System.out.println("Employee is Present");
		}
		else if (isPresent == employeePartTime){
			numberOfHours =4;
			System.out.println("Employee is Part Time ");
		}
		else {
			numberOfHours = 0;
		System.out.println("Employee is Absent");
		}
		empWagePerDay = numberOfHours * WagePerHour;
		System.out.println("Employee Wage daily =" + empWagePerDay);
		
	}

}
