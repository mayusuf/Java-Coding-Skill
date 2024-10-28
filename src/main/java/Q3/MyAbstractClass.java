package Q3;

abstract class MyAbstractClass {

    public int a;
    public int b;

    MyAbstractClass(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("MyAbstractClass Super Constructor");
    }

    abstract void print();

    public void display() {
        System.out.println("Displaying AbstractDemo");
    }
}

class MyConcrete extends MyAbstractClass{

    MyConcrete(int a, int b) {
        super(a, b);
        System.out.println("MyConcrete Constructor");
    }

    public void print(){

        System.out.println("Printing ConcreteDemo");
        System.out.println(this.a + " " + this.b + " Result " + (this.a+this.b));
    }

}