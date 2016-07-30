/*import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriangleSides {

	//@SuppressWarnings("resource")
	public static void main(String[] args) throws FileNotFoundException{
		int a;
		String h = null;
		String b = null;
		String c = null;
		Scanner x;
		String[]s=new String[3];
			x=new  Scanner(new File("123.txt"));
		for(int a1=0;x.hasNext();a1++){
			s[a1]=(x.next());
			
		}
		int hyper=Integer.parseInt(s[0]);
		int prep=Integer.parseInt(s[1]);
		int base=Integer.parseInt(s[2]);
		if(Math.pow(hyper,2)==(Math.pow(base, 2)+(Math.pow(prep, 2)))){
			System.out.println("Values are for triangle. ");
		}
		else if(Math.pow(base,2)==(Math.pow(prep, 2)+(Math.pow(hyper, 2)))){
			System.out.println("Values are for triangle. ");
		}
		else if(Math.pow(prep,2)==(Math.pow(hyper, 2)+(Math.pow(base, 2)))){
			System.out.println("Values are for triangle. ");
		}
		else 
			System.out.println("Your are giving chuss input... :)");
		
	}

	
	
}
*/