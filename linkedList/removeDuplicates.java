package linkedList;

import java.util.HashSet;
import java.util.Iterator;

class link
{
	int data;
	link next;
	link(int data, link next)
	{
		this.data = data;
		this.next = next;
	}
}
public class removeDuplicates 
{
	link first=null;
	link last=null;
	public static void main(String args[])
	{
		removeDuplicates list = new removeDuplicates();
		
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(1);
		list.insert(4);
		list.insert(1);
		list.insert(5);
		list.insert(6);
		list.disp();
		list.remove();
		list.disp();
		
	}
	public void remove()
	{
		HashSet hset= new HashSet();
		link curr = first;
		link prev =null;
		while(curr!=null)
		{
			if(hset.contains(curr.data))
			{
				prev.next = curr.next;
				curr= curr.next;
			}
			else
			{
				hset.add(curr.data);
				prev= curr;
				
			}
			
		}
		
	}
	public void insert(int data)
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

