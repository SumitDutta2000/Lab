package basicprogram;
import java.util.Scanner;

public class BonusCalculation {

	public static void main(String[] args) {
		int servingYear,bonus=0,joiningYear,currentYear;
		
		System.out.println(" Enter the Joining Year: ");
		Scanner sc=new Scanner(System.in);
		joiningYear=sc.nextInt();
		System.out.println("Enter the Current Year: ");
		currentYear=sc.nextInt();
        servingYear=currentYear-joiningYear;
        if(servingYear>3)
        	bonus=2500;
        System.out.println(" Bonus is: "+bonus);
        
	}

}    
