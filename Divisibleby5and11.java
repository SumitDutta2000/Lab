package basicprogram;
import java.util.Scanner;

public class Divisibleby5and11 {
	public static void main(String[] args) {
		int a;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please Enter any Number to Check whether it is Divisible by 5 and 11 :");
		a=sc.nextInt();
		
		if((a % 5 == 0) && (a % 11 == 0))
			System.out.println(" Given number "+ a + " is divisible by 5 and 11 ");
		
		else
		    System.out.println(" Given number " + " is not divisible by 5 and 11 ");
			
	}

}
