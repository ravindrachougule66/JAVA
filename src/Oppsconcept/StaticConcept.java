package Oppsconcept;

public class StaticConcept {
	
	public static int sal = 10000;
	
	public StaticConcept(int sal)
	{
		this.sal=sal;
	}
	public static void getsalary()
	{
		System.out.println(sal);
	}
	public static void changesalary()
	{
		System.out.println("change salary"+(sal-5000));
	}

}
