package gr.aueb.cf.ch6Arrays;

/**
 * Replaces all occurences of KEY in array of ints
 */
public class ArrayUpdateApp {
    public static void main(String[] args) {
        final int KEY = 10;
        boolean keyISfound = false;
        int[] arr = {1, 5, 8, 9, 10, 15};

        for (int i = 0; i < arr.length;i++) {
            if (arr[i] == KEY) {
                arr[i] = KEY * 2;
            }
        }

        for (int item : arr) {
            System.out.println(item + " ");
        }
    }
}
