package Q37Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorTest {
    public static void main(String[] args) {

//        List<NameEmployee> empList = new ArrayList<>();
//
//        empList.add(new NameEmployee(10, "Yusuf", 9000));
//        empList.add(new NameEmployee(2, "Salim", 8000));
//        empList.add(new NameEmployee(8, "Musfique", 7500));
//        empList.add(new NameEmployee(4, "Ali", 6000));

        List<NameAgeComparator> empList = new ArrayList<>();

        empList.add(new NameAgeComparator(10, "Yusuf", 90));
        empList.add(new NameAgeComparator(2, "Salim", 80));
        empList.add(new NameAgeComparator(8, "Yusuf", 75));
        empList.add(new NameAgeComparator(4, "Ali", 60));


        Collections.sort(empList, new NameAgeComparator());
        System.out.println(empList);

    }
}
