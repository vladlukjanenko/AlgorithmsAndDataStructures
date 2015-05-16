package algorithms.sorting;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/*
 * Test Merge Sort algorithm. Must sort input array ascending order. 
 * */
public class MergeSortTest {

	MergeSort<Integer> mergeSort = null;
	
	@Before
	public void init() {
		mergeSort = new MergeSort<Integer>(new Integer[] {5,3,4,7,8,1,2,6,9});
	}
	
	
	@Test
	public void test() {
		
		mergeSort.sort();
		assertArrayEquals(new Integer[] {1,2,3,4,5,6,7,8,9}, mergeSort.arr);
		
	}

}