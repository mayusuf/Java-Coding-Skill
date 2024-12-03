package Q46StaticClass;

class OuterClass{

    static int a = 10;
    static int b = 15;
    private int c;

    static class InnerClass{

        static int d = 11;

        static void display(){
            System.out.println(a);
            System.out.println(b);
//            System.out.println(c);
        }

        static void display2(){
            System.out.println(d);
        }
    }
}

public class StaticInnerClass {

    public static void main(String[] args) {

        OuterClass.InnerClass InnerClass = new OuterClass.InnerClass();
        InnerClass.display();

        OuterClass.InnerClass.display2();

    }

}
