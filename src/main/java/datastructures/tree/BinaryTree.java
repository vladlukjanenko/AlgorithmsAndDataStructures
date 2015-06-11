package datastructures.tree;

/**
 * Provides implementation of binary tree.
 * 
 * @author Vlad Lukjanenko
 * */
public class BinaryTree<V extends Comparable<V>> implements Tree<V> {

	/**
	 * Rood node.
	 * */
	public Node root = null;
	
	/**
	 * Inner class represents node of binary tree.
	 * */
	private class Node {
		
		Node parent = null;
		Node left = null;
		Node right = null;
		V value;
		
		public Node(V value) {
			this.value = value;
		}
		
		@Override
		public int hashCode() {
			return value.hashCode();
		}
		
		@SuppressWarnings("unchecked")
		@Override
		public boolean equals(Object obj) {
			
			if (obj instanceof BinaryTree.Node) {
				
				Node n = (Node) obj;
				
				return this.value.compareTo(n.value) == 0;
				
			} else {
				return false;
			}
			
		}
		
		@Override
		public String toString() {
			return "Value: " + (value == null ? "null" : value) + "; Left: " + (left == null ? "null" : left.value) + "; Right: " +(right == null ? "null" : right.value);
		}
		
	}
	
	/**
	 * Insert new item in binary tree.
	 * 
	 * @param value	new item.
	 * */
	@Override
	public void insert(V value) {
		
		if (root == null) {
			root = new Node(value);
		} else {
		
			Node x = root;
			
			while (x != null) {
				
				if (value.compareTo(x.value) < 0) {
					
					if (x.left == null) {
						x.left = new Node(value);
						x.left.parent = x;
						break;
					} else {
						x = x.left;
					}
					
				} else {
					
					if (x.right == null) {
						x.right = new Node(value);
						x.right.parent = x;
						break;
					} else {
						x = x.right;
					}
					
				}
				
			}
			
		}
		
	}

	/**
	 * Search item in binary tree.
	 * 
	 * @param value	search value.
	 * */
	@Override
	public void search(V value) {
		
		/*
		--Iterative
		Node x = root;
		
		while (x != null && value.equals(x.value)) {
			
			if (value.compareTo(x.value) < 0) {
				x = x.left;
			} else {
				x = x.right;
			}
			
		}*/
		
		Node x = searchBinaryTree(root, value);
		
		System.out.println(x.toString());
		
	}
	
	private Node searchBinaryTree(Node x, V value) {
		
		if (x == null || value.equals(x.value)) {
			return x;
		} else if (value.compareTo(x.value) < 0) {
			return searchBinaryTree(x.left, value);
		} else {
			return searchBinaryTree(x.right, value);
		}
		
	}

	/**
	 * Delete item from binary tree.
	 * 
	 * @param value	delete value.
	 * */
	@Override
	public void delete(V value) {
		
		Node deleteNode = searchBinaryTree(root, value);

		System.out.println(deleteNode);
		
		if (deleteNode == null) {
			System.out.println("Binary tree does not contain such value");
		} else {

			Node y = null;
			Node x = null;
			
			if (deleteNode.left == null || deleteNode.right == null) {
				y = deleteNode;
			} else {
				y = treeSuccessor(value);
			}
			
			if (y.left != null) {
				x = y.left;
			} else {
				x = y.right;
			}
			
			if ( x != null) {
				x.parent = y.parent;
			}
			
			if (y.parent == null) {
				root = x;
			} else {
				if (y == y.parent.left) {
					y.parent.left = x;
				} else {
					y.parent.right = x;
				}
			} 
			
			if (y != deleteNode) {
				deleteNode.value = y.value;
			}
			
		}

	}
	
	/**
	 * Returns max number of levels in tree.
	 * 
	 * @return	tree height.
	 * */
	public int height() {
		return getTreeHeight(root);
	}
	
	
	private int getTreeHeight(Node n) {
		
		if (n == null) {
			return 0;
		} else {
			return 1 + Math.max(getTreeHeight(n.left), getTreeHeight(n.right));			
		}
		
	}
	
	/**
	 * Get min node.
	 * 
	 * @param	x	tree node.
	 * @return min value.
	 * */
	public Node treeMinimum(Node x) {
		
		while (x.left != null) {
			x = x.left;
		}
		
		return x;
		
	}	
	
	/**
	 * Get max node.
	 * 
	 * @param	x	tree node.
	 * @return max value.
	 * */
	public Node treeMaximum(Node x) {
		
		while (x.right != null) {
			x = x.right;
		}
		
		return x;
		
	}
	
	/**
	 * Get successor from node.
	 * 
	 * @param value	value of node.
	 * @return	successor.
	 * */
	public Node treeSuccessor(V value) {
		
		Node x = searchBinaryTree(root, value);
		
		if (x.right != null) {
			return treeMinimum(x.right);
		}
		
		Node y = x.parent;
		
		while (y != null && x == y.right) {
			x = y;
			y = y.parent;
		}
		
		return y;
		
	}
	
	
	/**
	 * Print binary tree.
	 * 
	 * @param x	root node.
	 * */
	public void inorderTreeWalk(Node x) {
		
		if (x != null) {
			
			System.out.print(x.value + " ");
			inorderTreeWalk(x.left);
			inorderTreeWalk(x.right);
			
		}
		
	}

}
