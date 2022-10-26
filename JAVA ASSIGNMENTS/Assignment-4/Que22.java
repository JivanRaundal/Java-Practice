// Q. 22] STACK

import java.util.Scanner;

class Stack
{
	private int data[];
	private int top;
	
	public Stack()
	{
		data = new int[8];
		top = -1;
	}
	
	public boolean empty()
	{
		if(top == -1)
		{
			return true;
		}
		return false;
	}
	
	public boolean full()
	{
		if(top == 7)
		{
			return true;
		}
		return false;
	}
	
	public void push(int x)
	{
		if(!full())
		{
			top++;
			data[top] = x;
		}
		else
		{
			System.out.println("\nStack Full");
		}
	}
	
	public int pop()
	{
		int x = -1;
		if(!empty())
		{
			x = data[top];
			top--;
			return x;
		}
		else
		{
			System.out.println("\nStack Empty");
			return x;
		}
	}
}

class Que22
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		Stack st = new Stack();
		
		int num,x;
		System.out.print("\nEnter Number : ");
		num = sc.nextInt();
		
		while(!st.full())
		{
			st.push(num%2);
			num = num/2;
		}
		
		System.out.print("\n8 bit binary of number is = ");
		while(!st.empty())
		{
			x = st.pop();
			System.out.print(" " + x);
		}
	}
}
