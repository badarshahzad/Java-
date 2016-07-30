/*import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListSwitchPairs {

	private int len=0;
	public void SwitchPairs(ArrayList<String> string){
		String temp;
		for(int a=0;a<len;a++){
			temp=string.get(a);
			string.set(a,string.get(a+1) );
			string.set(a+1, temp);
		}
		for(String s: string)
			System.out.println(s);
	}
	
	
	public static void main(String[] args){
	ArrayList<String> array = new ArrayList<String>();	
	ArrayList<String> strings=new ArrayList<String>();
	strings.add(0,"four");
	strings.add(1,"score");
	strings.add(2,"and");
	strings.add(3,"seven");
	strings.add(4,"years");
	strings.add(5,"ago");
	ArrayListSwitchPairs obj = new ArrayListSwitchPairs();
	obj.SwitchPairs(strings);
	}
}
*/