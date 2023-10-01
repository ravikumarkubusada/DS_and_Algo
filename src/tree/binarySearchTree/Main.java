/**
 * 
 */
package tree.binarySearchTree;

/**
 * @author Ravikumar Kubusada
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Tree tree = new Tree();
		tree.insert(1);
		tree.insert(2);
		tree.insert(10);
		tree.insert(0);
		tree.insert(100);

		tree.traverseInOrder();
		System.out.println();
		
		tree.traversePreOrder();
		
//		System.out.println(tree.getValue(10));
		
//		tree.delete(1);
//		tree.traverseInOrder();
//		System.out.println();
//		
//		System.out.println();
	}

}
