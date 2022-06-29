package oopsproblems;

public class EmpWageCompany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("welcome to Employee Wage Computation");
		int employeePresent = 1;
		int isPresent = (int) Math.floor(Math.random()*10) %2;
		if (isPresent == employeePresent)
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is Absent");
	}

}
