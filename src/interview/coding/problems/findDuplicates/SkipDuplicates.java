package interview.coding.problems.findDuplicates;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SkipDuplicates {

	public static void main(String[] args) {
		Stream<String> list1 = Stream.of("a", "b", "c", "d");
		List<String> list2 = Arrays.asList("a", "d");
		list1.filter(ele -> !list2.contains(ele)).forEach(e -> System.out.println(e));
	}
}
