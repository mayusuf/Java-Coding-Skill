package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListClass {

    public static void main(String[] args){

        List<String> cars = new ArrayList<>();
        cars.add("Toyota");
        cars.add("BMW");
        cars.add("Audi");
        cars.add("Volvo");

        for(String car: cars){
            System.out.println(car);
        }

        System.out.println();

        cars.remove(2);
        cars.set(2, "Chevrolet");


        for(int i=0; i<cars.size(); i++){
            System.out.println(cars.get(i));
        }

        System.out.println(cars.indexOf("Chevrolet"));

        System.out.println(cars.contains("Toyota"));

        cars.add("Audi");

        if(!cars.isEmpty()){
            System.out.println(cars.get(2));
        }

        Iterator<String> iterator = cars.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        cars.add(0, "Start");
        System.out.println(cars);
    }
}
