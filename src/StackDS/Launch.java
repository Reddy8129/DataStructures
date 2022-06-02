package StackDS;

public class Launch {

	public static void main(String[] args) {
		Stack stack = new Stack(5);
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);

		stack.display();
		System.out.println();
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println();
		stack.display();
		
	}

}
