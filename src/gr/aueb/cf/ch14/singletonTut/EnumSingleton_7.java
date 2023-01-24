package gr.aueb.cf.ch14.singletonTut;

/**
 * To overcome this situation with Reflection, Joshua Bloch suggests the use of enum to
 * implement the singleton design pattern as Java ensures that any enum value is
 * instantiated only once in a Java program. Since Java Enum values are globally accessible,
 * so is the singleton. The drawback is that the enum type is somewhat inflexible
 * (for example, it does not allow lazy initialization).
 */

public enum EnumSingleton_7 {

    INSTANCE;

    public static void doSomething() {
        // do something
    }
}
