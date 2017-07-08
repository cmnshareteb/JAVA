import java.io.*;

class employee 
{
	float salary=10000;
}

class my_inheritance extends employee
{
	float manager_salary=5000;
	public static void main(String args[])
	{
		my_inheritance m1=new my_inheritance();
		
		System.out.println("Total salary="+m1.salary);
		System.out.println("Total manager salary="+m1.manager_salary);
	}
}