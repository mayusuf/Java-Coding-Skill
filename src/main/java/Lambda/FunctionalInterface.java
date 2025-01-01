package Lambda;

public class FunctionalInterface{

    public static void main(String[] args) {
//        FunctionalInterface functionalInterface = new FunctionalInterface();
        Printable printable =
                (s) -> "Meow " +s;

        printTrank(printable);
    }
    public static void printTrank(Printable printable) {
        printable.print("--!!");
    }
}
