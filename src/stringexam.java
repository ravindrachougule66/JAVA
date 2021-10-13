
public class stringexam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		String str = " Automation Test Hub     ";
		String str2 = " automation test hub     ";
		
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println(str.trim());
		System.out.println(str.indexOf("Test"));
	
		if(str.indexOf("Hub")>0)
		{
			System.out.println("present");
		}
		else
		System.out.println("Not present");
	
		
		System.out.println(str.length());
		System.out.println(str.charAt(12));
		System.out.println(str.substring(12));
		System.out.println(str.substring(12,20));
		
		String s = "Your order placed successfully order number is DFJESDFRE8735678";
		System.out.println(s.substring(s.indexOf("is")+2).trim());
		
		System.out.println(str.equals(str2));
		System.out.println(str.equalsIgnoreCase(str2));
		
		String arr[] = str.split(" ");
		for(String s1:arr)
		{
			System.out.println(s1);
		}
		*/
		
		// count of char "a" in given string = Ravindra
		
		/*
		String str = "Ravindra";
		char ch = 'a';
		int count = 0;
		
		for (int f = 0; f< str.length(); f++)
		{
			if(str.charAt(f) == ch)
			{
				count++;
			}
		}
		System.out.println(count);
		*/
		/*
		String str = "Your transaction id DFJESDFRE87 successfully placed";	
		if(str.indexOf("id")>0)
		{			
			String arr[] = str.split(" ");
			int k=0;
			for(String s1:arr)
			{
				if(k<3)
				{
					k++;
				}
				else if(k==3)
				{
					System.out.println(s1);
					k++;
				}
			}
		}
		*/
		
		String str = "automation";
		
		String str1 = str.substring(0, 1);
		String str2 = str.substring(1, str.length());
		str1=str1.toUpperCase();
		String str3 = str1+str2;
		
		System.out.println(str3);
		
		
		
	}

}
