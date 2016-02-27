package StacksAndQueue;
import java.util.*;
public class threeStack1Array 
{
	int top1;
	int top2;
	int top3;
	int size;
	int a[];
	threeStack1Array(int capacity)
	{
		a = new int [capacity];
		top1 = -3;
		top2 = -2;
		top3 = -1;
		size = capacity;
	}
	public void insert(int i, int data)
	{
		if(i==1)
		{
			if(top1+3<size)
			{
				top1 +=3;
				a[top1] = data;
				
			}
			else
			{
				System.out.println("overflow");
			}
		}
		else if(i==2)
		{
			if(top2+3<size)
			{
				top2 +=3;
				a[top2] = data;
				
			}
			else
			{
				System.out.println("overflow");
			}
		}
		else
		{
			if(top3+3<size)
			{
				top3 +=3;
				a[top3] = data;
			}
			else
			{
				System.out.println("overflow");
			}
		}
	}
	public int pop(int i)
	{
		int val=0;
		if(i==1)
		{
			if(top1<0)
			{
				System.out.println("underflow");
			}
			else
			{
				val = a[top1];
				a[top1] = 0;
				top1 -=3;
				
			}
		}
		else if(i==2)
		{
			if(top2<0)
			{
				System.out.println("underflow");
			}
			else
			{
				val = a[top2];
				
				a[top2] = 0;top2 -=3;
				
			}
		}
		else
		{
			if(top3<0)
			{
				System.out.println("underflow");
			}
			else
			{
				val = a[top3];
				a[top3] = 0;
				top3 -=3;
			}
		}
		return val;
	}
	public void disp(int i)
	{
		for(int j=i-1;j<size;j=j+3)
		{
			System.out.print(a[j]+" ");
		}
	}
	public static void main(String args[])
	{
		threeStack1Array st = new threeStack1Array(12);
		st.insert(1, 1);
		st.insert(1, 2);
		st.insert(1, 2);
		st.insert(1, 2);
		st.insert(1, 2);
		st.insert(2, 2);
		st.insert(2, 3);
		//System.out.println(st.pop(1));
		st.disp(1);
		
	}
}
