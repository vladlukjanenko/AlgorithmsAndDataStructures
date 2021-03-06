package algorithms.sorting;

import datastructures.heap.Heap;
import datastructures.heap.MaxHeap;

/**
 * Provides sorting of any array using Heap Sort algorithm.
 * The complexity of algorithm is O(n*logn).
 * 
 * @author Vlad Lukjanenko
 *
 * */
public class HeapSort<E extends Comparable<E>> extends Sorting<E> {

	/**
	 * Initialize array.
	 * 
	 * @param arr initial array.
	 * */
	public HeapSort(E[] arr) {
		
		super(arr);
		
		System.out.println("	Heap Sort Algorithm");
		print();
		System.out.println("Sorting ...");
	}

	/**
	 * Sorts array of elements using Heap Sort algorithm.
	 * */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public void sort() {
		
		// create maxHeap
		Heap<E> maxHeap = new MaxHeap<E>(arr);
		
		elapsedTime = System.nanoTime(); // get time of start
		
		for (int i = length - 1; i > 0; i--) {

			maxHeap.swap(arr, 0, i);
			maxHeap.heapSize--;
			((MaxHeap) maxHeap).maxHeapify(arr, 0);

		}
		
		elapsedTime = System.nanoTime() - elapsedTime; // get elapsed time
		
		print(); // print sorted array
		printElapsedTime(); // print elapsed time
		
		
	}

}
