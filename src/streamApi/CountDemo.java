package streamApi;

import java.util.ArrayList;
import java.util.List;

public class CountDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arList = new ArrayList<Integer>();
		arList.add(10);
		arList.add(20);
		arList.add(30);

		System.out.println(arList.stream().count());

		System.out.println(arList.stream().filter(e -> e >= 15).count());
	}

}
