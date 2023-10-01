package streamApi;

import java.util.stream.IntStream;

public class PrallelSreamDemo {
	public static void main(String[] args) {

		IntStream.range(0, 100).forEach(x -> {
			System.out.println(Thread.currentThread().getName());
		});

//		Wih prallel
		IntStream.range(0, 100).parallel().forEach(x -> {
			System.out.println(Thread.currentThread().getName());
		});
	}
}
