package gr.aueb.cf.ch14.singletonTut;

/**
 * Lazy initialization method to implement the singleton pattern creates the instance in the global access method.
 */
public class LazyInitializedSingleton_3 {
    /**
     * The preceding implementation works fine in the case of the single-threaded environment,
     * but when it comes to multi-threaded systems, it can cause issues if multiple threads
     * are inside the if condition at the same time. It will destroy the singleton pattern
     * and both threads will get different instances of the singleton class.
     *
     */

    private static LazyInitializedSingleton_3 instance;

    private LazyInitializedSingleton_3(){}

    public static LazyInitializedSingleton_3 getInstance() {
        if (instance == null) {
            instance = new LazyInitializedSingleton_3();
        }
        return instance;
    }
    }

