package gr.aueb.cf.ch14.singletonTut;

/**
 * Static block initialization implementation is similar to eager initialization,
 * except that instance of the class is created in the static block that provides the option for exception handling.
 *
 *Both eager initialization and static block initialization create the instance
 * even before it’s being used and that is not the best practice to use.
 */
public class StaticBlockSingleton_2 {

    private static StaticBlockSingleton_2 instance;

    private StaticBlockSingleton_2(){}

    // static block initialization for exception handling
    static {
        try {
            instance = new StaticBlockSingleton_2();
        } catch (Exception e) {
            throw new RuntimeException("Exception occurred in creating singleton instance");
        }
    }

    public static StaticBlockSingleton_2 getInstance() {
        return instance;
    }
}

