package algorithms.sorting;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/*
 * Test Quick Sort algorithm. Must sort input array ascending order.
 * 
 * @author Vlad Lukjanenko
 * */
public class QuickSortTest {

	private Sorting<Integer> quickSort = null;
	
	@Before
	public void init() {
		quickSort = new QuickSort<Integer>(new Integer[] {6,8,1,5,3,2,9,4,7});
	}
	
	@Test
	public void test() {

		quickSort.sort();
		assertArrayEquals(new Integer[] {1,2,3,4,5,6,7,8,9}, quickSort.arr);
		
	}

}
