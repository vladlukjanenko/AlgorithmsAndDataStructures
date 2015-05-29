package datastructures.simple.structures;

public class StructuresTest {

	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<Integer>(5);
		
		stack.push(3);
		stack.push(2);
		stack.push(4);
		stack.push(1);
		stack.push(5);
		
		System.out.println(stack.size());

		Queue<Integer> queue = new Queue<Integer>(5);
		
		queue.enqueue(2);
		queue.enqueue(1);
		
		System.out.println(queue.size());
		
		System.out.println(queue.dequeue());
		
		System.out.println(queue.size());
		
				
		
	}

}
