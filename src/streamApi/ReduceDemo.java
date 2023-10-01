package streamApi;

import java.util.stream.Stream;

public class ReduceDemo {
	public static void main(String[] args) {
//		reduction - sum
		Double sum = Stream.of(7.3, 10.9, 11.0)
			.reduce(0.0, (a,b) -> a+b);
		System.out.println(sum);
	}
}
