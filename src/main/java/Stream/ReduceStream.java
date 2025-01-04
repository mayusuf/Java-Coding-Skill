package Stream;

import java.util.stream.Stream;

public class ReduceStream {
    public static void main(String[] args) {

        double total = Stream.of(11.23, 23.10,7.67)
                .reduce(0.0, (a , b) -> a+b);

        System.out.println(total);
    }
}
