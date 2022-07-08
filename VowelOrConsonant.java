package basicprogram;

import java.util.Scanner;

public class VowelOrConsonant {
	public static void main(String[] args) {
		char character;
		System.out.println("Enter a character:");
		Scanner  sc=new Scanner(System.in);
		character=sc.next().charAt(0);
		if(character=='a' || character=='e' || character=='i' || character=='o' || character=='I' || character=='O' || character=='U')
			
			System.out.println(character+" is a Vowel ");
		else
			System.out.println(character+" is a Consonant ");
			
		
	}
}