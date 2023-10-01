package streamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arList = new ArrayList<Integer>();
		arList.add(10);
		arList.add(20);
		arList.add(30);

		Stream<Integer> arStream = arList.stream();

		Stream<Integer> filter = arStream.filter(e -> e >= 15);

		List<Integer> collect = filter.collect(Collectors.toList());

//		filter methos
//		doing all the above in one line 

		arList.stream().filter(e -> e >= 15).collect(Collectors.toList()).forEach(e -> System.out.println(e));
// count method
		

	}

}
