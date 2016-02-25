package Arrays;
/*
 *   Implement an algorithm to determine if a string has all unique characters
 */
public class isUnique 
{
	public static void main(String args[])
	{
		String a = "abcderfgh";
		boolean flag = true;
		for(int i=0;i<a.length();i++)
		{
			if(i!=a.lastIndexOf(a.charAt(i)))
			{
				flag = false;
				break;
			}
		}
		System.out.println(flag);
	}
}
