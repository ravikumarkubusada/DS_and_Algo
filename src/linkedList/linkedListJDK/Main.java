package linkedList.linkedListJDK;

import java.util.Iterator;
import java.util.LinkedList;

import linkedList.doublyLinkedList.Employee;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e1 = new Employee("Ravi", 123L);
		Employee e2 = new Employee("Raj", 124L);
		Employee e3 = new Employee("Ram", 125L);
		LinkedList<Employee> empList = new LinkedList<Employee>();
		
		empList.addFirst(e3);
		empList.addFirst(e2);
		empList.addFirst(e1);
		
		empList.addLast(e1);
		
		
		
		
		Iterator itr = empList.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("--------------------------------------------------");
		
		empList.removeFirst();
		empList.removeLast();
		
		Iterator itr1 = empList.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
	}

}
