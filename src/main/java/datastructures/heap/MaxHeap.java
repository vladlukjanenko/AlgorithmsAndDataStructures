package datastructures.heap;

/**
 * Represents Max Binary Heap data structure.
 * 
 * @author Vlad Lukjanenko
 *
 * */
public class MaxHeap<E extends Comparable<E>> extends Heap<E> {

	/**
	 * Initialize empty heap with capacity.
	 * 
	 * @param heapSize initial capacity of the heap.
	 * */
	public MaxHeap(int heapSize) {
		
		super(heapSize);
		
		buildMaxHeap();
		print();
		
	}
	
	/**
	 * Initialize heap with array.
	 * 
	 * @param heapSize initial array.
	 * */
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

	/**
	 * Return max element of heap.
	 * 
	 * @return maximum element of the heap.
	 * */
	@Override
	public E heapMaximum() {
		return elements[0];
	}

	/**
	 * Extract maximum element and remove it from heap.
	 * 
	 * @return maximum element of the heap.
	 * */
	@Override
	public E extractMaximun() {
		
		if (heapSize < 1) {
			return null;
		}
		
		E max = elements[0]; // get max element
		
		elements[0] = elements[heapSize - 1];
		heapSize--;
		maxHeapify(elements, 0);
		
		return max;
		
	}
	
	/*
	 * Undefined for Min Binary Heap. It is more efficient to use Min Binary
	 * Heap.
	 */
	@Override
	public E heapMinimum() {
		return null;
	}

	/*
	 * Undefined for Min Binary Heap. It is more efficient to use Min Binary
	 * Heap.
	 */
	@Override
	public E extractMinimum() {
		return null;
	}

	/**
	 * Change existing key in the heap.
	 * 
	 * @param i index of key to be changed.
	 * @param key new key.
	 * */
	@Override
	public void changeKey(int i, E key) {
		
		if (key.compareTo(elements[i]) < 0) {
			System.out.println("New key is greater than current.");
		} else {
			
			elements[i] = key;
			
			while (i > 0 && elements[parent(i)].compareTo(elements[i]) < 0) {
				
				swap(elements, i, parent(i));
				i = parent(i);
				
			}
			
		}
		
	}
	
}
