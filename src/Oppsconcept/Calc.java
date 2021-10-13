package Oppsconcept;

public class Calc 
{
	public static void main(String [] args)
	{
		System.out.println("This is Calc main");
		
		Calc c = new Calc();
		c.add(5, 4);
		c.add(10, 20);
		double s = c.div(12, 2);
		System.out.println(s);
	}
	
	int a=2;
	int b=4;
	public void sum()
	{
		System.out.println("Sum = "+(a+b));
	}
	public void sub()
	{
		System.out.println("Sub = "+(b-a));
	}
	public void add(int x, int y)
	{
		System.out.println("Add = "+(x+y));
	}
	public double div(int x, int y)
	{
		double d = x/y;
		return d;
		
	}
	

}
