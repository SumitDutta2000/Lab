package basicprogram;
import java.util.Scanner;
  
public class UpperAndLower {
	public static void main(String[] args) {
		char character;
		
		System.out.println("Enter any Character:");
		Scanner sc=new Scanner(System.in);
		character=sc.next().charAt(0);
		
		if(character>='A' && character<='Z')
			System.out.println(character+" is in uppre case ");
		
		else if(character>='a' && character<='z');
		    System.out.println(character+" is in lower case ");
		
		
		
	}

}
