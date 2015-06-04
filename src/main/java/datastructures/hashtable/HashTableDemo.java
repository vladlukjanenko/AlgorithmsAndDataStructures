package datastructures.hashtable;

public class HashTableDemo {

	public static void main(String[] args) {
		
		HashTable<Integer, Integer> hashMap = new ChainedHashTable<Integer, Integer>(5);
		
		hashMap.put(3, 5);
		hashMap.put(4, 2);
		hashMap.put(3, 1);
		hashMap.put(1, 3);
		
		hashMap.put(10, 3);
		hashMap.put(7, 3);
		hashMap.put(11, 3);
		hashMap.put(9, 3);
		
		hashMap.print();
		
		System.out.println(hashMap.get(11));
		
		hashMap.delete(10);
		
		hashMap.print();
		
		hashMap.delete(9);
		
		hashMap.print();
		
	}
	
}