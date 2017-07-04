import java.io.*;
import java.util.Scanner; 

public class Input
{
        
	public static void main(String args[])
	{
	  int roll_no;
          double fees;
          String name;
        
	     Scanner sc=new Scanner(System.in);
	     
	     System.out.println("\nEnter your Roll number:--\n");
	     roll_no=sc.nextInt();
	     
	     System.out.println("\nEnter your name:--\n");
	     name=sc.next();
	     
	     System.out.println("\nEnter your Fees:--\n");
	     fees=sc.nextDouble();
	     
	     System.out.println("\nRoll number="+roll_no+"\tName="+name+"\tFees="+fees);
	     
	     sc.close();
	    
	}
}
