package datastructures.hashtable;

public class HashTableDemo {

	public static void main(String[] args) {
		
		HashTable<Integer, Integer> hashMap = new ChainedHashTable<Integer, Integer>(5);
		hashMap.put(3, 5);
		hashMap.put(4, 2);
		hashMap.put(3, 1);
		hashMap.put(1, 3);
		
		hashMap.print();
		
	}
	
}