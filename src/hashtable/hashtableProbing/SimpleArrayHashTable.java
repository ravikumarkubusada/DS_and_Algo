package hashtable.hashtableProbing;

public class SimpleArrayHashTable {
	private StoredEmployee[] hashTable;

	public SimpleArrayHashTable() {
		hashTable = new StoredEmployee[10];
	}

	public void put(Employee emp) {
		int hashedKey = getHash(emp.getName());

		if (occupied(hashedKey)) { // if the value is occupied in the array we need to linear probing
			int stopIndex = hashedKey;
			if (hashedKey == hashTable.length - 1) {
				hashedKey = 0;
			} else {
				hashedKey++;
			}
			while (occupied(hashedKey) && hashedKey != stopIndex) {
				hashedKey = (hashedKey + 1) % hashTable.length; // takes care of the mapping and wraps up to index 0
			}
		}

		if (occupied(hashedKey)) {
//			if  the position is filled look for another position
			System.out.println("Sorry cannot insert");
			return;
		} else {
			hashTable[hashedKey] = new StoredEmployee(emp.getName(), emp);
		}
	}

	public Employee remove(String key) {
		int hashedKey = getHash(key);

		if (hashedKey == -1) {
			System.out.println("Key not found: " + key);
			return null;
		}
		Employee e = hashTable[hashedKey].employee;
		
		/*
		 * Empty 
		 * Empty 
		 * Empty 
		 * Employee [name=Raj, empId=124]
		 * Empty -- null here
		 * Employee [name=Ram, empId=125] 
		 * Empty 
		 * Empty 
		 * Empty 
		 * Empty 
		 * find(Ram) => returns null eventhoug we have data in our Hashtable, it happening because of null in btw the hashTable
		 * to fix this issue will rehash the whole table again to take out the null;
		 */
		hashTable[hashedKey] = null;
		StoredEmployee[] oldHashTable = hashTable;
		hashTable = new StoredEmployee[oldHashTable.length];
		
		for (int i = 0; i < oldHashTable.length; i++) {
			if(oldHashTable[i] != null) {
				put(oldHashTable[i].employee);
			}
		}
		
		return e;

	}

	public Employee get(String key) {

		return findKey(key) == -1 ? null : hashTable[findKey(key)].employee;
	}

	public int getHash(String key) {
//		some dumy hashing logic for now
		return key.length() % hashTable.length;
	}

	private boolean occupied(int index) {
		return hashTable[index] != null;
	}

	public void printHashTable() {
		for (int i = 0; i < hashTable.length; i++) {
			System.out.println(hashTable[i] == null ? "Empty" : hashTable[i].employee);
		}
	}

	private int findKey(String key) {
		int hashedKey = getHash(key);

		if (hashTable[hashedKey] != null && hashTable[hashedKey].key.equals(key)) {
			return hashedKey;
		}
//		if we cant find the unique row, we need to do the linear probing

		int stopIndex = hashedKey;
		if (hashedKey == hashTable.length - 1) {
			hashedKey = 0;
		} else {
			hashedKey++;
		}
		while (hashedKey != stopIndex && hashTable[hashedKey] != null && !hashTable[hashedKey].key.equals(key)) {
			hashedKey = (hashedKey + 1) % hashTable.length; // takes care of the mapping and wraps up to index 0
		}

		if(hashTable[hashedKey] != null && !hashTable[hashedKey].key.equals(key)) {
			return hashedKey;
		} else {
			return -1;
		}
	}
}
