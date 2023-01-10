package gr.aueb.cf.ch14.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class ReflectionTeacherApp {

    public static void main(String[] args) {
        try {
            //Load class
            Class<?> clazz = Class.forName("gr.aueb.cf.ch14.reflect.Teacher");
            //Ctr == constructor
            //Get default constructor and create an instance
            Constructor<?> defaultCtr = clazz.getDeclaredConstructor(); //for public -> getConstructor, for private -> getDeclaredConstructor
            defaultCtr.setAccessible(true); //for private
            Teacher teacher1 = (Teacher) defaultCtr.newInstance();

            //Get overloaded constructor and create an instance
            Constructor<?> longCtr = clazz.getConstructor(Long.class);
            Teacher teacher2 = (Teacher) longCtr.newInstance(10L);

            //Get method sayHello and invoke on rApp1 instance
            Method sayHello = clazz.getMethod("sayHello");
            sayHello.invoke(teacher1);

            //Get method saySomething and invoke it on rApp2 instance
            Method saySomething = clazz.getMethod("saySomething", String.class);
            saySomething.invoke(teacher2, "Coding Factory");
            System.out.println();

            //Get Public Constructor otherwise use getDeclaredConstructors
            Constructor<?>[] ctrList = clazz.getDeclaredConstructors();
            System.out.println(Arrays.toString(ctrList));
            System.out.println();

            //Get public, private, protected, default methods
            Method[] mList = clazz.getDeclaredMethods();
            for (Method m : mList) {
                System.out.println("Method name: " + m.getName());
                int mod = m.getModifiers();
                System.out.println(Modifier.toString(mod));
            }
            System.out.println();

            //Get public private protected, default fields
            Field[] fList = clazz.getDeclaredFields();
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

