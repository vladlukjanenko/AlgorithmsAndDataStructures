package datastructures.tree;

public class TreeDemo {
	
	public static void main(String[] args) {
		
		Tree<Integer> binaryTree = new BinaryTree<Integer>();
		
		binaryTree.insert(7);
		
		binaryTree.insert(3);
		binaryTree.insert(9);
		binaryTree.insert(1);
		binaryTree.insert(4);
		binaryTree.insert(5);
		binaryTree.insert(8);
		
		
		((BinaryTree) binaryTree).inorderTreeWalk(((BinaryTree) binaryTree).root);System.out.println();
		binaryTree.delete(3);
		((BinaryTree) binaryTree).inorderTreeWalk(((BinaryTree) binaryTree).root);
		
	}
	
}
