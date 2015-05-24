package datasructures.heap;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import datastructures.heap.Heap;
import datastructures.heap.MinHeap;

/*
 * Test Heap data structure. Must build min Heap.
 * 
 * @author Vlad Lukjanenko
 * */
public class MinHeapTest {

	private Heap<Integer> minHeap = null;

	@Before
	public void init() {
		minHeap = new MinHeap<Integer>(new Integer[] { 6, 10, 2, 4, 5, 1 });
	}

	@Test
	public void test() {

		boolean isHeap = true;
		
		/*
		 * If we have correct min heap, each parent element must be less or
		 * equals than any of its' children.
		 */
		for (int i = 1; i < minHeap.heapSize && isHeap == true; i++) {

			if (minHeap.left(i) < minHeap.heapSize
					&& minHeap.parent(i) >= minHeap.left(i)) {

				isHeap = false;
			}

			if (minHeap.right(i) < minHeap.heapSize
					&& minHeap.parent(i) >= minHeap.right(i)) {
				isHeap = false;
			}

		}

		assertEquals(true, isHeap);
		
	}

}