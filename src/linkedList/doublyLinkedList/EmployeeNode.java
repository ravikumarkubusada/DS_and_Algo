package linkedList.doublyLinkedList;

public class EmployeeNode {

	private Employee employee;
	private EmployeeNode next;
	private EmployeeNode previous;
	
	
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

	public EmployeeNode getPrevious() {
		return previous;
	}

	public void setPrevious(EmployeeNode previous) {
		this.previous = previous;
	}
	
	
}
