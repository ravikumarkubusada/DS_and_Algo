package queue.arrayImpl;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee("Ravi", 123L);
		Employee e2 = new Employee("Raj", 124L);
		Employee e3 = new Employee("Ram", 125L);
		
		ArrayQueue queue = new ArrayQueue(10);
		
		queue.add(e1);
		queue.add(e2);
		queue.add(e3);
		
//		queue.printQueue();
		
		queue.remove();
//		queue.remove();
//		queue.remove();
//		queue.remove();
		
		
//		
		queue.printQueue();
		
//		System.out.println(queue.peek());
	}

}
