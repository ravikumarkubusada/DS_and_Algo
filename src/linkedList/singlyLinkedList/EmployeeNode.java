package linkedList.singlyLinkedList;

import linkedList.singlyLinkedList.Employee;

public class EmployeeNode {

	private Employee employee;
	private EmployeeNode next;
	
	
	/**
	 * @param employee
	 */
	public EmployeeNode(Employee employee) {
	
		this.employee = employee;
	}
	
	
	public String toString() {
		return employee.toString();
	}


	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public EmployeeNode getNext() {
		return next;
	}
	public void setNext(EmployeeNode next) {
		this.next = next;
	}
	
}
