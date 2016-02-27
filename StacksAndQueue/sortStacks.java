package StacksAndQueue;

import java.util.Stack;

public class sortStacks 
{
	public static Stack sort(Stack<Integer> st)
	{
		Stack<Integer>st1 = new Stack();
		if(st1.empty())
			st1.push(st.pop());
		while(!st.empty())
		{
			int tmp = st.pop();
			if(tmp>st1.peek())
			{
				st1.push(tmp);
			}
			else
			{
				while(!st1.empty() && tmp<st1.peek())
				{
					st.push(st1.pop());
				}

				st1.push(tmp);
			}
		}
		return st1;
	}
	public static void main(String args[])
	{
		Stack<Integer> st = new Stack();
		Stack<Integer> st1 = new Stack();
		st.push(5);
		st.push(1);
		st.push(3);
		st.push(4);
		st.push(2);
		st.push(6);
		st1 = sort(st);
		while(!st1.empty())
		{
			System.out.println(st1.pop());
		}
	}
}
