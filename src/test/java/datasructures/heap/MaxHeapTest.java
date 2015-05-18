package datasructures.heap;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import datastructures.heap.Heap;
import datastructures.heap.Heap.HeapType;

/*
 * Test Heap data structure. Must build max Heap.
 * 
 * @author Vlad Lukjanenko
 * */
public class MaxHeapTest {
	
	private Heap<Integer> maxHeap = null;
	
	@Before
	public void init() {
		
		maxHeap = new Heap<Integer>(new Integer[] {6,10,2,4,5,1}, HeapType.MAX_HEAP);
		
	}
	
	@Test
	public void test() {
		
		boolean isHeap = false;
		
		
		assertEquals(true, isHeap);
	}

}
