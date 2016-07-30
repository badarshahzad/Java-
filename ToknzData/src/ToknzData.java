import java.util.Scanner;
public class ToknzData {

	
			public static void main(String[] args)
			{
				Scanner input = new Scanner(System.in);
				System.out.println("Give 1st employee's data: ");
				String emp1 ="{1,Khalil Khan,09-04-1987,32000,03332233445,2}{ 2,Noor Ali,12-11-1970,78600,03032243849,1 }{ 3,Rahman Khan,02-10-1974,55600,03418743877,1 }{ 4,Kashif Toor,23-06-1981,48800,03033563465,2 }{ 5,Fazle Haq,12-11-1983,167200,03219876974,0 }";
//				System.out.println("Give 2nd employee's data: ");
//				String emp2 = input.nextLine();
//				System.out.println("Give 3rd employee's data: ");
//				String emp3 = input.nextLine();
				String token[]=emp1.split(",");
//				String token2[]=emp2.split(",");
//				String tokken[]=emp3.split(",");
			    System.out.println("Serial Number:\t\tName:\t\tBirthday:\t\tSalary:\t\tPhone Number:\t\tCode:\t\t");
				for(int a=0;a<=5;a++)
				{
					System.out.print("\t\t"+token[a]);	
				}
			   
//				System.out.print("\n     "+Array[0]+"             "+token[7]+"        "+token[8]+"       "+token[9]+"          "+token[10]+"           "+token[11]);
//				System.out.print("\n     "+Array[0]+"             "+token[13]+"        "+token[14]+"       "+token[15]+"          "+token[16]+"           "+token[17]);
//				//System.out.print("Name :"+"\n"+token[1]);
				//System.out.print("Birth date :"+"\n"+token[2]);
				//System.out.print("Salary :"+"\n"+token[3]);
				//System.out.print("Phone Number :"+"\n"+token[4]);
				//System.out.print("code :"+"\n"+token[5]);
				
				
			}
}