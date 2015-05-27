package order.statictics;

import java.util.Random;

/**
 * Describes class for working with order statistics.
 * 
 * @author Vlad Lukjanenko
 * */
public class OrderStatistics {
	
	/*
	 * Order statistic.
	 * */
	private int[] arr = null;
	
	/**
	 * Initialize array.
	 * 
	 * @param arr initial array.
	 * */
	public OrderStatistics(int[] arr) {
		
		this.arr = arr;
		
		/* Create order statistic by sorting initial array */
		/*Sorting<Integer> insertionSort = new InsertionSort<Integer>(arr);
		insertionSort.sort();*/
		
		print();
		
	}
	
	/**
	 * Get maximum element. This method is correct only if we have sorted array.
	 * 
	 * @return maximum element.
	 * */
	public int getMaximum() {
		return arr[arr.length-1];
	}
	
	/**
	 * Get minimum element. This method is correct only if we have sorted array.
	 * 
	 * @return minimum element.
	 * */
	public int getMimimum() {
		return arr[0];
	}
	
	/**
	 * Find maximum element.
	 * 
	 * @return maximum element.
	 * */
	public int maximum() {
		
		Integer max = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			
			if (max < arr[i]) {
				max = arr[i];
			}
			
		}
		
		return max;
		
	}
	
	/**
	 * Find minimum element.
	 * 
	 * @return minimum element.
	 * */
	public int minimum() {
		
		Integer min = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			
			if (min > arr[i]) {
				min = arr[i];
			}
			
		}
		
		return min;
		
	}
	
	/**
	 * Find element which is i-th growth in unsorted array. Complexity of the
	 * algorithm is O(n) (average).
	 * 
	 * @param p start index.
	 * @param r end index.
	 * @param i index.
	 * */
	public int randomizedSelect(int p, int r, int i) {
		
		if (p == r) {
			return arr[p];
		}
		
		int q = randomizedPartition(arr, p, r);		
		int k = q - p + 1;
		
		if (i == k) {
			return arr[q];
		} else if (i < k) {
			return randomizedSelect(p, q - 1, i);
		} else {
			return randomizedSelect(q + 1, r, i - k);
		}
		
	}

	/**
	 * Get pivot element of the array.
	 * 
	 * @param arr array for searching.
	 * @param p start index.
	 * @param r end index.
	 * */
	private int partition(int[] arr, int p, int r) {
		
		int x = arr[r];
		int i = p - 1;

		for (int j = p; j < r; j++) {

			if (arr[j] <= x) {

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
	 * @param arr array for searching.
	 * @param p start index.
	 * @param r end index.
	 * */
	private int randomizedPartition(int[] arr, int p, int r) {
		
		int i = (new Random()).nextInt(r - p) + p;
		
		System.out.println(i);
		
		swap(arr, r, i);
		
		return partition(arr, p, r);
		
	}
	
	/**
	 * Swaps array elements that have indexes i and j.
	 * 
	 * @param arr an array of elements to be sorted
	 * @param i index of element of the array to be swapped
	 * @param j index of element of the array to be swapped
	 * @throws NullPointerException if array is null
	 * */
	private void swap(int[] arr, int i, int j) {
		
		if (arr == null) {
			throw new NullPointerException();
		} else {
			
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp; 
		
		}
	}
	
	/**
	 * Print order statistic.
	 * */
	public void print() {
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	
}
