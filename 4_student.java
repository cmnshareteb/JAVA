import java.io.*;

public class student
{
	int ro_no;
	int age;
	String name;
	
	student()
	{
		this.ro_no=999999;
		this.name="\0";
		this.age=999999;
	}
	student(int ro_no,String name,int age)
	{
		this.ro_no=ro_no;
		this.name=name;
		this.age=age;
	}
	
	void show()
	{	
		System.out.println("Roll number--"+ro_no);
		System.out.println("name="+name);
		System.out.println("Age="+age);
	}
	
	public static void main(String args[])
	{
		student tst1=new student();
		System.out.println("\nDefault constructor:--\n");
		tst1.show();
		System.out.println("\nParameterised constructor:--\n");
		student pranav=new student(90,"Pranav",20);
		pranav.show();
	}
};

