package datastructures.heap;

/**
 * Represents Min Binary Heap data structure.
 * 
 * @author Vlad Lukjanenko
 *
 * */
public class MinHeap<E extends Comparable<E>> extends Heap<E> {

	/**
	 * Initialize empty heap with capacity.
	 * 
	 * @param heapSize initial capacity of the heap.
	 * */
	public MinHeap(int heapSize) {
		
		super(heapSize);
		
		buildMinHeap();
		print();
		
	}
	
	/**
	 * Initialize heap with array.
	 * 
	 * @param heapSize initial array.
	 * */
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

	/*
	 * Undefined for Min Binary Heap. It is more efficient to use Max Binary
	 * Heap.
	 */
	@Override
	public E heapMaximum() {
		return null;
	}

	/*
	 * Undefined for Min Binary Heap. It is more efficient to use Max Binary
	 * Heap.
	 */
	@Override
	public E extractMaximun() {
		return null;
	}

	/**
	 * Return min element of heap.
	 * 
	 * @return minimum element of the heap.
	 * */
	@Override
	public E heapMinimum() {
		return elements[0];
	}

	/**
	 * Extract minimum element and remove it from heap.
	 * 
	 * @return minimum element of the heap.
	 * */
	@Override
	public E extractMinimum() {
		
		if (heapSize < 1) {
			return null;
		}
		
		E min = elements[0]; // get min element
		
		elements[0] = elements[heapSize - 1];
		heapSize--;
		minHeapify(elements, 0);
		
		return min;
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
			System.out.println("New key is less than current.");
		} else {
			
			elements[i] = key;
			
			while (i > 0 && elements[parent(i)].compareTo(elements[i]) > 0) {
				
				swap(elements, i, parent(i));
				i = parent(i);
				
			}
			
		}
		
	}
	
}
