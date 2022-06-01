package Arrays;

import java.util.Scanner;

public class IntArray 
{
	private int arr[];
	private Scanner scan = new Scanner(System.in);
	
	public IntArray(int size)
	{
		arr= new int[size];
	}
	
	public boolean insert(int element, int position)
	{
		if(position<arr.length)
		{
			arr[position]=element;
			return true;
		}
		else
		{
			System.out.println("Enter a valid index");
			return false;
		}
	}
	
	public boolean remove(int position)
	{
		if(position<arr.length)
		{
			arr[position]=0;
			return true;
		}
		else
		{
			System.out.println("Enter a valid index");
			return false;
		}
	}
	
	public int get(int position)
	{
		if(position<arr.length)
		{
			return arr[position];
		}
		else
		{
			System.out.println("Enter a valid index");
			return 0;
		}
	}
	public void displayAll()
	{
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
