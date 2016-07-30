import java.net.URL;
import java.security.SecureRandom;


public class CharacterCount{
	
	public static void main(String args[]){
		String g="a b c b";
		char BestCharacter = 0;
		int BestCount = 0;
		char temp;
		int num;
		int []count = new int[g.length()];
		char [] characters=new char[g.length()];
		for(int a=0;a<g.length();a++){
		characters[a]=g.charAt(a);
		}
		for(int a=0;a<g.length();a++){
			num=0;
			for(int b=0;b<g.length();b++){
				if(characters[a]==characters[b])
					count[a]=++num;
			}
		}
		for(int v=0;v<g.length();v++){
			BestCount=count[0];
			if(BestCount<=count[v]){
				BestCount=count[v];
				BestCharacter=characters[v];
			}
			if(BestCount==1)
				System.out.println("there is no charater that place many time");
		}
		System.out.println("Best char : "+ BestCharacter +" Best count is: "+ BestCount);
	}
}