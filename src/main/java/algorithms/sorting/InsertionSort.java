package algorithms.sorting;

/**
 * Provides sorting of any array using Insertion Sort algorithm.
 * The complexity of algorithm is O(n^2).
 * 
 * @author Vlad Lukjanenko
 *
 * */
public class InsertionSort<T extends Comparable<T>> extends Sorting<T> {

	/**
	 * Initialize array.
	 * 
	 * @param arr initial array.
	 * */
	public InsertionSort(T[] arr) {
		super(arr);
		
		System.out.println("	Insertion Sort Algorithm");
		print();
		System.out.println("Sorting ...");
		
	}

	/**
	 * Sorts array of elements using Insertion Sort algorithm.
	 * */
	@Override
	public void sort() {
		
		elapsedTime = System.nanoTime(); // get time of start
		
		for (int i = 1; i < length; i++) {

			T key = arr[i]; // get key element
			int j = i - 1;

			/* compare arr[j] > key */
			while (j >= 0 && arr[j].compareTo(key) > 0) {

				arr[j + 1] = arr[j]; // move arr[j] element to the right
				j--;

			}

			arr[j + 1] = key;

		}
		
		elapsedTime = System.nanoTime() - elapsedTime; // get elapsed time
		
		print(); // print sorted array
		printElapsedTime(); // print elapsed time
		
	}

}