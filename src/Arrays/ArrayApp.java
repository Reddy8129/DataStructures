package Arrays;

import java.util.Scanner;

public class ArrayApp {

	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter array length");
//		int n= scan.nextInt();
		IntArray intArray = new IntArray(5);
		intArray.insert(10, 1);
		intArray.insert(20, 2);
		intArray.insert(30, 4);
		intArray.insert(40, 3);
		intArray.insert(50, 0);
		
		intArray.displayAll();
		
		System.out.println(intArray.get(3));
		
		intArray.remove(1);
		
		intArray.displayAll();
		

	}

}
