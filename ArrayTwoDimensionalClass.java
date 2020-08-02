package arrayPackage;

import java.util.Scanner;

public class ArrayTwoDimensionalClass 
{
	Scanner in = new Scanner(System.in);
	
	public String[][] getEmployeeDetails(int numOfEmployee)
	{
		String [][] employeeDetailVar = new String[numOfEmployee][3];
		
		System.out.println("Enter Employee Id, Name and Number");
		
		for (int i=0; i<numOfEmployee; i++)
		{
			employeeDetailVar[i][0] = in.nextLine();
			employeeDetailVar[i][1] = in.nextLine();
			employeeDetailVar[i][2] = in.nextLine();
		}
		
		return employeeDetailVar;
	}
	
	public void displayEmployeeDetails(int numOfEmployee)
	{
		String [][] employeeDetailVar = getEmployeeDetails(numOfEmployee);
		
		int actualNumberOfEmployee = employeeDetailVar.length;
		
		for (int i=0; i<actualNumberOfEmployee; i++)
		{
			System.out.println("Employee ID :\t" + employeeDetailVar[i][0]);
			System.out.println("Employee Name:\t" + employeeDetailVar[i][1]);
			System.out.println("Employee Number:\t" + employeeDetailVar[i][2]);
		}
		
	}
	
	public void searchAndDisplayEmployee(int numOfEmployee, String searchID)
	{
		int counter = 0;
		String [][] employeeDetailVar = getEmployeeDetails(numOfEmployee);
		
		int actualNumberOfEmployee = employeeDetailVar.length;
		
		for (int i=0; i<actualNumberOfEmployee; i++)
		{
			if(employeeDetailVar[i][0].equals(searchID))
			{
				System.out.println("Employee ID :\t" + employeeDetailVar[i][0]);
				System.out.println("Employee Name:\t" + employeeDetailVar[i][1]);
				System.out.println("Employee Number:\t" + employeeDetailVar[i][2]);
				counter = counter + 1;
			}
		}
		
		if(counter == 0)
		{
			System.out.println("Employee Cannot be found with the given ID");
		}
	}
}
