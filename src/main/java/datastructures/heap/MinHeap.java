package datastructures.heap;

public class MinHeap<E extends Comparable<E>> extends Heap<E> {

	public MinHeap(int heapSize) {
		
		super(heapSize);
		
		
		
	}
	
	public MinHeap(E[] elements) {
		
		super(elements);
		
		buildMinHeap();
		print();
		
	}
	
	/**
	 * Build min heap.
	 * */
	public void buildMinHeap() {
		
		for(int i = heapSize/2; i >= 0 ; i--) {
			minHeapify(elements, i);
		}
		
	}
	
	/**
	 * Makes balancing of non growing heap.
	 * */
	public void minHeapify(E[] a, int i) {

		int l = left(i);
		int r = right(i);

		int smallest = i;

		/* l <= heap_size[A] and A[l] < A[i] */
		if (l < heapSize && a[l].compareTo(a[i]) < 0)
			smallest = l;

		/* r <= heap_size[A] and A[r] < A[smallest] */
		if (r < heapSize && a[r].compareTo(a[smallest]) < 0 )
			smallest = r;

		if (smallest != i) {
			
			swap(a, i, smallest);
			minHeapify(a, smallest);
		}
	}
	
}
