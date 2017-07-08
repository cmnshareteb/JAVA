import java.io.*;

class file_handling
{
	public static void main(String args[])
	{
		try
		{
			FileOutputStream fout=new FileOutputStream("test.txt");
			String str="Hello world!";
			byte b[]=str.getBytes();
			fout.write(b);
			fout.close();
			System.out.println("file writing successful");
			System.out.println("now reading from file");
			FileReader fr=new FileReader("test.txt");
			int i;
			while((i=fr.read())!=-1)
			{
				System.out.print((char)i);
			}
			fr.close();
		}
		catch(Exception e)
		{
			System.out.println("Caught exception!");
		}
	}
}