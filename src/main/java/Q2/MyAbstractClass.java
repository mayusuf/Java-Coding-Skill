package Q2;

abstract class MyAbstractClass {

    abstract void print();
    public void display(){
        System.out.println("Displaying AbstractDemo");
    }
}

class MyConcrete extends MyAbstractClass{

    public void print(){
        System.out.println("Printing ConcreteDemo");
    }

}