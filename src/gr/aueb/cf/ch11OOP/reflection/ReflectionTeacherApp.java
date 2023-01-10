package gr.aueb.cf.ch11OOP.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class ReflectionTeacherApp {

    public static void main(String[] args) {
        try {
            //Load class
            Class<?> aClass = Class.forName("gr.aueb.cf.ch11OOP.reflection.Teacher");

            //Get default constructor and create an instance
            Constructor<?> defaultCtr = aClass.getConstructor();
            Object rApp1 = defaultCtr.newInstance();

            //Get overloaded constructor and create an instance
            Constructor<?> intCtr = aClass.getConstructor(Long.class);
            Teacher rApp2 = (Teacher) intCtr.newInstance(10L);

            //Get method sayHello and invoke on rApp1 instance
            Method sayHello = aClass.getMethod("sayHello");
            sayHello.invoke(rApp1);

            //Get method saySomthing and invoke it on rApp2 instance
            Method saySomthing = aClass.getMethod("saySomething", String.class);
            saySomthing.invoke(rApp2, "Coding Factory");
            System.out.println();

            //Get Public Constructor otherwise use getDeclaredConstructors
            Constructor<?>[] ctrList = aClass.getConstructors();
            System.out.println(Arrays.toString(ctrList));
            System.out.println();

            //Get public, private, protected, default methods
            Method[] mList = aClass.getDeclaredMethods();
            for (Method m : mList) {
                System.out.println("Method name: " + m.getName());
            }
            System.out.println();

            //Get public private protected, default fields
            Field[] fList = aClass.getDeclaredFields();
            for (Field f : fList) {
                System.out.println("Field name: " + f.getName());
                int mod = f.getModifiers();
                System.out.println(Modifier.toString(mod));
            }
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}

