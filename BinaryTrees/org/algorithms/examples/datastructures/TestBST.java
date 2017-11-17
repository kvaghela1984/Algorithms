package org.algorithms.examples.datastructures;

public class TestBST {

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();

		// bst.treeInsert(50);
		// bst.treeInsert(40);
		// bst.treeInsert(15);
		// bst.treeInsert(10);
		// bst.treeInsert(19);
		// bst.treeInsert(7);
		// System.out.println(bst.search(5));
		// System.out.println(bst.search(10));
		// System.out.println(bst.search(15));
		// System.out.println(bst.search(2));
		// System.out.println(bst.search(11));
		// System.out.println(bst.search(7));
		// System.out.println(bst.search(1));
		bst.treeInsert(5);
		bst.treeInsert(6);
		bst.treeInsert(3);
		bst.treeInsert(1);
		bst.treeInsert(2);
		bst.treeInsert(4);
		bst.treeInsert(10);
		bst.treeInsert(7);
		bst.treeInsert(8);
		bst.treeInsert(9);

		// bst.printPreOrder();
		System.out.println(bst.findShortestDistance(2, 4));
	}

}
