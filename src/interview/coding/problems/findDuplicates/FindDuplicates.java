package interview.coding.problems.findDuplicates;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindDuplicates {

	public static void main(String[] args) {
		Stream<Integer> streamInt = Stream.of(5, 13, 4, 21, 13, 27, 2, 59, 59, 34);
		System.out.println(findDuplicateInStream(streamInt));

		Stream<String> streamStr = Stream.of("abc", "ab", "a", "a");
		
		System.out.println(findDuplicateInStream(streamStr));
	}

	private static <T> Set<T> findDuplicateInStream(Stream<T> stream) {

		Set<T> items = new HashSet<>();
		return stream.filter(n -> !items.add(n)).collect(Collectors.toSet());
	}
}
