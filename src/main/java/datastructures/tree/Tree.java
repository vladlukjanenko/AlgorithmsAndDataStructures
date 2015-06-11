package datastructures.tree;

/**
 * Provides general operations for trees.
 * 
 * @author Vlad Lukjanenko
 * */
public interface Tree<V extends Comparable<V>> {
	
	void insert(V value);
	void search(V value);
	void delete(V value);
	
}