package Q21;

public class ThrowCheckedException {

    public static void method1(){
        method2();
    }

    public static void method2(){
        //throw new IOException("Call from method2");
    }

    public static void main(String[] args) {

        method1();
    }
}
