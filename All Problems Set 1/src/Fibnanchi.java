/*import java.util.Scanner;

public class Fibnanchi {
	
	private int temp=0;
	public void setfibonacci(int num){
		temp=num;
		int s0=0;
		int s1=1;
		int sum=0;
		if(num==1 || num==0){
			temp=num;
			return;
		}
		for(int a=0;a<temp-1;a++){

			sum=s0+s1;
			s0=s1;
			s1=sum;
		}
		temp=sum;
	}
	public int getfibonacci(){
		return temp;
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		Fibnanchi obj = new Fibnanchi();
		int number;
		System.out.printf("Enter your number : ");
		number = input.nextInt();
		obj.setfibonacci(number);
		System.out.println("The Fibonacci number is : "+ obj.getfibonacci());
	}

}*/