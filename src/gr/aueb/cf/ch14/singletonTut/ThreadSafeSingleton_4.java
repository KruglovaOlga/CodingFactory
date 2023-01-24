package gr.aueb.cf.ch14.singletonTut;

/**
 * A simple way to create a thread-safe singleton class is to make the global access
 * method synchronized so that only one thread can execute this method at a time.
 */
public class ThreadSafeSingleton_4 {

    private static ThreadSafeSingleton_4 instance;

    private ThreadSafeSingleton_4(){}

    public static synchronized ThreadSafeSingleton_4 getInstance() {
        if (instance == null) {
            instance = new ThreadSafeSingleton_4();
        }
        return instance;
    }

}

    /*
    The preceding implementation works fine and provides thread-safety, but it reduces
    the performance because of the cost associated with the synchronized method,
    although we need it only for the first few threads that might create separate instances.
    To avoid this extra overhead every time, double-checked locking principle is used.
    In this approach, the synchronized block is used inside the if condition with an
    additional check to ensure that only one instance of a singleton class is created.
    The following code snippet provides the double-checked locking implementation:

    public static ThreadSafeSingleton getInstanceUsingDoubleLocking() {
    if (instance == null) {
        synchronized (ThreadSafeSingleton.class) {
            if (instance == null) {
                instance = new ThreadSafeSingleton();
            }
        }
    }
    return instance;
}
     */

