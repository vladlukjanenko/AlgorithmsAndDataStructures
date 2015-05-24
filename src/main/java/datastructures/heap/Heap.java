package datastructures.heap;

/**
 * Represents Abstract Binary Heap data structure. This class provides some
 * common operations for binary heap and also defines operations which must be
 * implemented in concrete classes.
 * 
 * @author Vlad Lukjanenko
 *
 * */
public abstract class Heap<E extends Comparable<E>> {

	/**
	 * Heap size.
	 * */
	public int heapSize;

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
		
		for(int i = 0; i < heapSize; i++) 
			System.out.print(elements[i] + " ");
		
		System.out.println();
		
	}
	
	public abstract E heapMaximum();
	public abstract E extractMaximun();
	public abstract E heapMinimum();
	public abstract E extractMinimum();
	public abstract void changeKey(int i, E key);
	
}