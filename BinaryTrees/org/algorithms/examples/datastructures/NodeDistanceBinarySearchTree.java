package org.algorithms.examples.datastructures;

import java.util.ArrayList;

/**
 * This program demonstrates a few routines for processing binary sort trees. It
 * uses a binary sort tree of strings. The user types in strings. The user's
 * string is converted to lower case, and -- if it is not already in the tree --
 * it is inserted into the tree. Then the number of nodes in the tree and a list
 * of items in the tree are output. The program ends when the user enters an
 * empty string.
 */
public class NodeDistanceBinarySearchTree {

	/**
	 * An object of type TreeNode represents one node in a binary tree of
	 * strings.
	 */
	private static class TreeNode {
		int item; // The data in this node.
		TreeNode left; // Pointer to left subtree.
		TreeNode right; // Pointer to right subtree.

		TreeNode(int str) {
			// Constructor. Make a node containing the specified string.
			// Note that left and right pointers are initially null.
			item = str;
		}
	} // end nested class TreeNode

	private static TreeNode root; // Pointer to the root node in a binary tree.
									// This tree is used in this program as a
									// binary sort tree. When the tree is empty,
									// root is null (as it is initially).

	public static void main(String[] args) {
		treeInsert(5);
		treeInsert(6);
		treeInsert(3);
		treeInsert(1);
		treeInsert(2);
		treeInsert(4);
		treeInsert(10);
		treeInsert(7);
		treeInsert(8);
		treeInsert(9);

		System.out.println("distance between nodes is " + findDistance(2, 9));

	}

	private static int findDistance(int i, int j) {

		ArrayList<Integer> nodepathItem1 = getNodepath(root, i);

		ArrayList<Integer> nodepathItem2 = getNodepath(root, j);

		int distanceItem1 = 0;
		if (nodepathItem1 == null) {
			return -1;
		} else {
			distanceItem1 = nodepathItem1.size() - 1;
		}

		int distanceItem2 = 0;
		if (nodepathItem2 == null) {
			return -1;
		} else {
			distanceItem2 = nodepathItem2.size() - 1;
		}

		int k = 0;
		while ((k < nodepathItem1.size() && k < nodepathItem2.size())) {

			if ((nodepathItem1.get(k) != nodepathItem2.get(k))) {
				break;
			}
			k++;
		}
		k--;

		return (distanceItem1 + distanceItem2 - (2 * k));

	}

	/**
	 * Add the item to the binary sort tree to which the global variable "root"
	 * refers. (Note that root can't be passed as a parameter to this routine
	 * because the value of root might change, and a change in the value of a
	 * formal parameter does not change the actual parameter.)
	 */
	private static void treeInsert(int newItem) {
		if (root == null) {
			// The tree is empty. Set root to point to a new node containing
			// the new item. This becomes the only node in the tree.
			root = new TreeNode(newItem);
			return;
		}
		TreeNode runner; // Runs down the tree to find a place for newItem.
		runner = root; // Start at the root.
		while (true) {
			if (newItem - runner.item < 0) {
				if (runner.left == null) {
					runner.left = new TreeNode(newItem);
					return;
				} else
					runner = runner.left;
			} else {

				if (runner.right == null) {
					runner.right = new TreeNode(newItem);
					return;
				} else
					runner = runner.right;
			}
		}
	}

	/**
	 * Return path to the node from root in arraylist. returns -1 if node item
	 * not found in BST.
	 */
	private static ArrayList<Integer> getNodepath(TreeNode root, int item) {
		ArrayList<Integer> nodepath = new ArrayList<Integer>();

		TreeNode runner;
		runner = root;

		if (root == null) {
			return null;
		}

		while (runner != null) {
			if (item == runner.item) {
				nodepath.add(runner.item);
				return nodepath;
			}
			if (item < runner.item) {
				if (runner.left == null) {
					return null;
				} else {
					nodepath.add(runner.item);
					runner = runner.left;
				}
			} else {
				if (runner.right == null) {
					return null;
				} else {
					nodepath.add(runner.item);
					runner = runner.right;

				}
			}
		}
		return null;
	}

}
