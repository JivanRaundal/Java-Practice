// Q.25] WAP to implement SLL in JAVA

import java.util.*;

class Node
{
	int data;
	Node next;
	
	Node()
	{
		data = 0;
		next = null;
	}
	Node(int x)
	{
		data = x;
		next = null;
	}
}

class SLL
{
	Node head;
	
	SLL()
	{
		head = null; 
	}
	
	public void addAtBeg(int x)
	{
		if(head == null)
		{
			head = new Node(x);
		}
		else
		{
			Node p = new Node(x);
			p.next = head;
			head = p;
		}
	}
	
	public void createList()
	{
		Scanner sc = new Scanner(System.in);
		
		if(head != null)
		{
			System.out.println("\nList already created...");
			return;
		}
		
		String str;
		System.out.println("\nKeep Entering number or enter 'stop' to stop : ");
		while(true)
		{
			str = sc.next();
			if(str.equalsIgnoreCase("stop"))
			{
				break;
			}
			addAtEnd(Integer.parseInt(str));			//converting string into integer using Integer.parseInt();
		}
	}
	
	public void addAtEnd(int x)
	{
		if(head == null)
		{
			head = new Node(x);
		}
		else
		{
			Node p = head;
			while(p.next != null)
			{
				p = p.next;
			}
			p.next = new Node(x);
		}
	}
	
	public void showList()
	{
		System.out.println("\n\nList : ");
		if(head == null)
		{
			System.out.println("Empty List");
		}
		else
		{
			Node p = head;
			while(p != null)
			{
				System.out.print(" " + p.data);
				p = p.next;
			}
		}
	}
	
	public void delAtBeg()
	{
		if(head == null)
		{
			System.out.println("\nCannot delete ...list is empty");
			return;
		}
		if(head.next == null)			//list contains only 1 element
		{
			head = null;
		}
		else							//list contains multiple elements
		{
			head = head.next;
		}
	}
	
	public void delAtEnd()
	{
		if(head == null)
		{
			System.out.println("\nCannot delete ...list is empty");
			return;
		}
		if(head.next == null)			//list contains only 1 element
		{
			head = null;
		}
		else							//list contains multiple elements
		{
			Node p = head;
			Node q = null;
			while(p.next != null)
			{
				q = p;
				p = p.next;
			}
			q.next = null;
		}
	}
}

class Que25
{
	public static void main(String args[])
	{
		SLL list = new SLL();
		
		list.createList();
		
		list.showList();

		list.addAtBeg(22);
		list.addAtBeg(11);
		
		list.showList();
		
		list.addAtEnd(88);
		list.addAtEnd(99); 
		
		list.showList();
		
		list.delAtBeg();
		list.delAtBeg();
		
		list.showList();
		
		list.delAtEnd();
		list.delAtEnd();
		
		list.showList();
	}
}
