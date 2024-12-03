package Q46InnerClass;

class OuterClass {
    static int a = 10;
    static int b = 20;
    private int c = 30;

    static void display() {

        int d = 40;

        class LocalInnerClass {

            void print() {
//                d = 50;
                System.out.println(a);
                System.out.println(b);
//                System.out.println(c);
//                System.out.println(d);
            }
        }

        LocalInnerClass local = new LocalInnerClass();
        local.print();
    }
}

public class InnerClass {
    public static void main(String[] args) {
//        OuterClass outer = new OuterClass();
//        outer.display();
        OuterClass.display();
    }
}
