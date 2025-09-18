import java.io.*;

public class ReadPerson {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.ser"))) {
            Person[] people = (Person[]) ois.readObject();  
            for (Person p : people) {
                System.out.println(p);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
