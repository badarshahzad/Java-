public class MainMehod
{
	public static  void main(String[] args)
	{
		//These are the variables 
		exercise1 emp1 = new exercise1();
		exercise1 emp1_setInfo = new exercise1();
		exercise1 emp2 = new exercise1();
		exercise1 emp2_setInfo = new exercise1();
		exercise1 emp1_increase_salary =new exercise1();
		exercise1 emp2_increase_salary =new exercise1();
		
		//Here we are intialize and set the info
		emp1_setInfo.set_firstname("Badar");
		emp1_setInfo.set_lastname("Shahzad");
		emp1_setInfo.set_salary(100000);
		
		//with get method we receive info
		System.out.println(emp1.get_firstname());
		System.out.println(emp1.get_lastname());
		System.out.println(emp1.get_salary());
		
		//This is new line space
		System.out.println();
		
		//set info
		emp2_setInfo.set_firstname("Badar Shahzad");
		emp2_setInfo.set_lastname("Khan");
		emp2_setInfo.set_salary(500000);
		
		//with get method we are gettting info
		System.out.println(emp2.get_firstname());
		System.out.println(emp2.get_lastname());
		System.out.println(emp2.get_salary());
		
		//new line
		System.out.println();
		
		//For employee 1 after 10% increasing in salary 
		System.out.print("Ten percent rise in salary become for Employee 1: ");
		emp1_increase_salary.increase_salary(100000);
		System.out.println(emp1.get_salary());
		
		//For employee 2 after 10% increasing in salary 
		System.out.print("Ten percent rise in salary become for Employee 2: ");
		emp2_increase_salary.increase_salary(500000);
		System.out.print(emp1.get_salary());
	}
}