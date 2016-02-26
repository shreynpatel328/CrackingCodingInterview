package linkedList;

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
public class kthfromLast 
{
	link first=null;
	link last=null;
	public static void main(String args[])
	{
		kthfromLast list = new kthfromLast();
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(1);
		list.insert(4);
		list.insert(1);
		list.insert(5);
		list.insert(6);
		list.disp();
		list.displaykth(4);
	}
	public void displaykth(int k)
	{
		link curr= first;
		link last = first;
		int i = 0;
		while(curr!=null)
		{
			if(i>k-1)
			{
				last = last.next;
			}
			curr = curr.next;
			i++;
		}
		System.out.println(last.data);
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
