package linkedList.singlyLinkedList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee("Ravi", 123L);
		Employee e2 = new Employee("Raj", 124L);
		Employee e3 = new Employee("Ram", 125L);

		SinglyLinkedList list = new SinglyLinkedList();
		
		list.addNodeAtFront(e1);
		list.addNodeAtFront(e2);
		
		list.printList();
		
		list.addNodeAtFront(e3);

		list.printList();
		
//		list.addNodeAtTail(e3);

		list.printList();
		
		list.removeNodeAtFront();

		list.printList();
		
//		list.removeNodefromTail();

		list.printList();
		
	}

}
