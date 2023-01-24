package gr.aueb.cf.ch14.singletonTut;
import java.io.Serializable;

/**
 * Sometimes in distributed systems, we need to implement Serializable interface
 * in the singleton class so that we can store its state in the file system and
 * retrieve it at a later point in time.
 *
 */
public class SerializedSingleton_8 implements Serializable{


    private static final long serialVersionUID = -7604766932017737115L;

    private SerializedSingleton_8(){}

    private static class SingletonHelper {
        private static final SerializedSingleton_8 instance = new SerializedSingleton_8();
    }

    public static SerializedSingleton_8 getInstance() {
        return SingletonHelper.instance;
    }
}

/*
The problem with serialized singleton class is that whenever we deserialize it,
it will create a new instance of the class. Here is an example:

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SingletonSerializedTest {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        SerializedSingleton instanceOne = SerializedSingleton.getInstance();
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream(
                "filename.ser"));
        out.writeObject(instanceOne);
        out.close();

        // deserialize from file to object
        ObjectInput in = new ObjectInputStream(new FileInputStream(
                "filename.ser"));
        SerializedSingleton instanceTwo = (SerializedSingleton) in.readObject();
        in.close();

        System.out.println("instanceOne hashCode="+instanceOne.hashCode());
        System.out.println("instanceTwo hashCode="+instanceTwo.hashCode());

    }

}

That code produces this output:

Output
instanceOne hashCode=2011117821
instanceTwo hashCode=109647522

So it destroys the singleton pattern. To overcome this scenario, all we need
to do is provide the implementation of readResolve() method.

protected Object readResolve() {
    return getInstance();
}

After this, you will notice that hashCode of both instances is the same in the test program.
 */
