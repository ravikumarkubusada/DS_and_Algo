package streamApi;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapDemo {

	public static void main(String[] args) throws IOException {
		Stream<String> sringStream = Stream.of("Ravi", "Raju", "Ani", "Sibi", "Roma");

		sringStream.map(x -> x.toLowerCase()).filter(x -> x.startsWith("r")).forEach(System.out::println);

//		map demo 2
// non working code as we dont hv csv file. but we can do this with
		Stream<String> lines = Files.lines(Paths.get("WebContent/META-INF/META-INF.MF"));
		
		Map<String, Integer> collect = lines
			.map(x -> x.split(","))
			.filter(x-> x.length > 3)
			.filter(x -> Integer.parseInt(x[0]) > 15)
			.collect(Collectors.toMap(x -> x[0], x-> Integer.parseInt(x[1])));
		
		collect.forEach((k,v) -> System.out.println(v));
	}

}
