import java.io.*;

abstract class shape
{
	abstract void draw();
}

class rectangle extends shape
{
	void draw()
	{
		System.out.println("rectangle draw");
	}
}

class circle extends shape
{
	void draw()
	{
		System.out.println("circle draw");
	}
}

class my_abstract
{

	public static void main(String args[])
	{
		shape s=new circle();
		s.draw();
		shape s1=new rectangle();
		s1.draw();
	}
}