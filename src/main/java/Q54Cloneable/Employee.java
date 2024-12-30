package Q54Cloneable;

public class Employee implements Cloneable {

    private String name;
    private int age;

    Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) throws CloneNotSupportedException {

        Employee e1 = new Employee("Yusuf", 41);

        System.out.println("Before Clone :" + e1.getName());

        Employee e2 = (Employee) e1.clone();

        e2.setName("Reshma");

        System.out.println("After Clone :" + e1.getName());
        System.out.println("After Clone :" + e2.getName());

    }
}
