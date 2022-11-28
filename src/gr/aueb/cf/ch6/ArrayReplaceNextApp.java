package gr.aueb.cf.ch6;

/**
 * Moves elements one position to the left.
 * Last element becomes zero. Essentially,
 * replaces each array element with the next one.
 */
public class ArrayReplaceNextApp {

    public static void main(String[] args) {
        int[] arr = {1, 5, 8, 9, 10, 15};

        for (int i = 0; i <= arr.length - 2; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = 0;

        for (int element : arr) {
            System.out.println(element + " ");
        }
    }
}
