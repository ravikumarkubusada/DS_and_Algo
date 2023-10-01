package streamApi;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class SummaryStatisticsDemo {
	public static void main(String[] args) {
		IntSummaryStatistics summary = IntStream.of(10, 30, 50, 1, 2, 3).summaryStatistics();

		System.out.println(summary);

	}
}
