package Arrays;
/*
 * a program to remove the space and convert to a url 
 * 	eg 
 *  Input 	"Mr john smith"
 * 	output  - "Mr%20john%20smith"
 * 
 * 
 * 	The catch of the program might be that it can contain more than one space in between words so have to split on the space.
 */
public class urlify 
{
	public static void main(String args[])
	{
		StringBuilder s = new StringBuilder();
		String a = "Mr      john smith";
		String parts[]  =a.split(" +");
		for(int i=0;i<parts.length-1;i++)
		{
			s.append(parts[i]);
			s.append("%20");
		}
		s.append(parts[parts.length-1]);
		System.out.println(s);
	}
}
