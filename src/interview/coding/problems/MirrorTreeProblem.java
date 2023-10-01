/*
package interview.coding.problems;


import org.w3c.dom.Node;

public class MirrorTreeProblem {

//	https://practice.geeksforgeeks.org/problems/mirror-tree/1/?company[]=Walmart&page=1&query=company[]Walmartpage1
	public static void main(String[] args) {

	}

	void mirrorTree(Node node) {

		if (node == null)
			return;

		mirrorTree(node.left);
		mirrorTree(node.right);

//		now swap
		Node n = node.right;
		node.right = node.left;
		node.left = n;

	}
}
*/
