package datastructures.hashtable;

/**
 * Provides implementation of hash table using chains to resolve collisions.
 * 
 * @author Vlad Lukjanenko
 * */
public class ChainedHashTable<K extends Comparable<K>, V> implements HashTable<K, V> {

	/**
	 * Table which contains all values.
	 * */
	private Object[] table;
	
	/**
	 * Max value of hash table.
	 * */
	private final int CAPACITY;
	
	/**
	 * Creates hash table of preset size.
	 * 
	 * @param capacity	initial capacity.
	 * */
	public ChainedHashTable(int capacity) {
		
		CAPACITY = capacity;
		table = new Object[CAPACITY];
		
	}
	
	/**
	 * Provides class which holds inserted value to hash table.
	 * */
	private class Item {
		
		/**
		 * Key to insert new item.
		 * */
		K key;
		
		/**
		 * Value to inserted.
		 * */
		V value;
		
		/**
		 * Next item in list.
		 * */
		Item next;
		
		/**
		 * Create new {@code Item} instance.
		 * 
		 * @param key
		 * @param value
		 * */
		public Item(K key, V value) {
			
			this.key = key;
			this.value = value;
			
		}
		
		@Override
		public boolean equals(Object obj) {
				
			@SuppressWarnings("unchecked")
			Item item = (Item) obj;
			
			return this.key.compareTo(item.key) == 0;
			
		}
		
	}
	
	/**
	 * Add new item in hash table.
	 * 
	 * @param key	key.
	 * @param value	value to be inserted.
	 * */
	@SuppressWarnings("unchecked")
	@Override
	public void put(K key, V value) {
		
		/* Get index of table to insert new value */
		int index = key.hashCode() % CAPACITY;

		if (table[index] == null) {
			table[index] = new Item(key, value);
		} else {
			/* if we have already put value with the same key */
			Item item = new Item(key, value);
			Item i = (Item) table[index];
						
			while (i.next != null && i.key.compareTo(item.key) != 0) {
				i = i.next;
			}
			
			if (i.key.compareTo(item.key) == 0) {
				i.value = item.value; // update value
			} else {
				i.next = item;
			}
			
		}
		
	}

	/**
	 * Get element by key.
	 * 
	 * @param key	key to find element.
	 * */
	@SuppressWarnings("unchecked")
	@Override
	public V get(K key) {
		
		/* Get index of table to insert new value */
		int index = key.hashCode() % CAPACITY;
		Item item = (Item) table[index];
				
		if (item.next == null) {
			return item.value;
		} else {
			
			while (item != null) {
				
				if (item.key.compareTo(key) == 0) {
					return item.value;
				}
				
				item = item.next;
				
			}
			
			return null;
		}
		
	}

	/**
	 * Delete element from hash table.
	 * 
	 * @param key 	key of element.
	 * */
	@SuppressWarnings("unchecked")
	@Override
	public void delete(K key) {

		/* Get index of table to insert new value */
		int index = key.hashCode() % CAPACITY;
		Item item = (Item) table[index];
				
		if (item.next == null) {
			table[index] = null;
		} else {
			
			while (item.next != null && item.key.compareTo(key) == 0) {
				item = item.next;	
			}
			
			item.next = null;
			
		}
		
	}

	/**
	 * Print hash table.
	 * */
	@SuppressWarnings("unchecked")
	@Override
	public void print() {
		
		for (Object i : table) {
			
			if (i != null) {
			
				Item temp = ((Item) i);
				
				System.out.println("> " + temp.key + " : " + temp.value);
				
				if (temp.next != null) {
					
					temp = temp.next;
					
					while (temp != null) {
						
						System.out.println("  => " + temp.key + " : " + temp.value);
						temp = temp.next;
						
					}
					
				}
			
			}
			
		}
		
	}

}