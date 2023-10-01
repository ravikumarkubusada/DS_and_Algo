package streamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import hashmap.hashcode_equals.Student;

public class MergingStreams {

	public static void main(String[] args) {
		Stream<Integer> seq1 = Stream.of(1, 3, 5);
		Stream<Integer> seq2 = Stream.of(2, 4, 6);

		Stream<Integer> seqMerged = Stream.concat(seq1, seq2);

		seqMerged.forEach(a -> System.out.println(a));

		Stream<String> stream1 = Stream.of("foo", "bar");
		Stream<String> stream2 = Stream.of("foo2", "bar");

		Stream<String> resultingStream = Stream.concat(stream2, stream1).distinct();
		System.out.println(resultingStream.collect(Collectors.toList()).toString());

		Student alex1 = new Student(1, "Alex");
		Student alex2 = new Student(2, "Alex");
		Student alex3 = new Student(3, "Alex");
		Student alex4 = new Student(4, "Alex");

		List<Student> studentList = new ArrayList<Student>();

		studentList.add(alex1);
		studentList.add(alex2);

		List<Student> studentList2 = new ArrayList<Student>();

		studentList.add(alex1);
		studentList.add(alex3);

//		Stream<Student> distinct = Stream.concat(studentList.stream(), studentList2.stream()).distinct();
		Stream<Student> distinct = Stream.concat(studentList.stream(), studentList2.stream());

		distinct.forEach(a -> System.out.println(a.getId()));

	}
}
