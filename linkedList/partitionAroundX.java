package linkedList;
/*
class link
{
	int data;
	link next;
	link(int data, link next)
	{
		this.data = data;
		this.next = next;
	}
}*/
public class partitionAroundX 
{
	link first=null;
	link last=null;
	public static void main(String args[])
	{
		partitionAroundX list = new partitionAroundX();
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(1);
		list.insert(4);
		list.insert(1);
		list.insert(5);
		list.insert(6);
		list.disp();
		list.partition(4);
		list.disp();	
	}
	
	public void partition(int data)
	{
		link list1 = new link(0,null);
		link list2 = new link(0,null);
		link head = list1;
		link head1 = list2;
		link curr=first;
		while(curr!=null)
		{
			if(curr.data>=data)
			{
				list2.next = new link(curr.data,null);
				list2 = list2.next;
			}
			else
			{
				list1.next = new link(curr.data,null);
				list1 = list1.next;
			}
			curr = curr.next;
		}
		list1.next = head1.next;
		list2.next = null;
		first = head.next;
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
