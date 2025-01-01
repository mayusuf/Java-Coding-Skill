package UserInput;

import java.util.Scanner;

public class Input {
    public static void main(String[] args){

        // Input taking with the class Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Please enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Are you Male :: ");
        boolean gender = scanner.nextBoolean();

        System.out.println("Please enter your salary: ");
        Double salary = scanner.nextDouble();

        System.out.println("Name: " + name + "\nAge: " + age + "\nGender: " + (gender? "Male" : "Female") + "\nSalary: " + salary);
    }
}
