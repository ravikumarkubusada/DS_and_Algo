package hashset;

import java.util.HashMap;

public class CustomHashset {
	private HashMap hm;

	private static final Object PRESENT = new Object();

	public CustomHashset() {
		hm = new HashMap<>();
	}

	boolean add(int e) {
		return hm.put(e, PRESENT) == null;
	}

	boolean remove(int e) {
		return hm.remove(e) != null;
	}

}
