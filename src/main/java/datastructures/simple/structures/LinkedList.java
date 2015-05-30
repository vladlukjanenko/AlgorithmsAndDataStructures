package datastructures.simple.structures;

/**
 * Represents linked list (or doubly linked list) data structure.
 * 
 * @author Vlad Lukjanenko
 * */
public class LinkedList<E> implements List<E> {

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
		
		/**
		 * Set value of item.
		 * 
		 * @param value	new item value.
		 * */
		public void setValue(E value) {
			this.value = value;
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
	 * Print list.
	 * */
	public void print() {

		Item print = head;

		while (print != null) {

			System.out.print(print.value + " ");

			print = print.next;

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

	@Override
	public E search() {
		return null;
	}

	@Override
	public void delete(E element) {
		
		
		
	}

}