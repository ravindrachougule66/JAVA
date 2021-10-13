package Oppsconcept;

public class mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*int a=4;
		System.out.println("Main= "+a);
		Calc c = new Calc();
		c.sum();
		c.sub();
		*/
		//polymorphism pol = new polymorphism(100,100);
		//pol.sum();
		
		StaticConcept sal = new StaticConcept(100000);
		//sal.getsalary();
		//StaticConcept.sal=55000;
		//StaticConcept.getsalary();
		//StaticConcept.changesalary();
		/*
		Autotesting at = new Autotesting();
		at.sanity();
		at.smoke();
		at.regression();
		at.defecttracking();
		*/
		
		Encapsulation en = new Encapsulation();
		System.out.println(en.getEmpName());
		System.out.println(en.getsalary());
	
		
		
	
	}

}
 