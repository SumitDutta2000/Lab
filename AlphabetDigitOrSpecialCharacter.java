package basicprogram;
import java.util.Scanner;
public class AlphabetDigitOrSpecialCharacter {
	public static void main(String[] args) {
		char ch;
		System.out.println("Enter a Character:");
		Scanner sc=new Scanner(System.in);
		ch = sc.next().charAt(0);
		
		
		if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
			
			System.out.println(ch+ " is an alphabet ");
		 
		else if(ch >= '0' && ch <= '8')
			System.out.println(ch+ " is a digit");
		
		else
			System.out.println(ch+ " is a special character ");
		
			
	}

}
