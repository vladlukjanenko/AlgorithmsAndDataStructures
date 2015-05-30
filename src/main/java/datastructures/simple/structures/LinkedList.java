package datastructures.simple.structures;

/**
 * Represents linked list (or doubly linked list) data structure.
 * 
 * @author Vlad Lukjanenko
 * */
public class LinkedList<E extends Comparable<E>> implements List<E> {

	/**
	 * Points to the start of list.
	 * */
	private Item head = null;
		
	/**
	 * Describes item in list.
	 * */
	private class Item {
		
		/**
		 * Points to the next element in list.
		 * */
		public Item next = null;
		
		/**
		 * Points to the previous element in list.
		 * */
		public Item prev = null;
		
		/**
		 * Value of list element.
		 * */
		private E value = null;
		
		/**
		 * Create new item.
		 * 
		 * @param item	list item.
		 * */
		public Item(E item) {
			value = item;		
		}
		
		@Override
		public boolean equals(Object obj) {
			
			@SuppressWarnings("unchecked")
			Item i = (Item) obj;
			
			return i.value.compareTo(this.value) == 0 ? true : false;
		}
	}
	
	/**
	 * Create empty linked list.
	 * */
	public LinkedList() {
		
	}
	
	/**
	 * Create linked list with initial item.
	 * 
	 * @param item	initial item.
	 * */
	public LinkedList(E item) {
		head = new Item(item);		
	}
	
	/**
	 * Get last item of list.
	 * 
	 * @return last list item.
	 * */
	private Item getLastItem() {
		
		if (head == null) {
			return null;
		} else {
			
			Item lastItem = head;
			
			while (lastItem.next != null) {
				
				lastItem = lastItem.next;
				
			}
			
			return lastItem;
		}
		
	}

	/**
	 * Print list starting from head.
	 * */
	public void printFromHead() {

		Item print = head;

		while (print != null) {

			System.out.print(print.value + " ");

			print = print.next;

		}

		System.out.println();

	}
	
	/**
	 * Print list starting from tail.
	 * */
	public void printFromTail() {

		Item print = getLastItem();

		while (print != null) {

			System.out.print(print.value + " ");

			print = print.prev;

		}

		System.out.println();

	}
	
	/**
	 * Insert new element in head of list.
	 * 
	 * @param element new element.
	 * */
	@Override
	public void insertHead(E element) {
	
		if (head == null) {
			head = new Item(element);
		} else {
			
			Item item = new Item(element);
			item.next = head;
			head.prev = item;
			head = item;
			
		}
		
	}
	
	/**
	 * Insert new element in tail of list.
	 * 
	 * @param element new element.
	 * */
	@Override
	public void insertTail(E element) {
	
		if (head == null) {
			head = new Item(element);
		} else {
			
			Item lastItem = getLastItem();
			Item item = new Item(element);
			
			item.prev = lastItem;
			lastItem.next = item;
			lastItem = item;
			
		}
		
	}

	/**
	 * Search if input value contains in the list. If value found - return index
	 * where it is in the list.
	 * 
	 * @param value	value to search.
	 * @return index in the list.
	 * */
	@Override
	public int search(E value) {
		
		Item searchItem = new Item(value);
		Item x = head;
		int position = 0;
		
		while (x != null && searchItem.value != x.value) {
			x = x.next;
			position++;
		}
		
		if (x == null) {
			position = -1;
		}
		
		return position;
	}

	@Override
	public void delete(E element) {
		
		
		
	}

}