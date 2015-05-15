package algorithms.sorting;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/*
 * Test Insertion Sort algorithm. Must sort input array ascending order. 
 * */
public class InsertionSortTest {

	private Sorting<Integer> insertionSort = null;
	
	@Before
	public void init() {
		insertionSort = new InsertionSort<Integer>(new Integer[] {6,8,1,5,3,2,9,4,7});
	}
	
	@Test
	public void testSort() {
		
		insertionSort.sort();
		assertArrayEquals(new Integer[] {1,2,3,4,5,6,7,8,9}, insertionSort.arr);
		
	}

}