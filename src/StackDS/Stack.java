package StackDS;

public class Stack 
{
	private int s[];
	private int top=-1;
	private int size;
	
	public Stack(int n)
	{
		s= new int[n];
		size = s.length;
	}
	
	public void push(int elem)
	{
		if(top==size-1)
			System.out.println("Stack Overflow");
		else
		{
			++top;
			s[top]=elem;
		}
	}
	public int pop()
	{
		int elem;
		if(top==-1){
			System.out.println("Stack Underflow");
			return 0;
		}
		else{
			elem=s[top];
			--top;
			return elem;
		}
	}
	public void display()
	{
		if(top==-1)
			System.out.println("Stack is empty");
		else
		{
			for(int i=top;i>=0;i--)
			{
				System.out.println(s[i]);
			}
		}
	}
}
