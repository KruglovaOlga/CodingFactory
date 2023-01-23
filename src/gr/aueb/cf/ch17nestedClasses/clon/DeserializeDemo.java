package gr.aueb.cf.ch17nestedClasses.clon;

import java.io.*;

public class DeserializeDemo {

    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream("C:/temp/trainee.ser")
        )){
            Trainee alice;
            alice = (Trainee) ois.readObject();
            System.out.println(alice);
            System.out.println("Success in deserialization");
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (NotSerializableException e1) {
            System.out.println("Serializable Exception " + e1);
            e1.printStackTrace();
        } catch (IOException e2) {
            System.out.println("IOException " + e2);
            e2.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
