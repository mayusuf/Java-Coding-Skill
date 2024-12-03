package Q37Comparator;

import java.util.Comparator;

class NameAgeComparator implements Comparator<NameAgeComparator> {

    private int id;
    private String name;
    private int age;

    public NameAgeComparator() {}

    public NameAgeComparator(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {

    }

    @Override
    public int compare(NameAgeComparator o1, NameAgeComparator o2) {
        int flag  = o1.getName().compareTo(o2.getName());

        if(flag == 0){
            flag = o1.getAge() - o2.getAge();
        }

        return flag;
    }

    public String toString(){

        return "[Employee ID: " + this.getId() + ", Name: " + this.getName() + ", Age: " + this.getAge() + "]";
    }
}
