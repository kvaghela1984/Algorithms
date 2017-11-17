package org.algorithms.examples.datastructures;


/**
 *  This program demonstrates a few routines for processing binary
 *  sort trees.  It uses a binary sort tree of strings.  The user
 *  types in strings.  The user's string is converted to lower case, and -- 
 *  if it is not already in the tree -- it is inserted into the tree.
 *  Then the number of nodes in the tree and a list of items in the tree
 *  are output.  The program ends when the user enters an empty string.
 */
public class BinarySearchTreeValidator {


   /**
    * An object of type TreeNode represents one node in a binary tree of strings.
    */
   private static class TreeNode {
      int item;      // The data in this node.
      TreeNode left;    // Pointer to left subtree.
      TreeNode right;   // Pointer to right subtree.
      TreeNode(int str) {
             // Constructor.  Make a node containing the specified string.
             // Note that left and right pointers are initially null.
         item = str;
      }
   }  // end nested class TreeNode


   private static TreeNode root;  // Pointer to the root node in a binary tree.
                                  // This tree is used in this program as a 
                                  // binary sort tree.  When the tree is empty, 
                                  // root is null (as it is initially).


   public static void main(String[] args) {
	   treeInsert(10);
	   treeInsert(1);
	   treeInsert(11);
	   treeInsert(2);
	   treeInsert(13);
	   treeInsert(4);
	   treeInsert(15);
	   treeInsert(6);
	   
	   System.out.println(validateTree(root));
	   
      

   }  // end main()


   /**
    * Add the item to the binary sort tree to which the global variable 
    * "root" refers.  (Note that root can't be passed as  a parameter to 
    * this routine because the value of root might change, and a change 
    * in the value of a formal parameter does not change the actual parameter.)
    */
   private static void treeInsert(int newItem) {
      if ( root == null ) {
             // The tree is empty.  Set root to point to a new node containing
             // the new item.  This becomes the only node in the tree.
         root = new TreeNode( newItem );
         return;
      }
      TreeNode runner;  // Runs down the tree to find a place for newItem.
      runner = root;   // Start at the root.
      while (true) {
         if ( newItem - runner.item < 0 ) {
                // Since the new item is less than the item in runner,
                // it belongs in the left subtree of runner.  If there
                // is an open space at runner.left, add a new node there.
                // Otherwise, advance runner down one level to the left.
            if ( runner.left == null ) {
               runner.left = new TreeNode( newItem );
               return;  // New item has been added to the tree.
            }
            else
               runner = runner.left;
         }
         else {
                // Since the new item is greater than or equal to the item in
                // runner it belongs in the right subtree of runner.  If there
                // is an open space at runner.right, add a new node there.
                // Otherwise, advance runner down one level to the right.
            if ( runner.right == null ) {
               runner.right = new TreeNode( newItem );
               return;  // New item has been added to the tree.
            }
            else
               runner = runner.right;
         }
      } // end while
   }  // end treeInsert()


   
   
   
   static boolean validateTree( TreeNode root ) {
	   
	      if ( root == null ) {
	          return true;
	      } 
	      else if((root.left == null && root.right == null)) {
	    	  return true;
	      }else if((root.left == null) && (root.right != null && root.right.item > root.item)){
	    	  return validateTree(root.right);
	      }else if((root.right == null) && (root.left != null && root.left.item < root.item)){
	    	  return validateTree(root.left);
	      }else if((root.right != null) && (root.left != null)){
	    	  return validateTree(root.left) && validateTree(root.left);
	      }else{
	    	  return false;
	      }
	   }  // end treeContains()


} // end class SortTreeDemo
