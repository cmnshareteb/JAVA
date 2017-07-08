import java.io.*;


class exception_handling
{
	public static void main(String args[])
	{
		int number=140;
		
		try
		{
			number=number/0;
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Caught specialised aritmatic exception");
		}
		catch(Exception e)
		{
			System.out.println("caught genereal exception");
		}
		finally
		{
			System.out.println("this is the final block!");
		}
		
		System.out.println("Now Qutting!!!");
	}
}

