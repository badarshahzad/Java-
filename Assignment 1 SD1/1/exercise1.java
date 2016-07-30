public class exercise1{

	private static String firstName;
	private static String lastName;
	private static int salary;
	 //This is constructer that we are intialize the value
	 public exercise1()
	{
		 firstName="Ali";	
		 lastName="kaka";
		 salary=5000;
	}
	//set method for pass value
	public void set_firstname(String name)
	{
		exercise1.firstName=name;
	}
	//set method for pass value
	public  void set_lastname(String lName)
	{
		exercise1.lastName = lName;
	}
	//set method for pass value
	//if salary less that 0 than intialize 0
	public  void set_salary(int salaryOFemploy)
	{
		if(salaryOFemploy<0)
			salaryOFemploy=0;
		exercise1.salary=salaryOFemploy;
	}
	//get method for return value to main that we assign by set method 
	public  String get_firstname()
	{
		return exercise1.firstName;
	}
	//get method for main 
	public  String get_lastname()
	{
		return exercise1.lastName;
	}
	//get method for main
	public  int get_salary()
	{
		return exercise1.salary;
	}
	//after 10 percent increase in salary we make this method for main
	public int increase_salary(int rise_salary)
	{
		if(rise_salary<0)
			rise_salary=0;	
		exercise1.salary=rise_salary;
		int var;
		var=get_salary()/10;
		return exercise1.salary=get_salary()+var;
	}

}