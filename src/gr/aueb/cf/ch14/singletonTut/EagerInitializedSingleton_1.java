package gr.aueb.cf.ch14.singletonTut;

/**
 * Singleton Pattern Principles
 * Singleton pattern restricts the instantiation of a class and ensures that only one instance of the class exists in the Java Virtual Machine.
 * The singleton class must provide a global access point to get the instance of the class.
 * Singleton pattern is used for logging, drivers objects, caching, and thread pool.
 * Singleton design pattern is also used in other design patterns like Abstract Factory, Builder, Prototype, Facade, etc.
 * Singleton design pattern is used in core Java classes also (for example, java.lang.Runtime, java.awt.Desktop).
 *
 * Java Singleton Pattern Implementation
 * To implement a singleton pattern, we have different approaches, but all of them have the following common concepts.
 *
 * Private constructor to restrict instantiation of the class from other classes.
 * Private static variable of the same class that is the only instance of the class.
 * Public static method that returns the instance of the class, this is the global
 * access point for the outer world to get the instance of the singleton class.
 */
public class EagerInitializedSingleton_1 {
    /**
     * In eager initialization, the instance of the singleton class is created at the time
     * of class loading. The drawback to eager initialization is that the method is created even though
     * the client application might not be using it.
     */

    private static final EagerInitializedSingleton_1 instance = new EagerInitializedSingleton_1();

    // private constructor to avoid client applications using the constructor
    private EagerInitializedSingleton_1(){}

    public static EagerInitializedSingleton_1 getInstance() {
        return instance;
    }
}


