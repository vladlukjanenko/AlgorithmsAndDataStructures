package algorithms.sorting;

import java.util.Random;

/**
 * Provides sorting of any array using Quick Sort algorithm. The complexity of
 * algorithm in worst case is O(n^2). Average is O(n*logn).
 * 
 * @author Vlad Lukjanenko
 *
 * */
public class QuickSort<E extends Comparable<E>> extends Sorting<E> {

	/**
	 * Initialize array.
	 * 
	 * @param arr initial array.
	 * */
	public QuickSort(E[] arr) {
		
		super(arr);
		
		System.out.println("	Quick Sort Algorithm");
		print();
		System.out.println("Sorting ...");
		
	}

	/**
	 * Sorts array of elements using Quick Sort algorithm.
	 * */
	@Override
	public void sort() {
		
		elapsedTime = System.nanoTime(); // get time of start
		
		quickSort(arr, 0, length - 1);
		
		elapsedTime = System.nanoTime() - elapsedTime; // get elapsed time
		
		print(); // print sorted array
		printElapsedTime(); // print elapsed time
		
	}

	/**
	 * Quick Sort method.
	 * 
	 * @param arr array for sorting.
	 * @param p start index.
	 * @param r end index.
	 * */
	private void quickSort(E[] arr, int p, int r) {
		
		if (p < r) {
			
			int q = partition(arr, p, r);
			//int q = randomizedPartition(arr, p, r);
			
			quickSort(arr, p, q - 1);
			quickSort(arr, q + 1, r);
			
		}
		
	}
	
	/**
	 * Get pivot element of the array.
	 * 
	 * @param arr array for sorting.
	 * @param p start index.
	 * @param r end index.
	 * */
	private int partition(E[] arr, int p, int r) {
		
		E x = arr[r];
		int i = p - 1;

		for (int j = p; j < r; j++) {

			if (arr[j].compareTo(x) <= 0) {

				i++;
				swap(arr, i, j);

			}

		}

		swap(arr, i + 1, r);

		return i + 1;
		
	}
	
	/**
	 * Get pivot element of the array.
	 * 
	 * @param arr array for sorting.
	 * @param p start index.
	 * @param r end index.
	 * */
	private int randomizedPartition(E[] arr, int p, int r) {
		
		int i = (new Random()).nextInt(r - p) + p;
		
		System.out.println(i);
		
		swap(arr, r, i);
		
		return partition(arr, p, r);
		
	}
	
}