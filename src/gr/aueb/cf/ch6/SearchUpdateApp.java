package gr.aueb.cf.ch6;

/**
 * Search for a specific int and update
 */
public class SearchUpdateApp {

    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 6, 9,};
        update(arr, 1, 71);
        delete(arr, 9);

        for (int item : arr) {
            System.out.print(item + " ");
        }

    }

    public static int getPosition(int[] arr, int num) {
        int position = -1;

        if (arr == null) return -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                position = i;
                break;
            }
        }
        return position;
    }
    public static void update (int[] arr, int oldValue, int newValue) {
        if (arr == null) return;
        int positionToUpdate = getPosition(arr, oldValue);
        if (positionToUpdate == -1) {
            System.out.println("value was not found");
            return;
        }
        arr[positionToUpdate] = newValue;

    }

    public static void delete(int[] arr, int num) {
        int positionToDelete = -1;
        if(arr == null) return;

        positionToDelete = getPosition(arr, num);

        if (positionToDelete == -1) {
            System.out.println("value was not found");
            return;
        }

        for (int i = positionToDelete; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        arr[arr.length - 1] = 0;
    }
}
