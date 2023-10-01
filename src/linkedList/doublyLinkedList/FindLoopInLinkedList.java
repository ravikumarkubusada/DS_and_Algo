package linkedList.doublyLinkedList;

import java.util.HashSet;

public class FindLoopInLinkedList {

	static Node head;

	static class Node {
		int data;
		Node next;

		Node(int data1) {
			data = data1;
			next = null;
		}
	}

	static public void push(int newData) {

		Node newNode = new Node(newData);
		newNode.next = head;
		head = newNode;
	}

	static public boolean detectLoop(Node h) {
		HashSet<Node> hs = new HashSet<FindLoopInLinkedList.Node>();

		while (h != null) {
			if (hs.contains(h))
				return true;

			hs.add(h);

			h = h.next;
		}

		return false;
	}

	public static void printList(FindLoopInLinkedList list) {
		Node currNode = list.head;

		System.out.print("LinkedList: ");

		// Traverse through the LinkedList
		while (currNode != null) {
			// Print the data at current node
			System.out.print(currNode.data + " ");

			// Go to next node
			currNode = currNode.next;
		}
	}

	public static void main(String[] args) {
		FindLoopInLinkedList llist = new FindLoopInLinkedList();

		llist.push(20);
		llist.push(4);
		llist.push(15);
		llist.push(10);

		printList(llist);
		
		System.out.println("HEAD: " + llist.head.data);
		
		System.out.println();
		/* Create loop for testing */
		llist.head.next.next.next.next = llist.head;

		if (detectLoop(head))
			System.out.println("Loop found");
		else
			System.out.println("No Loop");

	}

}
