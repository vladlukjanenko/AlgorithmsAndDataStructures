package algorithms.sorting;

/**
 * Provides running of all algorithms.
 * 
 * @author Vlad Lukjanenko
 *
 * */
public class SortingAlgorithmsDemo {

	/**
	 * Runs any algorithm to test it.
	 * 
	 * @param args command line arguments.
	 * */
	public static void main(String[] args) {
		
		/*Sorting<Integer> insertionSort = new InsertionSort<Integer>(new Integer[] {5,2,4,6,1,3});
		insertionSort.sort();
		
		Sorting<Integer> mergeSort = new MergeSort<Integer>(new Integer[] {5,2,4,6,1,3});
		mergeSort.sort();*/
		
		Sorting<Integer> heapSort = new HeapSort<Integer>(new Integer[] {5,2,4,6,1,3});
		heapSort.sort();
		
	}

}