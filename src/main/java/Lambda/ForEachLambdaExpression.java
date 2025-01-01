package Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ForEachLambdaExpression {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

//        list.forEach(System.out::println);

//        list.forEach(n -> System.out.println(n));
        // lambda expression can be assigned to a variable

        Consumer<Integer> method = (n) -> { System.out.println(n); };
        list.forEach(method);

    }
}
