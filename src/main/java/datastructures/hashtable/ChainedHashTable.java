package datastructures.hashtable;

import java.util.Objects;

/**
 * Provides implementation of hash table using chains to resolve collisions.
 * 
 * @author Vlad Lukjanenko
 * */
public class ChainedHashTable<K extends Comparable<K>,V extends Comparable<V>> implements HashTable<K, V> {

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
			
			return this.value.compareTo(item.value) == 0;
			
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
			
			while (i.next != null) {
				i = i.next;				
			}
			
			i.next = item;
			
		}
		
	}

	/**
	 * Get element by key.
	 * 
	 * @param key	key to find element.
	 * */
	@Override
	public V get(K key) {
		return null;
	}

	/**
	 * Delete element from hash table.
	 * 
	 * @param key 	key of element.
	 * */
	@Override
	public void delete(K key) {

		
		
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
				
				System.out.println(temp.key + " : " + temp.value);
				
				if (temp.next != null) {
					
					temp = temp.next;
					
					while (temp != null) {
						
						System.out.println(temp.key + " : " + temp.value);
						temp = temp.next;
						
					}
					
				}
			
			}
			
		}
		
	}

}