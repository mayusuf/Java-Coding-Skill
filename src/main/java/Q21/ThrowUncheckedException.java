package Q21;

public class ThrowUncheckedException {

    public static void method1(){
        method2();
    }

    public static void method2(){
        //try{
            throw new ArithmeticException("ArithmeticException from method 2 !!");
        //}catch (ArithmeticException e){
          //  System.out.println(e);
        //}

    }

    public static void main(String[] args) {

        //try{
            method1();
        //}catch (ArithmeticException e){
        //    System.out.println("Exception Handled !!");
        //}

    }
}
