package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayStream {
    public static void main(String[] args) {

        String[] names = {"Sarika", "Hassan", "Fero", "Zinia", "Pasa", "Yusuf", "Mohammmad", "Hafiz"};

        Arrays.stream(names)
                .filter(s -> s.startsWith("H"))
                .sorted()
                .forEach(System.out::println);

        System.out.println();

        int[] arr = {4,5,9,8, 5,6};
        Arrays.stream(arr)
                .map( x-> x*x)
                .filter( x-> x%2 == 0)
                .sorted()
                .forEach(System.out::println);

        System.out.println();

        int[] arr1 = {4,5,9,8, 5,6};
        Arrays.stream(arr1)
                .map( x-> x*x)
                .filter( x-> x%2 == 0)
                .average()
                        .ifPresent(System.out::println);

        System.out.println();

        List<String> people = new ArrayList<>();
        people.add("Al"); people.add("Silla"); people.add("Brent"); people.add("Navim");

        people.stream()
                .map(String::toLowerCase)
                .filter(x->x.startsWith("n"))
                .forEach(System.out::println);

        System.out.println();
    }
}
