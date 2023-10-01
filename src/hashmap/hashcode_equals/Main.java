package hashmap.hashcode_equals;

import java.util.HashSet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student alex1 = new Student(1, "Alex");
		Student alex2 = new Student(2, "Alex");
		Student alex3 = new Student(3, "Alex");
		Student alex4 = new Student(4, "Alex");

		HashSet<Student> students = new HashSet<Student>();
		students.add(alex1);
		students.add(alex2);
		students.add(alex3);
		students.add(alex4);
		
		System.out.println("HashSet size = " + students.size());

		System.out.println("alex1 hashcode = " + alex1.hashCode());
		System.out.println("alex2 hashcode = " + alex2.hashCode());
		System.out.println("alex3 hashcode = " + alex3.hashCode());
		System.out.println("alex4 hashcode = " + alex4.hashCode());
		System.out.println("Checking equality between alex1 and alex2 = " + alex1.equals(alex2));
		
		System.out.println(alex1.equals(alex1));
	}

}
