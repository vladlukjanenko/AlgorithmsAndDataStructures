package datastructures.heap;

import datastructures.heap.Heap.HeapType;

public class HeapDemo {
	
	public static void main(String[] args) {
		
		Heap<Integer> heap = new Heap<Integer>(new Integer[] {6,10,2,4,5,1}, HeapType.MAX_HEAP);
		heap.print();
		
	}
	
}
