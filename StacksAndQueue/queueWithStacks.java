package StacksAndQueue;

import java.util.Stack;

public class queueWithStacks 
{
	Stack st = new Stack();
	Stack st1 = new Stack();
	
	public void enqueu(int data)
	{
		st.push(data);
	}
	public int dequeu()
	{
		if(st1.empty())
		{
			while(!st.empty())
			{
				st1.push(st.pop());
			}
		}
		return (int)st1.pop();
		
	}
	public static void main(String args[])
	{
		queueWithStacks in = new queueWithStacks();
		in.enqueu(1);
		in.enqueu(2);

		in.enqueu(3);

		in.enqueu(4);
		System.out.println(in.dequeu());
		System.out.println(in.dequeu());
		System.out.println(in.dequeu());
		System.out.println(in.dequeu());
		in.enqueu(4);
		in.enqueu(2);
		System.out.println(in.dequeu());
	}
}
