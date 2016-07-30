import java.util.Scanner;
public class tollbooth{

	private int total_NumberOfCars;
	private double total_amount;
	public tollbooth()
	{
		total_amount=0;
		total_NumberOfCars=0;
	}
	public double payingCar(int num_car)
	{
		total_NumberOfCars=num_car;

		double total=0;
		int amount=50;
		int score;
		for(int a=1;a<=num_car;a++)
		{

			score=a*amount;
			total=total+score;
		}
		total=total+0.50;
		
		return total_amount=total;
	}
	public double nopayCar(int num_car)
	{
		total_NumberOfCars=num_car;
		double total=0;
		int amount=50;
		int score;
		for(int a=1;a<=num_car;a++)
		{

			score=a*amount;
			total=total+score;
		}
		return total_amount=total;
	}
	public void display(int num_car)
	{
		
			//for payable 1 and non-payable cars 0
			Scanner input=new Scanner(System.in);
			System.out.print("Total Numbers of Paycars: ");
			System.out.println(payingCar(num_car));
			System.out.print("Toatal number of NopayCars: ");
			System.out.println(nopayCar(num_car));
	}
	public static void main(String[] args)
	{
		
		tollbooth  tb=new tollbooth();
		int numberOfCars;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the number of cars: ");
		numberOfCars=input.nextInt();
		tb.display(numberOfCars);	

	}

}