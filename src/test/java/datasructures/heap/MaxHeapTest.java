package datasructures.heap;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import datastructures.heap.Heap;
import datastructures.heap.MaxHeap;

/*
 * Test Heap data structure. Must build max Heap.
 * 
 * @author Vlad Lukjanenko
 * */
public class MaxHeapTest {

	private Heap<Integer> maxHeap = null;

	@Before
	public void init() {

		maxHeap = new MaxHeap<Integer>(new Integer[] { 6, 10, 2, 4, 5, 1 });

	}

	@Test
	public void test() {

		boolean isHeap = true;

		/*
		 * If we have correct max heap, each parent element must be greater or
		 * equals than any of its' children.
		 */
		for (int i = 1; i < maxHeap.heapSize && isHeap == true; i++) {

			if (maxHeap.left(i) < maxHeap.heapSize
					&& maxHeap.parent(i) >= maxHeap.left(i)) {

				isHeap = false;
			}

			if (maxHeap.right(i) < maxHeap.heapSize
					&& maxHeap.parent(i) >= maxHeap.right(i)) {
				isHeap = false;
			}

		}
		
		assertEquals(true, isHeap);
		
	}

}