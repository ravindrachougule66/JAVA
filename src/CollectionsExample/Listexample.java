package CollectionsExample;

import java.util.ArrayList;
import java.util.List;

public class Listexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ArrayList <Integer> al = new ArrayList<Integer>();
		List<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		
		//System.out.println(al.get(2));
		//al.remove(2);
		//System.out.println(al.get(2));
		/*
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		*/
		for(int i:al)
		{
			System.out.println(i);
		}

	}

}
