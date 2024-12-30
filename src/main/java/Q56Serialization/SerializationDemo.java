package Q56Serialization;

import java.io.*;

// A class implementing Serializable
class Person implements Serializable {
    private static final long serialVersionUID = 1L; // Recommended for versioning
    String name;
    int age;
    int salary;

    // Constructor
    public Person(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + ", salary="+ salary + "}";
    }
}

public class SerializationDemo {
    public static void main(String[] args) {
        // Create an object of the Person class
        Person person = new Person("Alice", 25, 25000);

        // Serialization
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.ser"))) {
            oos.writeObject(person); // Serialize the object
            System.out.println("Object serialized successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialization
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.ser"))) {
            Person deserializedPerson = (Person) ois.readObject(); // Deserialize the object
            System.out.println("Deserialized Object: " + deserializedPerson);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
