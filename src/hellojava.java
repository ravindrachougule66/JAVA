import java.util.Scanner;

public class hellojava {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		//Area of rectangle
		System.out.println("Please enter lenth");
		int lenth = scan.nextInt();
		System.out.println("Please enter breadth");
		int breadth = scan.nextInt();
		
		int area = lenth*breadth;
		
		System.out.println("area of rectangle is="+area);
		
		/*
		//Area of circle
		System.out.println("please enter radius");
		int r = scan.nextInt();
		double pi = 3.14;
		double area = pi*r*r;
		
		System.out.println("Area of circle is="+area);
		*/
		/*
		//greatest number
		int num1, num2, num3;
		
		System.out.println("please enter first number");
		num1 = scan.nextInt();
		System.out.println("please enter second number");
		num2 = scan.nextInt();
		System.out.println("please enter third number");
		num3 = scan.nextInt();
		
		if(num1>num2 && num1>num3)
		{
			System.out.println("greatest number is first="+num1);
		}
		else if(num2>num3)
		{
			System.out.println("greatest number is second="+num2);
		}
		else
		{
			System.out.println("greatest number is third="+num3);
		}
		*/
		
		//simple interest
		// A = P(1 + rt)
		/*
		int p, t, c;
		double a, d, r, s;
		System.out.println("Enter principal amount");
		p = scan.nextInt();
		System.out.println("Enter interest rate");
		r = scan.nextDouble();
		System.out.println("Enter number of years");
		t = scan.nextInt();
		c=100;
		d= r/c;
		a = p*(1+ (d*t));
		s=a-p;
		 
		System.out.println("Simple interest is="+s);
		*/ 
			
	}
}
