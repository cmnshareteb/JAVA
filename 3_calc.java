import java.io.*;
import java.util.Scanner;


class calc
{
	public static void main(String args[])
	{
		int ch;
		float num1,num2,ans;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("\nWelcome to calc\n");
		System.out.println("\nEnter first number:\n");
		num1=sc.nextFloat();
		System.out.println("\nEnter second number:\n");
		num2=sc.nextFloat();
		System.out.println("\n1:Add\n2:Subtract\n3:Multiply\n4:Division");
		ch=sc.nextInt();
		switch(ch)
		{
			case 1:
				ans=num1+num2;
				System.out.println("Add="+ans);
				break;
			case 2:
				ans=num1-num2;
				System.out.println("Sub="+ans);
				break;
			case 3:
				ans=num1*num2;
				System.out.println("Mul="+ans);
				break;
			case 4:
				ans=num1/num2;
				System.out.println("div="+ans);
				break;
			default:
				System.out.println("Please enter a valid option!LOL!");
				break;
		}
		sc.close();
	}
}