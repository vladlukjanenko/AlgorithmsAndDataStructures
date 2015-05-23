package datastructures.heap;

/**
 * Represents Binary Heap data structure. This class provides operations for
 * inserting and removing elements of binary heap.
 * 
 * @author Vlad Lukjanenko
 *
 * */
public abstract class Heap<E extends Comparable<E>> {

	/**
	 * Heap size.
	 * */
	protected int heapSize;

	/**
	 * Heap elements.
	 * */
	protected E[] elements;


	/**
	 * Initialize empty binary heap.
	 * 
	 * @param heapSize initial size of binary heap.
	 * */
	public Heap(int heapSize) {

		System.out.println("	Heap");
		System.out.println("Building...");
		
		this.heapSize = heapSize;
		
	}
	
	/**
	 * Initialize binary heap with array.
	 * 
	 * @param elements initial array.
	 * */
	public Heap(E[] elements) {

		this.heapSize = elements.length;
		this.elements = elements;

		System.out.println("	Heap");

		System.out.print("Input array: ");
		print();

		System.out.println("Building...");

	}
	
	/**
	 * Get array of heap elements.
	 * 
	 * @return elements heap elements.
	 * */
	public E[] getElements() {
		return elements;
	}

	/**
	 * Get parent element of i node.
	 * 
	 * @param i index of current node.
	 * @return index of parent node of node i.
	 * */
	public int parent(int i) {
		return (i - 1) / 2;
	}
	
	/**
	 * Get left child of i node.
	 * 
	 * @param i index of current node.
	 * @return index of left node of node i.
	 * */
	public int left(int i) {
		return 2 * i + 1;
	}
	
	/**
	 * Get right child of i node.
	 * 
	 * @param i index of current node.
	 * @return index of right node of node i.
	 * */
	public int right(int i) {
		return 2 * i + 2;
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
	 * Build min heap.
	 * */
	public void buildMinHeap() {
		
		for(int i = heapSize/2; i >= 0 ; i--) {
			minHeapify(elements, i);
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
	
	/**
	 * 
	 * */

	/**
	 * Swaps array elements that have indexes i and j.
	 * 
	 * @param arr an array of elements to be sorted
	 * @param i index of element of the array to be swapped
	 * @param j index of element of the array to be swapped
	 * @throws NullPointerException if array is null
	 * */
	public void swap(E[] arr, int i, int j) {
		
		if (arr == null) {
			throw new NullPointerException();
		} else {
			
			E temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp; 
		
		}
	}
	
	/**
	 * Print heap.
	 * */
	public void print() {
		
		for(int i = 0; i < elements.length; i++) 
			System.out.print(elements[i] + " ");
		
		System.out.println();
		
	}
	
}