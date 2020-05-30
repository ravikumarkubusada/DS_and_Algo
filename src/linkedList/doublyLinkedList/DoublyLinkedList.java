package linkedList.doublyLinkedList;

public class DoublyLinkedList {

	private EmployeeNode head;
	private EmployeeNode tail;
	private int size;

	public void addNodeAtFront(Employee e) {
		EmployeeNode node = new EmployeeNode(e);
		node.setNext(head);

		if (head == null) {
//			if we are adding the node to empty list we need to set the tail
			tail = node;
		} else {
			head.setPrevious(node);
		}

		head = node;
		size++;
	}

	public void addNodeAtTail(Employee e) {
		EmployeeNode node = new EmployeeNode(e);
		if (tail == null) {
			head = node;
		} else {
			tail.setNext(node);
			node.setPrevious(tail);
		}
		tail = node;
		size++;
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

		if (head.getNext() == null) {
//			one node in the list, in this case we need to worry about setting the tail to null
			tail = null;
		} else {
			head.getNext().setPrevious(null);
		}

		head = e.getNext();
		size--;
		e.setNext(null); // cleaning up the reference
		return e;
	}

	public EmployeeNode removeNodefromTail() {
		if (isListEmpty())
			return null;

		EmployeeNode e = tail;

		if (tail.getPrevious() == null) {
			head = null;
		} else {
			tail.getPrevious().setNext(null);
		}

		tail = tail.getPrevious();
		size--;
		e.setPrevious(null); // cleaning up the reference
		return e;
	}

	public boolean addBefore(Employee newEmp, Employee existingEmp) {

		if (existingEmp == null && head == null)
			return false;

		EmployeeNode current = head;
		while (current != null && !current.getEmployee().equals(existingEmp)) {
			current = current.getNext();
		}

		if (current == null) { // return if existingEmp not found
			return false;
		}
		
		EmployeeNode newNode = new EmployeeNode(newEmp);
		
		newNode.setPrevious(current.getPrevious());
		newNode.setNext(current);
		
		current.setPrevious(newNode);
		
		if (head == current) {
			head = newNode;
		} else {
			newNode.getPrevious().setNext(newNode);
		}
		
		size++;
		return true;
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
