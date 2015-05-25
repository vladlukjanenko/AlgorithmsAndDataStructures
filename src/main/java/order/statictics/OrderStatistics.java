package order.statictics;

import algorithms.sorting.InsertionSort;
import algorithms.sorting.Sorting;

/**
 * Describes class for working with order statistics.
 * 
 * @author Vlad Lukjanenko
 * */
public class OrderStatistics {
	
	/*
	 * Order statistic.
	 * */
	private Integer[] arr = null;
	
	/**
	 * Initialize array.
	 * 
	 * @param arr initial array.
	 * */
	public OrderStatistics(Integer[] arr) {
		
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
	public Integer getMaximum() {
		return arr[arr.length-1];
	}
	
	/**
	 * Get minimum element. This method is correct only if we have sorted array.
	 * 
	 * @return minimum element.
	 * */
	public Integer getMimimum() {
		return arr[0];
	}
	
	/**
	 * Find maximum element.
	 * 
	 * @return maximum element.
	 * */
	public Integer maximum() {
		
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
	public Integer minimum() {
		
		Integer min = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			
			if (min > arr[i]) {
				min = arr[i];
			}
			
		}
		
		return min;
		
	}
	
	/**
	 * Find minimum and maximum elements simultaneously.
	 * */
	public int[] findMinMax() {
		
		int min = -1, max = -1;
		
		// if length of order statistic is even
		if (arr.length % 2 == 0) {
			
			// we take first pair of elements
			if (arr[0] <= arr[1]) {
			
				min = arr[0];
				max = arr[1];
			
			} else {
				
				min = arr[1];
				max = arr[0];
				
			}
			
		} else {
			
			// we make first element both maximum and minimum
			min = arr[0];
			max = arr[0];
			
		}
		
		for (int i = 2; i < arr.length; i++) {
			
		}
		
		return new int[] { min, max};
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
