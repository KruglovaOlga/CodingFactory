package gr.aueb.cf.ch19Collections;

import java.util.Arrays;
import java.util.List;

public class GenericsTest {

    public static void main(String[] args) {
        var list = List.of(1, 2, 3, 4, 5);
        var strArr = Arrays.asList("Athens", "London", "Paris");

        Integer[] intArr = {1, 2, 3,};

        print(list);
        print(strArr);
        print(intArr);
    }

    public static void print(List<?> list) {
        list.forEach(System.out::println);
    }

    public static <T> void print(T[] arr) {
        for(T item : arr) {
            System.out.println(item);
        }
    }
}
