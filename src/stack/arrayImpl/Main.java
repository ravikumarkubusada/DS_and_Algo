package stack.arrayImpl;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee("Ravi", 123L);
		Employee e2 = new Employee("Raj", 124L);
		Employee e3 = new Employee("Ram", 125L);
		
		Arraystack st = new Arraystack(10);
		
		st.push(e1);
		st.push(e2);
		st.push(e3);
		
		st.printStack();
		System.out.println(st.size());
//		System.out.println(st.peek());
//		
//		st.pop();
		
//		System.out.println(st.pop());
		
//		System.out.println(st.peek());
	}

}
