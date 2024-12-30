package Q51VariableShadowHide;

class Parent{

    String x = "Hi Parent";
    String name = "Mike";
    int age = 70;

    void display(){

        String name = "Yusuf";
        int age = 41;

        System.out.println("Shadowing Variable ");
        System.out.println("Name : "+ name );
        System.out.println("Age : "+ age );
    }
}

class Child extends Parent{

    String x = "Hi Child";

    void print(){
        System.out.println("Hiding Variable : "+ x);
    }
}

public class ShadowHide {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.display();

        Child child = new Child();
        child.print();
    }


}
