import java.io.*;
import java.util.*;

public class ReadFromFile {
	//the scanner the is the variable to call the file 
	private Scanner x;
	public void openFile(){
		try{
			//the file that exit
			x=new Scanner(new File("D:\\Year 2 Namal Smester 1\\Software Development 1\\Read4File\\badar.txt"));
		}
		catch(Exception e){
			//in case of when we don't find the file
			System.out.println("coutld not find file");
		}
	}
	
	public void readFile(){
		while(x.hasNext())
		{
			//we will get data from txt file in these string variables
			String a=x.next();
			String b=x.next();
			String c=x.next();
			
			System.out.printf("%s %s %s ",a,b,c);
		}
	}
	
//method to close the file 
	public void closeFile(){
		x.close();
	}
}
