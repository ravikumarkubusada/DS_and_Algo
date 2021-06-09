package hashtable.simpleHashtable;

public class SimpleArrayHashTable {
	private Employee[] hashTable;

	public SimpleArrayHashTable() {
		hashTable = new Employee[10];
	}
	
	public void put(Employee emp) {
		int hash = getHash(emp.getName());
		if(hashTable[hash] != null) {
			System.out.println("Sorry cannot insert");
			return;
		}
		hashTable[hash] = emp;
	}
	
	public Employee get(String key) {
		return hashTable[getHash(key)];
	}
	
	public int getHash(String key) {
//		some dumy hashing logic
		System.out.println("Hash=>"+ key.length() % hashTable.length);
		return key.length() % hashTable.length;
	}
	
	public void printHashTable() {
		for (int i = 0; i < hashTable.length; i++) {
			System.out.println(hashTable[i]);
		}
	}
}
