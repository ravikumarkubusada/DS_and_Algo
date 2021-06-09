/**
 * 
 */
package tree.binarySearchTree;

/**
 * @author Ravikumar Kubusada
 *
 */
public class TreeNode {

	private int data;
	private TreeNode leftChild;
	private TreeNode rightChild;

	public TreeNode(int value) {
		this.data = value;
	}

	public void insert(int value) {
		if (value == data)
			return;
		if (value < data) {
			if (leftChild == null)
				leftChild = new TreeNode(value);
			else
				leftChild.insert(value);
		} else {
			if (rightChild == null)
				rightChild = new TreeNode(value);
			else
				rightChild.insert(value);
		}

	}

	public void traverseTreeInOrder() {
//		left-> root ->right

		if (leftChild != null) {
			leftChild.traverseTreeInOrder();
		}
		System.out.print(data + "=> ");

		if (rightChild != null) {
			rightChild.traverseTreeInOrder();
		}
	}

	public void traverseTreePreOrder() {
//	 root->left->right
		
		System.out.print(data + "=> ");
		
		if (leftChild != null) {
			leftChild.traverseTreePreOrder();
		}

		if (rightChild != null) {
			rightChild.traverseTreePreOrder();
		}
		
	}

	public TreeNode getNode(int value) {
		if (value == data)
			return this;
		else {
			if (value < data) {
				if (leftChild != null)
					return leftChild.getNode(value);

			} else {
				if (rightChild != null)
					return rightChild.getNode(value);
			}
		}
		return null;
	}

	public int min() {
		if (leftChild == null)
			return data;
		else {
			return leftChild.min();
		}
	}

	public int max() {
		if (rightChild == null)
			return data;
		else {
			return rightChild.max();
		}
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public TreeNode getleftChild() {
		return leftChild;
	}

	public void setleftChild(TreeNode leftChild) {
		this.leftChild = leftChild;
	}

	public TreeNode getrightChild() {
		return rightChild;
	}

	public void setrightChild(TreeNode rightChild) {
		this.rightChild = rightChild;
	}

	@Override
	public String toString() {
		return "TreeNode [data=" + data + "]";
	}

}
