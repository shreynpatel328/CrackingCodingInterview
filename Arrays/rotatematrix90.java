package Arrays;

public class rotatematrix90 
{
	public static void main(String args[])
	{
		int count=1;
		int a[][] = new int [3][3];
		for(int i=0;i<3;i++)
			for(int j=0;j<3;j++)
				{a[i][j] = count; count++;}
		
		for(int i = 0; i<a.length/2;i++)
		{
			int start = i;
			int last = a.length-1-i;
			for(int j=start;j<last;j++)
			{
				int offset  = j-start;
				int tmp = a[start][j];
				a[start][j] = a[last-offset][start];
				a[last - offset][start] = a[last][last  -offset];
				a[last][last  -offset] = a[i][last];
				a[i][last] = tmp;
			}
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
				{
					System.out.print(a[i][j]+" ");
				}
		
		System.out.println();
		}
	}
}
