package linkedList.singlyLinkedList;

import linkedList.singlyLinkedList.Employee;

public class SinglyLinkedList {
	
	private EmployeeNode head;
	private int size;

	public void addNodeAtFront(Employee e1) {
		EmployeeNode node = new EmployeeNode(e1);
		node.setNext(head);
		head = node;
		size ++;
	}
	
	public int getListSize() {
		return size;
	}
	
	public boolean isListEmpty() {
		return head == null ? true : false;
	}
	
	public EmployeeNode removeNodeAtFront() {
		
		if (isListEmpty()) 
			return null;
		
		EmployeeNode e = head;
		head = e.getNext();
		size--;
		e.setNext(null);
		return e ;
	}
	
	public void printList() {
		EmployeeNode current = head;
		System.out.println("Head =>");
		while (current != null) {
			System.out.println(current);
			current = current.getNext();
		}
	}
}
