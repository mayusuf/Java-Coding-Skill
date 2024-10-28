package Q14;

public class TestExceptionHandle {

    public static void main(String[] args) {
        System.out.println("Program Started!!");
        try{
            int a = 15/0;
        }catch (ArithmeticException e){
            System.out.println("Exception Handler");
        }
        System.out.println("Program Finished!!");
    }
}
