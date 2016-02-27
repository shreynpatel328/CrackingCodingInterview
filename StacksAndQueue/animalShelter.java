package StacksAndQueue;

import java.util.*;
public class animalShelter 
{
	Queue<Integer> cat = new LinkedList();
	Queue<Integer> dog = new LinkedList();
	int orderdog=0;
	int ordercat =0;
	public void enqueue(int type)
	{
		if(type==1)
		{
			dog.add(orderdog);
			orderdog++;
		}
		else
		{
			cat.add(ordercat);
			ordercat++;
		}
	}
	public int dequeueAny()
	{
		if(cat.isEmpty())
			return dog.remove();
		else if (dog.isEmpty())
			return cat.remove();
		if(dog.peek()>cat.peek())
			return cat.remove();
		else
			return dog.remove();
	}
	public int dequeDog()
	{
		return dog.remove();
	}
	public int dequeCat()
	{
		return cat.remove();
	}
	public static void main(String args[])
	{
		animalShelter hmap = new animalShelter();
		hmap.enqueue(1);
		hmap.enqueue(2);
		hmap.enqueue(1);
		hmap.enqueue(1);
		hmap.enqueue(2);
		hmap.enqueue(1);
		hmap.enqueue(2);
		System.out.println(hmap.dequeueAny());
		System.out.println(hmap.dequeueAny());
		System.out.println(hmap.dequeueAny());
		System.out.println(hmap.dequeDog());
		
		
	}
}
