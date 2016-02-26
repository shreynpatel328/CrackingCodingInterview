package linkedList;

public class sumOfLinkedList 
{
	link first = null;
	link last = null;
	public static void main(String args[])
	{
		sumOfLinkedList list = new sumOfLinkedList();
		sumOfLinkedList list1 = new sumOfLinkedList();
		sumOfLinkedList list2 = new sumOfLinkedList();
		list.insert1(7);
		list.insert1(1);
		list.insert1(6);
		list1.insert1(5);
		list1.insert1(9);
		list1.insert1(4);

		list2 =  list2.sum(list,list1);
		list2.disp();
		
		

	}
	public sumOfLinkedList sum(sumOfLinkedList first,sumOfLinkedList second)
	{
		sumOfLinkedList third = new sumOfLinkedList();
		link index1 = first.first;
		link index2  =second.first;
		int carry=0;
		while(index1!=null && index2!=null)
		{
			int sum = index1.data+index2.data+carry;
			third.insert1(sum%10);
			carry = sum/10;
			index1  = index1.next;
			index2 = index2.next;
		}
		if(carry!=0)
		{
			third.insert1(carry);
		}
		return third;		
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
