package algorithms.sorting;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/*
 * Test Heap Sort algorithm. Must sort input array ascending order.
 * 
 * @author Vlad Lukjanenko
 * */
public class HeapSortTest {

	private Sorting<Integer> heapSort = null;
	
	@Before
	public void init() {
		heapSort = new HeapSort<Integer>(new Integer[] {6,8,1,5,3,2,9,4,7});
	}
	
	@Test
	public void test() {
		
		heapSort.sort();
		assertArrayEquals(new Integer[] {1,2,3,4,5,6,7,8,9}, heapSort.arr);
		
	}

}
