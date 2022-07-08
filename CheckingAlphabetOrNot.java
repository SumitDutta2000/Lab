package basicprogram;

public class CheckingAlphabetOrNot {
       public static void main(String[] args) {
    	   char c='=';
    	  // if(c>'A' && c<='z')
    	   if((c>'A' && c<='z') || (c>'a' && c<='z'))
    	   System.out.println(c +" is an alphabet");
    	   else
    		   System.out.println(c +" is not an alphabet");;
    	  
    		        }
}
