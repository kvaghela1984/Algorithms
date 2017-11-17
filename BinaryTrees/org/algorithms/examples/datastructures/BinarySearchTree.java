package org.algorithms.examples.datastructures;

public class BinarySearchTree {
	private TreeNode root;

	private class TreeNode {
		int item; // The data in this node.
		TreeNode left; // Pointer to left subtree.
		TreeNode right; // Pointer to right subtree.

		TreeNode(int i) {
			item = i;
		}
	}

	public void treeInsert(int newItem) {
		if (root == null) {
			// The tree is empty. Set root to point to a new node containing
			// the new item. This becomes the only node in the tree.
			root = new TreeNode(newItem);
			return;
		}
		TreeNode runner; // Runs down the tree to find a place for newItem.
		runner = root; // Start at the root.
		while (true) {
			if (newItem < runner.item) {
				// Since the new item is less than the item in runner,
				// it belongs in the left subtree of runner. If there
				// is an open space at runner.left, add a new node there.
				// Otherwise, advance runner down one level to the left.
				if (runner.left == null) {
					runner.left = new TreeNode(newItem);
					return; // New item has been added to the tree.
				} else
					runner = runner.left;
			} else {
				// Since the new item is greater than or equal to the item in
				// runner it belongs in the right subtree of runner. If there
				// is an open space at runner.right, add a new node there.
				// Otherwise, advance runner down one level to the right.
				if (runner.right == null) {
					runner.right = new TreeNode(newItem);
					return; // New item has been added to the tree.
				} else
					runner = runner.right;
			}
		} // end while
	} // end treeInsert()

	public boolean search(int i) {
		return treeContains(root, i);
	}

	private boolean treeContains(TreeNode root, int i) {
		if (root == null) {
			return false;
		} else {
			if (root.item > i) {
				return treeContains(root.left, i);
			} else if (root.item < i) {
				return treeContains(root.right, i);
			} else {
				return true;
			}
		}

	}

	public void printPreOrder() {
		preOrder(root);
	}

	private void preOrder(TreeNode node) {
		if (node == null) {
			return;
		} else {
			preOrder(node.left);
			System.out.println(node.item);
			preOrder(node.right);
		}
	}

	public int findShortestDistance(int i, int j) {
		int distance = 0;
		TreeNode node = root;
		if (root == null) {
			return -1;
		}
		while ((i < node.item && j < node.item) | (i > node.item && j > node.item)) {
			if (i < node.item && j < node.item) {
				node = node.left;
			} else {
				node = node.right;
			}

			// if(node == null){
			// return -1;
			// }
		}
		TreeNode temp = node;
		while (temp != null && temp.item != i) {
			if (i < temp.item) {
				temp = temp.left;
			} else {
				temp = temp.right;
			}
			distance++;
		}

		if (temp == null) {
			return -1;
		}
		temp = node;
		while (temp != null && temp.item != j) {
			if (j < temp.item) {
				temp = temp.left;
			} else {
				temp = temp.right;
			}
			distance++;
		}
		if (temp == null) {
			return -1;
		}
		return distance;

	}
}
