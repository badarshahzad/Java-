import java.io.File;
public class FileHandling {

	public static void main(String[] args) {

		File nameOfFile=new File("D:\\Year 2 Namal Smester 1\\Software Development 1\\FileHandling\\badar.txt");
		if(nameOfFile.exists())
			System.out.println(nameOfFile.getName()+" this file exist");
		else
			System.out.println("it doesn't exist");
	}

}
