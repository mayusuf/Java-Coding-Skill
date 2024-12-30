package Q49InitBlock;

class Parent{
    {
        System.out.println("Parent Init Block 1");
    }
    public Parent(){
        System.out.println("Parent Constructor");
    }
    {
        System.out.println("Parent Init Block 2");
    }
    static {
        System.out.println("Parent Init Static Block");
    }
}

class Child extends Parent{
    {
        System.out.println("Child Init Block 1");
    }
    public Child(){
        System.out.println("Child Constructor");
    }
    {
        System.out.println("Child Init Block 2");
    }
    static {
        System.out.println("Child Init static Block 1");
    }
}
public class InitBlockClass {

    public static void main(String[] args){
        new Child();
    }
}
