package hashtable.hashtableChaining;

import java.util.LinkedList;

public class ChainedHashTable {

	private LinkedList<Employee>[] hashTable;

	public ChainedHashTable() {
		hashTable = new LinkedList[10];
		for (int i = 0; i < hashTable.length; i++) {
			hashTable[i] = new LinkedList<Employee>();
		}
	}

	public void add(Employee emp) {
//		int hashedKey = 

	}

	private int hashKey(String key) {
		return key.length() % hashTable.length;
	}

}
