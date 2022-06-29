package oopsproblems;

public class EmpWageCompany {

	public static final int employeePresent = 1;
	public static final int employeePartTime = 2;
	public static final int WagePerHour = 20;
	public static final int NumberOfWorkingDays =20;
	public static final int TotalHoursinMonth = 100;

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		System.out.println("Welcome to Employee Wage Computation Program");
	
		int numberOfHours = 0;
		int empWagePerDay = 0,nHours=0;
		int totalWorkDays = 0 , totalWorkHours = 0;
		int totalEmployeeWage =0;
		while (totalWorkHours< TotalHoursinMonth && totalWorkDays < NumberOfWorkingDays) {
		//totalWorkDays++;
		int isPresent = (int) Math.floor(Math.random()*10) %3;
		switch (isPresent) {
			case employeePresent :
				numberOfHours =8;
				totalWorkHours =totalWorkHours + numberOfHours;
				System.out.println("Employee is Prsent");
				System.out.println("Employee earn = " + numberOfHours * WagePerHour);
				totalWorkDays++;
				nHours+=numberOfHours;
				break;
			case employeePartTime :
				numberOfHours =4;
				totalWorkHours =totalWorkHours + numberOfHours;
				System.out.println("Employee is Part Time Present");
				System.out.println("Employee earn with PartTime= " + numberOfHours* WagePerHour);
				totalWorkDays++;
				nHours+=numberOfHours;
				
				break;

			default :
				numberOfHours = 0;
				totalWorkHours =totalWorkHours + numberOfHours;
				System.out.println("Employee is not Present");
				System.out.println("Employee earn = 0");
				break;
				}
		}
		System.out.println("days  = " + totalWorkDays + " No. of Hours = " +nHours);
		System.out.println(	"Employee Monthly Earn = " + ((numberOfHours) * WagePerHour) * NumberOfWorkingDays);
		totalEmployeeWage= totalWorkHours * WagePerHour;
		System.out.println("Total Employee Wage is "+ totalEmployeeWage);
	}

}
