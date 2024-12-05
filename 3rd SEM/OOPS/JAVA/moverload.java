import java.util.Scanner;
class Moverload 
{
	public void m1()
	{
	System.out.println("No arg");
	}
	public void m1(int j)
	{
	System.out.println("int arg");
	}
	public void m1(double j)
	{
	System.out.println("int arg");
	}
	public static void main (String args[])
	{
			Moverload m=new Moverload();
			m.m1();
			m.m1(5);
			m.m1(7.5);
	
	}
}