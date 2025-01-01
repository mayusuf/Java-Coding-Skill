package Enum;

import java.util.Scanner;

public class EnumClass {
    public static void main(String[] args) {

        //System.out.println("Yusuf's grade is : " +Level.HIGH);
        Scanner command = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        String s, grade;

        do {

            grade = scanner.nextLine();

            switch (grade) {
                case "L":
                    System.out.println("Your Grade is :" + Level.LOW);
                    break;
                case "M":
                    System.out.println("Your Grade is :" + Level.MEDIUM);
                    break;
                case "H":
                    System.out.println("Your Grade is :" + Level.HIGH);
                    break;
                default:
                    System.out.println("Your Grade is not decided Yet");

            }

            System.out.println("Press Q if you want to quit");
            s = command.nextLine();

        }while(!s.equals("Q"));

        scanner.close();
    }
}
