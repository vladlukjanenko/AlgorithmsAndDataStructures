package datastructures.simple.structures;

public class StructuresTest {

	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<Integer>(5);
		
		System.out.println(stack.size());
		
		stack.push(3);
		stack.push(2);
		stack.push(4);
		stack.push(1);
		stack.push(5);

		System.out.println(stack.size());
		
		stack.push(7);
		
		System.out.println(stack.size());
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		System.out.println(stack.pop());

	}

}
