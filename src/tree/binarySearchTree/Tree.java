package tree.binarySearchTree;

public class Tree {

	private TreeNode root;

	public void insert(int value) {
		if (root == null) {
			root = new TreeNode(value);
		} else
			root.insert(value);
	}

	public void traverseInOrder() {
		root.traverseTreeInOrder();
	}
	
	public void traversePreOrder() {
		root.traverseTreePreOrder();
	}

	public TreeNode getValue(int value) {
		return root.getNode(value);
	}

	public void delete(int value) {
		root = delete(root, value);
	}

	private TreeNode delete(TreeNode subTree, int value) {

		/*
		 * case 1: Node is a leaf case 2: Node has one child case 3: Node has two child
		 */

		if (subTree == null)
			return subTree;

		if (value > subTree.getData()) {
			subTree.setrightChild(delete(subTree.getrightChild(), value));
		} else if (value < subTree.getData()) {
			subTree.setleftChild(delete(subTree.getleftChild(), value));
		} else {
			if (subTree.getleftChild() == null) {
				return subTree.getrightChild();
			} else if (subTree.getrightChild() == null) {
				return subTree.getleftChild();
			}
			// case3: node has 2 child, we will replace the min value from right subtree

			/**
			 * replace the value in the subtree root node with smallest value from the right
			 * subTree
			 */
			subTree.setData(subTree.getrightChild().min());

			// delete the node that has smallest value in the right subtree
			subTree.setrightChild(delete(subTree.getrightChild(), subTree.getData()));

		}

		return subTree;
	}
}
