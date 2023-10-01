package streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {
	public static void main(String[] args) {

		List<List<String>> list = Arrays.asList(Arrays.asList("a"), Arrays.asList("b"));

		System.out.println(list);

		list.parallelStream().flatMap(List::stream).collect(Collectors.toList()).forEach(System.out::println);

	}
}
