package gr.aueb.cf.ch19Collections;

public class GenericMethodClass {

    public static void main(String[] args) {
        Integer[] intArr = {1, 2, 3, 4, 5};
        String[] strArr = {"Athens", "London","Paris"};

        printArray(intArr);
        printArray(strArr);
    }

    public static <T> void  printArray(T[] array) {
        for (T item : array) {
            System.out.println(item);
        }
    }



    public static void print(Node<?> node) {
        System.out.println(node.getItem());
    }

    public static void printN(Node<? extends Number> node) {
        System.out.println(node.getItem());
    }

    public static void printO(Node<? super Number> node) {
        System.out.println(node.getItem());
    }
}
