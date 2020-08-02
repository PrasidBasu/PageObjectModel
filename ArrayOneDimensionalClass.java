package arrayPackage;
import java.util.*;
public class ArrayOneDimensionalClass 
{
	Scanner in = new Scanner(System.in);
	public void displayEmployeeDetails(int numberOfEmployee)
	{
		String[] nameOfEmployee = new String[numberOfEmployee];
		
		System.out.println("Enter all the employee names one by one");
		
		for(int i=0; i<numberOfEmployee; i++)
		{
			nameOfEmployee[i] = in.nextLine();
		}
		
		for(int i=0; i<numberOfEmployee; i++)
		{
			System.out.println("Name of the employees are:");
			System.out.println(nameOfEmployee[i]);
		}
	}
}
