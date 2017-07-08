import java.io.*;

class flower
{
	void smell()
	{
		System.out.println("smell of flower");
	}
}

class override extends flower
{
	void smell()
	{
		System.out.println("override of smell method");
	}
	public static void main(String args[])
	{
		override o1=new override();
		o1.smell();
		
	}
}