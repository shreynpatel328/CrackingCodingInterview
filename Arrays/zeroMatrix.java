package Arrays;

public class zeroMatrix 
{
	public static void main(String args[])
	{
		int a[][] = new int [5][5];
		boolean rowZero = false;
		boolean colZero  =false;
		for(int i=0;i<a.length;i++)
		{
			if(a[0][i]==0)
				rowZero = true;
		}
		for(int i=0;i<a[0].length;i++)
		{
			if(a[i][0]==0)
				colZero = true;
		}
		for(int i=1;i<a.length;i++)
		{
			for(int j=1;j<a[0].length;j++)
			{
				if(a[i][j]==0)
				{
					a[i][0] = 0;
					a[0][j]=0;
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i][0]==0)
			{
				for(int j=0;j<a[0].length;j++)
					a[j][i] = 0;
			}
		}
		for(int i=0;i<a[0].length;i++)
		{
			if(a[0][i]==0)
			{
				for(int j=0;j<a.length;j++)
					a[i][j] = 0;
			}
		}
		if(rowZero)
		{
			for(int j=0;j<a[0].length;j++)
				a[j][0] = 0;
		}
		if(colZero)
		{
			for(int j=0;j<a[0].length;j++)
				a[0][j] = 0;
		}
		
	}
}
