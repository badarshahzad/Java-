import java.util.*;
public class EmployeeFLSalary {

//to call method in main
	public EmployeeFLSalary(){
		super();
	}
	
	public String toString(int salary,String fname,String lname){
		
		return String.format("Employee's name is %s %s and his salary is %d",fname,lname,salary);
	}
	
	public static void main(String[] args) {
		//double salary;
		//why it is not work with double salary??
		int salary;
		String fname=new String();
		String lname=new String();
		//for input
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter your First Name: ");
		fname=input.nextLine();
		System.out.println("Enter your Last Name: ");
		lname=input.nextLine();
		System.out.println("Enter your Salary : ");
		salary=input.nextInt();
		
		//here we make oject to call method in main
		EmployeeFLSalary object=new EmployeeFLSalary();
		System.out.println(object.toString(salary, fname, lname));
		
		
	}

}
