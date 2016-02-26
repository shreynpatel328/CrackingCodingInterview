package linkedList;

public class deleteMiddleNode 
{
	link first=null;
	link last=null;
	public static void main(String args[])
	{
		deleteMiddleNode list = new deleteMiddleNode();
		list.insert1(1);
		list.insert1(2);
		list.insert1(3);
		list.insert1(1);
		list.insert1(4);
		list.insert1(1);
		list.insert1(5);
		list.insert1(6);
		list.disp();
		list.delete(4);
		list.disp();
	}
	
	public void delete(int data)
	{
		link curr = first;
		link point  = null;
		while(curr!=null)
		{
			if(curr.data ==data)
			{	point = curr;
				break;
		
			}
			else
				curr = curr.next;
		}
		link prev = null;
		while(point.next!=null)
		{
			point.data = point.next.data;
			prev = point;
			point= point.next;
		}
		prev.next=null;
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
