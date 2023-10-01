package streamApi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ShortestString {

    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "Bon",
                "Einstein",
                "Alice",
                "Whitman",
                "Bob",
                "Spider"
        );


        // 1.1 print to console=
        System.out.println("Original String List :- \n" + names);


        // 2. find Shortest String using .min(Comparator.comparingInt(String::length)).get()
        String shortestString = names
                .stream()
                .min(Comparator.comparingInt(String::length))
                .get();
        System.out.println("\nShortest String is = "
                + shortestString);
    }
}
