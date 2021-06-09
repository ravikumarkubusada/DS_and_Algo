package streamApi;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamOfVsArraysStream {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };

		System.out.println("With Array");
		IntStream stream = Arrays.stream(arr);
		stream.forEach(System.out::println);

		System.out.println("With stream");

		Stream<int[]> of = Stream.of(arr);

		IntStream flatMapToInt = of.flatMapToInt(Arrays::stream);

		flatMapToInt.forEach(System.out::println);

	}
}
