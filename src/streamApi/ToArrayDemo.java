package streamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ToArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arList = new ArrayList<Integer>();
		arList.add(101);
		arList.add(20);
		arList.add(230);

		Object[] array = arList.stream().toArray();

		for (Object o : array) {
			System.out.println(o);
		}

		// Also
		System.out.println("Using Of method");
		Stream.of(array).forEach(e -> System.out.println(e));
	}

}
