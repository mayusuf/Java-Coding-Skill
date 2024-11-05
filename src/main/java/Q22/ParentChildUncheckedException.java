package Q22;

class ParentUnChecked {

    public void hello(){
        System.out.println("hello from Parent");
    }
}
class ChildUnChecked extends ParentUnChecked {
    public void hello() throws ArithmeticException {
        System.out.println("hello from Child. Prove that child class declare exception whatever it had " +
                "no declare in parent class !!");
    }
}

class ParentChildUncheckedException {

    public static void main(String[] args) {

        ParentUnChecked p = new ChildUnChecked();
        p.hello();
    }
}
