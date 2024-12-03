package Q37Comparator;

import java.util.Comparator;

class NameEmployee implements Comparator<NameEmployee> {

    private int id;
    private String name;
    private double salary;

    public NameEmployee() {}

    public NameEmployee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {

    }

    @Override
    public int compare(NameEmployee obj1, NameEmployee obj2) {
        return obj1.getName().compareTo(obj2.getName());
    }

    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }
}
