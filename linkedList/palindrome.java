package linkedList;

import java.util.Stack;

public class palindrome 
{
	link first = null;
	link last = null;
	public static void main(String args[])
	{
		palindrome list = new palindrome();
		list.insert1(1);
		list.insert1(2);
		list.insert1(3);
		list.insert1(4);
		list.insert1(3);
		list.insert1(2);
		list.insert1(1);
		list.disp();
		System.out.println(list.stackPalin());
		System.out.println(list.palinReverseFromMiddle());
		//list.disp();
	}
	public boolean stackPalin()
	{
		Stack<Integer> st= new Stack();
		link curr =first;
		int len=0;
		while(curr!=null)
		{
			curr= curr.next;
			len++;
		}
		curr =first;
		for(int i=0;i<len/2;i++)
		{
			curr= curr.next;
		}
		if(len%2==1)
			curr = curr.next;
		
		while(curr!=null)
		{
			st.push(curr.data);
			curr= curr.next;
		}
		curr = first;
		while(!st.empty())
		{
			int val = st.pop();
			if(val!=curr.data)
				return false;
			curr = curr.next;
		}
		//System.out.println(curr.data);
		return true;
	}
	public boolean palinReverseFromMiddle()
	{
		link curr = first;
		int len=0;
		while(curr!=null)
		{
			curr= curr.next;
			len++;
		}
		curr =first;

		for(int i=1;i<len/2;i++)
		{
			curr= curr.next;
		}
		if(len%2==1)
			curr.next = curr.next.next;

		link prev1= curr;
		curr = curr.next;
		prev1.next = null;
		
		
		link prev = null;
		link next = null;
		//System.out.println(curr.data);
		while(curr!=null)
		{
			next = curr.next;
			curr.next = prev;
			prev =curr;
			curr= next;
		}
		curr= first;
	    next = prev;
		while(next!=null)
		{
			//System.out.print(next.data+"  ");
			next = next.next;
		}
		while(prev!=null)
		{
			//System.out.println(prev.data);
			if(prev.data!=curr.data)
			{
				return false;
			}
			else
			{
				prev = prev.next;
				curr =curr.next;
			}
		}
		return true;
	}
	public void insert1(int data)
	{
		link newNode = new link(data,null);
		if(first==null && last == null)
			first = newNode;
		else if(last ==null)
		{
			first.next = newNode;
			last = newNode;
		}
		else
		{
			last.next = newNode;
			last = newNode;
		}
		
	}
	public void disp()
	{
		link curr = first;
		while(curr!=null)
		{
			System.out.print(curr.data+" ");
			curr=  curr.next;
		}
		System.out.println();
	}
}
