package Q7;

interface interface1 {
    default void hello(){
        System.out.println("hello - interface1");
    }
}

interface interface2 {
    default void hello(){
        System.out.println("hello - interface2");
    }
}

public class Child implements interface1, interface2{

    @Override
    public void hello() {
        System.out.println("hello - child");
        interface2.super.hello();
    }

    public static void main(String[] args) {
        Child c = new Child();
        c.hello();
    }
}
