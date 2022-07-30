package abstractiondemo;

import java.util.Scanner;

abstract class Vaccine {
public void firstdose() {
	int age;
	int amount=250;
	String nationality;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your age!:");
	age=sc.nextInt();
	System.out.println("Enter your Nationality!:");
	nationality=sc.next(); 
	 if(age>=18 && nationality.equals("Indian"))
	 {
		   System.out.println("User can take first dose.. "
		                     +'\n'+"Enter your amount:");
			  amount=sc.nextInt();
		}
		else
		{
			System.out.println("User can't take First Dose");
			System.exit(0);
		}
		    if(amount>=250)
		    {
			 System.out.println("You have payed 250"
					    +'\n'+"vaccination succesful");
	        }
		    
		    else
		    {
			System.out.println("Please pay 250");
			System.exit(0);
		    }
}
	void seconddose(){
		System.out.println("You are eligible to take Second Dose");
		 System.out.println("Vaccination Successful");
		
		}
		abstract void boosterdose();
}
	class Lastdose extends Vaccine
	{
		public void boosterdose()
		{
			System.out.println("Now you are eligible to take Booster Dose");
		}
	}

	public class Vaccination {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Vaccine v=new Lastdose();
		v.firstdose();
		v.seconddose();
		v.boosterdose();

	}

}
