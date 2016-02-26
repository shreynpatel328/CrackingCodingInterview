package Arrays;

public class stringRotate 
{
	public static void main(String args[])
	{
		String a="waterbottlea";
		String b="erbottlewat";
		String c = b+b;
		if(isSub(c,a))
			System.out.println("true");
		else
			System.out.println("fasle");
		
	}
	public static boolean isSub(String a, String b)
	{
		int index=0;
		for(int i=0;i<a.length();i++)
		{	
			if(index<b.length() && a.charAt(i)==b.charAt(index))
			{
				index++;
				continue;
			}
			else if(index!=0 && index!=b.length()) 
				return false;
		}
		return true;
	}
}
