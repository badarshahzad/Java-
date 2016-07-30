import java.text.Format;

import javax.sound.sampled.ReverbType;

public class Testing extends superclass{

	public Testing() {
		
		System.out.println("child 1");
		}
	
	public Testing(int a) {
		super(a);
	System.out.println("child");
	}

	public static void main(String[] args){
	
		Testing kaka=new Testing();
		Testing kaka1=new Testing(1);
		
		System.out.println("main");
		
		
	}
}