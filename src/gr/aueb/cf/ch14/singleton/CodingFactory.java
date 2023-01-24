package gr.aueb.cf.ch14.singleton;
/**
 * To implement a singleton pattern, we have different approaches, but all of them have the following common concepts.
 *
 * Private constructor to restrict instantiation of the class from other classes.
 * Private static variable of the same class that is the only instance of the class.
 * Public static method that returns the instance of the class, this is the global access point for the outer world to get the instance of the singleton class.
 *
 * In eager initialization, the instance of the singleton class is created at the time of class loading. The drawback to eager initialization is that the method is created even though the client application might not be using it.
 *
 * If your singleton class is not using a lot of resources, this is the approach to use. But in most of the scenarios, singleton classes are created for resources such as File System, Database connections, etc. We should avoid the instantiation unless the client calls the getInstance method. Also, this method doesn’t provide any options for exception handling.
 */

/**
 * POJO class - Singleton
 * Eager Instantiation
 */
public class CodingFactory {
    private static final CodingFactory INSTANCE = new CodingFactory();
    private CodingFactory(){}
    public static CodingFactory getInstance() {
        return INSTANCE;
    }

    public void sayHello() {
        System.out.println("Hello");
    }
}
