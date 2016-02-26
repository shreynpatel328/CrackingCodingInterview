package Arrays;
/*
 * 	
 */
public class compressString 
{
	public static void main(String args[])
	{
		String s = "aaabbbcccccaaaaaaaaa";
		StringBuilder a = new StringBuilder();
		int count=1;
		for(int i=1;i<s.length();i++)
		{
			if(s.charAt(i-1)==s.charAt(i))
			{
				count++;
				continue;
			}
			else
			{
				a.append(s.charAt(i-1));
				a.append(""+count);
				count=1;
			}
		}
		a.append(s.charAt(s.length()-1));
		a.append(""+count);
		System.out.println(a);
	}
}
