package Q24;

public class DemoException {

    public static void main(String[] args) {
        try {
            method1();
        }catch (MyException e){
            System.out.println(e.getMessage());
        }
    }

    public static void method1() throws MyException {
        throw new MyException("My Custom Own Exception");
    }
}
