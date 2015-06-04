package datastructures.hashtable;

/**
 * Provides general operations for hash tables.
 * 
 * @author Vlad Lukjanenko
 * */
public interface HashTable<K, V> {

	void put(K key, V value);
	V get(K key);
	void delete(K key);
	void print();
	
}