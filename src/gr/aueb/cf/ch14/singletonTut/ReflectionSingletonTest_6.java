package gr.aueb.cf.ch14.singletonTut;

import java.lang.reflect.Constructor;

/**
 * Reflection can be used to destroy all the singleton implementation approaches
 *
 * When you run the preceding test class, you will notice that hashCode of both instances
 * is not the same which destroys the singleton pattern.
 *
 * Reflection is very powerful and used in a lot of frameworks like Spring and Hibernate.
 */
public class ReflectionSingletonTest_6 {

    public static void main(String[] args) {
        EagerInitializedSingleton_1 instanceOne = EagerInitializedSingleton_1.getInstance();
        EagerInitializedSingleton_1 instanceTwo = null;
        try {
            Constructor[] constructors = EagerInitializedSingleton_1.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                // This code will destroy the singleton pattern
                constructor.setAccessible(true);
                instanceTwo = (EagerInitializedSingleton_1) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());
    }

}

