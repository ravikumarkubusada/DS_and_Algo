package hashtable.simpleHashtable;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee("Ravi", 123L);
		Employee e2 = new Employee("Raj", 124L);
		Employee e3 = new Employee("Ram", 125L);

		SimpleArrayHashTable hm = new SimpleArrayHashTable();
		
		hm.put(e1);
		hm.put(e1);
		
//		hm.printHashTable();
		System.out.println(hm.get("Ravi"));
		
	}

}
