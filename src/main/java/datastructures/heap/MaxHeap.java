package datastructures.heap;

public class MaxHeap<E extends Comparable<E>> extends Heap<E> {

	public MaxHeap(int heapSize) {
		
		super(heapSize);
		
		
		
	}
	
	public MaxHeap(E[] elements) {
		
		super(elements);
		
		buildMaxHeap();
		print();
		
	}
	
	/**
	 * Build max heap.
	 * */
	public void buildMaxHeap() {
		
		for(int i = heapSize/2; i >= 0 ; i--) {
			maxHeapify(elements, i);
		}
		
	}
	
	/**
	 * Makes balancing of non flowing heap.
	 * */
	public void maxHeapify(E[] a, int i) {
		
		int l = left(i);
		int r = right(i);
		
		int largest;
		
		/* l <= heap_size[A] and A[l] > A[i] */
		if(l < heapSize && a[l].compareTo(a[i]) > 0) {
			largest = l;
		} else {
			largest = i;
		}
		
		/* r <= heap_size[A] and A[r] > A[largest] */
		if(r < heapSize && a[r].compareTo(a[largest]) > 0) {
			largest = r;
		}
		
		if(largest != i) {
			
			swap(a, i, largest);
			maxHeapify(a, largest);
			
		}
		
	}
	
}
