package Q37Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableTest {
    public static void main(String[] args) {

        List<Employee> empList = new ArrayList<>();

        empList.add(new Employee(10, "Yusuf", 9000));
        empList.add(new Employee(2, "Salim", 8000));
        empList.add(new Employee(8, "Musfique", 7500));
        empList.add(new Employee(4, "Ali", 6000));

        Collections.sort(empList);
        System.out.println(empList);
    }
}
