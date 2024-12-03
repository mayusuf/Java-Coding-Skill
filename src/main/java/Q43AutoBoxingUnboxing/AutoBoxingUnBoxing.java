package Q43AutoBoxingUnboxing;

import java.util.ArrayList;

public class AutoBoxingUnBoxing{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // Auto Boxing int to Integer
        list.add(6);
        list.add(7);
        list.add(4);

        // Unboxing
        int a = list.get(0);

        System.out.println(a);

    }
}
