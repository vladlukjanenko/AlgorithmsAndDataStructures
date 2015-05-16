package algorithms.sorting;

/**
 * Performs main operations that sorting algorithms must have and define sorting
 * method for all algorithms to implement. It is able to sort group of elements
 * that implement {@code Comparable} interface. 
 * 
 * @author Vlad Lukjanenko
 *
 * */
public abstract class Sorting<E extends Comparable<E>>{
	
	/**
	 * The length of the array to be sorted. 
	 * */
	public final int length;
	
	/**
	 * The array of elements to be sorted.
	 * */
	public E[] arr;
	
	/**
	 * Time elapsed to sort elements. By default it is the minimum value of long
	 * type. 
	 * */
	protected long elapsedTime = Long.MIN_VALUE;
	
	/**
	 * Constructor to initialize fields.
	 * 
	 * @param arr initial array.
	 * */
	public Sorting(E[] arr) {

		this.arr = arr;
		this.length = this.arr.length;
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
	 * Used to get time spent on sorting of the array.
	 * 
	 * @return elapsedTime time elapsed to sort elements.
	 * */
	public void printElapsedTime() {
		System.out.println("Elapsed time: " + elapsedTime + " nanoseconds.");
	}
	
	/**
	 * Prints array of elements. Works only for wrapper classes and class {@code String}.
	 * It is used for simplicity to test algorithm work.
	 * */
	public void print() {
		
		for (int i = 0; i < length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();

	}
		
	/**
	 * Each class that extends {@code Sorting<T>} must implement this method.
	 * */
	public abstract void sort();
	
}