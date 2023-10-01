package hashmap.sort;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortByKeyExample2 {

	public static void main(String[] args) {
		Map<String, String> unsortMap = new HashMap<String, String>();

		unsortMap.put("Z", "z");
		unsortMap.put("B", "b");
		unsortMap.put("A", "a");
		unsortMap.put("C", "c");
		unsortMap.put("D", "d");
		unsortMap.put("E", "e");
		unsortMap.put("Y", "y");
		unsortMap.put("N", "n");
		unsortMap.put("J", "j");
		unsortMap.put("M", "m");
		unsortMap.put("F", "f");
		System.out.println("Unsort Map......");
		printMap(unsortMap);

		Map<String, String> treeMap = new TreeMap<String, String>((Comparator<String>) (o1, o2) -> o2.compareTo(o1));
		treeMap.putAll(unsortMap);
		System.out.println("Sort Map......");
		printMap(treeMap);

	}

	private static <K, V> void printMap(Map<K, V> map) {

		for (Map.Entry<K, V> entry : map.entrySet()) {
			System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
		}
	}

}
