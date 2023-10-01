package streamApi;

import java.util.ArrayList;
import java.util.List;

public class DecendingSortedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arList = new ArrayList<Integer>();
		arList.add(101);
		arList.add(20);
		arList.add(230);

		arList.stream().sorted((i1, i2) -> i2.compareTo(i1)).forEach(e -> System.out.println(e));

		arList.stream().filter(e -> e >= 100).sorted((i1, i2) -> i2.compareTo(i1)).forEach(e -> System.out.println(e));
	}

}
