package Stream;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntegerStream {
    public static void main(String[] args) {

        // 1. Integer Stream
        IntStream
                .range(1, 6)
                .forEach(System.out::println);


        // 2. Integer Stream by skiping first 5 elements
        IntStream
                .range(1, 11)
                .skip(5)
                .forEach(x -> System.out.print(x + " "));

        System.out.println();

        // 3. Integer Stream : sum up
        System.out.println(
                IntStream
                .range(1, 11)
                .sum()
                );

        // 4.  Stream.of
        Stream.of("Ava", "Aneri", "Alberto")
                        .sorted()
                                .findFirst()
                                        .ifPresent(System.out::println);

        System.out.println();
    }
}
