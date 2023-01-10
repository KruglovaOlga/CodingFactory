package gr.aueb.cf.ch11OOP.model;



import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class MainReflection {

   public static void main(String[] args) {
            try {
                //Load class
                Class<?> aClass = Class.forName("gr.aueb.cf.ch11OOP.model.Main");

                //Get default constructor and create an instance
                Constructor<?> defaultCtr = aClass.getConstructor();
                Object rApp1 = defaultCtr.newInstance();
/*
                //Get overloaded constructor and create an instance
                Constructor<?> intCtr = aClass.getConstructor(Long.class, String.class,String.class);
                User rApp2 = (User) intCtr.newInstance(29L, "Ol","Kru");

*/
                System.out.println();

                //Get Public Constructor otherwise use getDeclaredConstructors
                Constructor<?>[] ctrList = aClass.getConstructors();
                System.out.println(Arrays.toString(ctrList));
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

/**************************************
 *  public static void printFields(Object object) {
 *         Class<?> cls = object.getClass();
 *         Field[] fields = cls.getDeclaredFields();
 *         System.out.print("{");
 *         for (Field field : fields) {
 *             System.out.print(field.getName() + ",");
 *         }
 *         System.out.println("}");
 *     }
 */
/*****************************************************
 * In this example, we have a UserCredentials class and a User class.
 * We create instances of these classes and pass them to the printFields method,
 * which uses the Java Reflection API to get all fields of the object and print their values.
 *
 * The printFields method uses the getDeclaredFields method of the Class class
 * to get all fields of the object, and the setAccessible method to set the
 * accessibility of the field to true, which allows us to access the value of
 * the field even if it has private access. Finally, we use the get method of the
 * Field class to get the value of the field and print it to the console.
 *
 * import java.lang.reflect.Field;
 *
 * public class MainReflection {
 *     public static void main(String[] args) {
 *         UserCredentials chrisCredentials = new UserCredentials(67L, "chris", "chris67");
 *         User chris = new User(3L, "Chris", "R.");
 *
 *         printFields(chrisCredentials);
 *         printFields(chris);
 *     }
 *
 *     public static void printFields(Object object) {
 *         Class<?> clazz = object.getClass();
 *         Field[] fields = clazz.getDeclaredFields();
 *
 *         System.out.print("{");
 *         for (Field field : fields) {
 *             field.setAccessible(true);
 *             try {
 *                 System.out.print(field.get(object) + ", ");
 *             } catch (IllegalAccessException e) {
 *                 e.printStackTrace();
 *             }
 *         }
 *         System.out.println("}");
 *     }
 * }
 */



