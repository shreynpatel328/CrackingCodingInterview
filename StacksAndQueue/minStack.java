package StacksAndQueue;
import java.util.*;
public class minStack 
{
	Stack<Integer> st = new Stack();
	Stack<Integer> min = new Stack();
	public void push(int data)
	{
		if(!min.empty())
		{
			if(min.peek()>data)
				min.push(data);
			
		}
		else
		{
			min.push(data);
		}
		st.push(data);
	}
	public int pop()
	{
		int val  =st.pop();
		if(val==min.peek())
			min.pop();
		
		return val;
	}
	public int min()
	{
		return min.peek();
	}
	public static void main(String args[])
	{	
		minStack stack  = new minStack();
		stack.push(2);
		stack.push(4);
		stack.push(1);
		
		stack.push(0);
		System.out.println(stack.min());
		stack.pop();
		System.out.println(stack.min());
		stack.pop();
		System.out.println(stack.min());
	}
}
