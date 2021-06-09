package streamApi;

import java.util.stream.Stream;

public class OfDemo {

	public static void main(String[] args) {

		Stream.of(111, 22, 33).forEach(e -> System.out.println(e));

		Stream.of("hi", "hello", "why").filter(x -> x.length() >= 3).forEach(e -> System.out.println(e));
	}

}
