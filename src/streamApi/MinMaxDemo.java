package streamApi;

import java.util.ArrayList;
import java.util.List;

public class MinMaxDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arList = new ArrayList<Integer>();
		arList.add(101);
		arList.add(20);
		arList.add(230);

		System.out.println("Min= " + arList.stream().min((i1, i2) -> i1.compareTo(i2)).get());

		System.out.println("Max= " + arList.stream().min((i1, i2) -> i2.compareTo(i1)).get());
	}

}
