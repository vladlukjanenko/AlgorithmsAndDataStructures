package algorithms.sorting;

/**
 * Provides sorting of any array using Merge Sort algorithm.
 * The complexity of algorithm is O(n*logn).
 * 
 * @author Vlad Lukjanenko
 *
 * */
public class MergeSort<E extends Comparable<E>> extends Sorting<E> {

	/**
	 * Initialize array.
	 * 
	 * @param arr initial array.
	 * */
	public MergeSort(E[] arr) {
		super(arr);
		
		System.out.println("	Merge Sort Algorithm");
		print();
		System.out.println("Sorting ...");
	}

	/**
	 * Sorts array of elements using Merge Sort algorithm.
	 * */
	@Override
	public void sort() {
		
		elapsedTime = System.nanoTime(); // get time of start
		
		mergeSort(arr, 0, length-1);
		
		elapsedTime = System.nanoTime() - elapsedTime; // get elapsed time
		
		print(); // print sorted array
		printElapsedTime(); // print elapsed time
		
	}
	
	/**
	 * Divide and Conquer. Merge Sort algorithm.
	 * 
	 * @param A array for sorting.
	 * @param p start index of the array.
	 * @param r end index of the array.
	 * */
	private void mergeSort(E[] A, int p, int r) {
		
		if (p < r) {
			
			/* (p + r)/2 */
			int q = (p + r) / 2;
			
			mergeSort(A, p, q);
			mergeSort(A, q + 1, r);
			
			merge(A, p, q, r);
			
		}
		
	}
	
	/**
	 * Merges two sorted arrays.
	 * 
	 * @param A array for sorting.
	 * @param p start index of array.
	 * @param q middle index of array.
	 * @param r end index of array.
	 * */
	@SuppressWarnings("unchecked")
	private void merge(E[] A, int p, int q, int r) {
		
		// temporary array
		Object[] B = new Object[A.length];

		int i = 0;
		int j = 0;

		for (i = 0; i < q + 1; i++) {
			B[i] = A[i]; // copy array elements from 0 to q + 1
		}
		
		/* 
		 * as faster alternative we can use System.arrayCopy
		   System.arraycopy(A, 0, B, 0, q + 1);
		 */

		for (j = q + 1; j <= r; j++) {
			B[j] = A[q + r + 1 - j]; // copy array elements from q + 1 to r
		}
		
		i = p;
		j = r;

		for (int k = p; k <= r; k++) {

			// B[i] <= B[j]
			if (((E) B[i]).compareTo((E) B[j]) <= 0) {
				A[k] = (E) B[i++];
			} else {
				A[k] = (E) B[j--];
			}

		}

	}

}



















