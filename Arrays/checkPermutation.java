package Arrays;
/*
 * Given two string find if the strings are permutation of each other.
 * 
 * 	eg god is the permutation of dog
 * 		god!  = !dog
 * 		god!   != aaadog
 */
public class checkPermutation 
{
	public static void main(String args[])
	{
		String a = "!god   ";
		String b = "aaadog!";
		boolean flag=true;
		if(a.length()!=b.length())
			flag = false;
		a = a.toLowerCase();
		b = b.toLowerCase();
		char letter[] = new char[128];
		
		for(int i=0;i<a.length();i++)
		{
			letter[a.charAt(i)]++;
		}
		for(int i=0;i<b.length();i++)
		{
			letter[b.charAt(i)]--;
			if(letter[b.charAt(i)]<0)
			{
				flag=false;
				break;
			}
		}
		for(int i=0;i<letter.length;i++)
		{
			if(letter[i]!=0)
				flag = false;
		}
		System.out.println(flag);
	}
}
