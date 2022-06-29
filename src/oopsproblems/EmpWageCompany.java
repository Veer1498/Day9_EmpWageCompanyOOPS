package oopsproblems;

public class EmpWageCompany {

	/**
	 * Created Separate Class named EmpWageObject
	 * Assigned some instance variables with public static final
	 * because we are going to use them in methods
	 * Created a Function Welcome with print statement
	 * created another function Variables and Assigned Values
	 *  Created another function Method and did all the computation Required.
	 *  For Computation, Took a WHILE loop and a Random Variable
	 *  A SWITCH CASE created for separating Present or absent or PartTime
	 *  Finally Computed TotalEmployee of Wage of Full Month and for Max Working Hours
	 *  
	 * 
	 */
	
	public static final int employeePresent = 1;
	public static final int employeePartTime = 2;
	
	public static final int WagePerHour = 20;
	
	public static final int NumberOfWorkingDays =20;
	public static final int TotalHoursinMonth = 100;
	
	 static int  numberOfHours;
	 static int empWagePerDay;
	 static int nHours;
     static int totalWorkDays;
     static int totalWorkHours;
	 static int totalEmployeeWage;
	 
	//Welcome Message
	 public static void  Welcome() {
		System.out.println("Welcome to Employee Wage Computation program");
		}
	 //Variables
	public static void Variables () {
		 numberOfHours = 0;
		 empWagePerDay = 0;
		 nHours=0;
	     totalWorkDays = 0;
	     totalWorkHours = 0;
		 totalEmployeeWage =0;
	 	}
	// Method
	 public static void Method() {
		while (totalWorkHours< TotalHoursinMonth && totalWorkDays <= NumberOfWorkingDays) {
			int isPresent = (int) Math.floor(Math.random()*10) %3;
			switch (isPresent) {
				case employeePresent :
					numberOfHours =8;
					totalWorkHours =totalWorkHours + numberOfHours;
					totalWorkDays++;
					nHours+=numberOfHours;
					break;
				case employeePartTime :
					numberOfHours =4;
					totalWorkHours =totalWorkHours + numberOfHours;
					totalWorkDays++;
					nHours+=numberOfHours;
					break;

				default :
					numberOfHours = 0;
					totalWorkHours =totalWorkHours + numberOfHours;
					break;
					}
			}
			System.out.println("For a Month Max Days = " + totalWorkDays + " No. of Hours Reached = " +nHours);
			System.out.println(	"Employee If Worked Monthly Earn = " + ((numberOfHours) * WagePerHour) * NumberOfWorkingDays);
			totalEmployeeWage= totalWorkHours * WagePerHour;
			System.out.println("Total Employee Wage for Max Hours or Days reached is "+ totalEmployeeWage);
		}

}
