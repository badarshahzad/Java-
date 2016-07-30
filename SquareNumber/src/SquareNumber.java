
import java.util.*;
public class SquareNumber {

	//to make some type of construct 
	public SquareNumber(){
		super();
	}
	//method
	public double Number_Square(double num)
	{
		return num*num;
	}
	
	public static void main(String[] args) {
	System.out.println("Enter your number: ");
	Scanner input=new Scanner(System.in);
	double num=input.nextDouble();
	
	//object made
	SquareNumber obj=new SquareNumber();
	//with this object we can call any method and pass argument
	System.out.println("The square of number is : "+ obj.Number_Square(num));

	}

}
