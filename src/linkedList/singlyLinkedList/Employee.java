package linkedList.singlyLinkedList;

public class Employee {
	private String name;
	private Long empId;
	
	
	/**
	 * @param name
	 * @param empId
	 */
	public Employee(String name, Long empId) {
		this.name = name;
		this.empId = empId;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", empId=" + empId + "]";
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getEmpId() {
		return empId;
	}
	public void setEmpId(Long empId) {
		this.empId = empId;
	}

}
