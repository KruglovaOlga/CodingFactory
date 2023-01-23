package gr.aueb.cf.ch17nestedClasses.clon;

import java.io.*;

public class SerializeDemo {

    public static void main(String[] args) {

        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("C:/temp/trainee.ser")
        )){
            Trainee alice = new Trainee("Alice", new City("Athens"));
            oos.writeObject(alice);
            System.out.println("Success in serialization");
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (NotSerializableException e1) {
            System.out.println("Serializable Exception " + e1);
            e1.printStackTrace();
        } catch (IOException e2) {
            System.out.println("IOException " + e2);
            e2.printStackTrace();
        }
    }
}
