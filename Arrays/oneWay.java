package Arrays;
/*
 * 	There are 3 types of edits that can be performed on strings; insert a character, remove a character, or replace a character. Given 2 strings 
 * 	write a functions to check if they one edit away.
 * 
 * 	eg 
 * 	pale, ple  - t
 * 	pales, pale - t
 * 	pale, bale - t
 * 	pale, bake  - f
 * 
 */
public class oneWay 
{
	public static void main(String args[])
	{
		String s1 = "pale";
		String s2 = "bake";
		
		String first = s1.length()>s2.length()? s2:s1;
		String second = s1.length()>s2.length()? s1:s2;
		int index1=0,index2=0;
		boolean flag = false;
		while(index1<first.length() && index2<second.length())
		{
			if(first.charAt(index1)!=second.charAt(index2))
			{
				if(flag)
				{
					System.out.println("false");
					return;
				}
				else
					flag = true;
			}
			else
			 index1++;
			
			index2++;
		}
		System.out.println("true");
	}
	
}
