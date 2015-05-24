package datastructures.heap;

public class HeapDemo {
	
	public static void main(String[] args) {
			
		Heap<Integer> minHeap = new MinHeap<Integer>(new Integer[] {6,10,2,4,5,1});
		
		minHeap.changeKey(1, 9);
		minHeap.print();
		
		System.out.println(minHeap.extractMinimum());
		minHeap.print();
		
		Heap<Integer> maxHeap = new MaxHeap<Integer>(new Integer[] {6,10,2,4,5,1});
		
		maxHeap.changeKey(1, 9);
		maxHeap.print();
		
		System.out.println(maxHeap.extractMaximun());
		maxHeap.print();
		
	}

}