import java.io.*;

class Person implements Serializable {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    @Override
    public String toString() {
        return "Person [Name=" + name + ", Age=" + age + "]";
    }
}

public class SavePerson {
    public static void main(String[] args) {
        Person person[] = new Person[5];
        person[0] = new Person("John Doe", 30);     
        person[1] = new Person("Dhoni", 34);
        person[2] = new Person("Messi", 22);
        person[3] = new Person("Marquez", 19);
        person[4] = new Person("Hamilton", 20);        
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.ser"))) {
            oos.writeObject(person);
            System.out.println("Person object has been saved to 'person.ser'");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
