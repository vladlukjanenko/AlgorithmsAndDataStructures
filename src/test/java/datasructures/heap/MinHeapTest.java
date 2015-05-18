package datasructures.heap;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import datastructures.heap.Heap;
import datastructures.heap.Heap.HeapType;

/*
 * Test Heap data structure. Must build min Heap.
 * 
 * @author Vlad Lukjanenko
 * */
public class MinHeapTest {

	private Heap<Integer> minHeap = null;
	
	@Before
	public void init() {
		minHeap = new Heap<Integer>(new Integer[] {6,10,2,4,5,1}, HeapType.MIN_HEAP);
	}
	
	@Test
	public void test() {

		boolean isHeap = false;
		
		minHeap.buildMinHeap();
		
		while (!isHeap) {
			
			
			
		}
		
		assertEquals(true, isHeap);
	}

}