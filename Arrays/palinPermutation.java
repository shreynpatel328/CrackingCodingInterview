package Arrays;

import java.util.ArrayList;
/*
 * Given a string check if we can derive a palindrome but permutation of the characters not considering spaces
 * 	
 * input : Tact Coa
 * output : true  (taco cat, atco cta) 
 */

public class palinPermutation 
{
	public static void main(String args[])
	{
		String a ="taco Coa";
		if(a.length()<1 ||a==null)
			return;
		ArrayList<Character> arr = new ArrayList();
		a = a.toLowerCase();
		for(int i=0;i<a.length();i++)
		{
			if(a.charAt(i)!=' ' )
			{
				if(arr.contains(a.charAt(i)))
					arr.remove(arr.indexOf(a.charAt(i)));
				else
					arr.add(a.charAt(i));
		
			}
			//System.out.println(arr);
		}
		if(arr.size()>1)
			System.out.println("false");
		else
			System.out.println("true");
	}
}
