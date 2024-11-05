package Q22;

import java.io.IOException;

class Parent{
    // No checked exception is introduced here
//    public void hello(){
//        System.out.println("Parent class hello method");
//    }

    // Checked exception is introduced here
    public void hello() throws IOException{

        System.out.println("hello from parent !!");

    }
}

class Child extends Parent {

    //checked exception doesn't support overriden method if parent class method doesn't declare exception
    public void hello() throws IOException {
        System.out.println("Parent class method hello is overriden for checked exception!!");
    }

}

class ParentChildException {
    public static void main(String[] args) throws IOException {
        Parent p = new Child();
        p.hello();
    }
}