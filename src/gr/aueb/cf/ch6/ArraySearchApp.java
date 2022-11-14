package gr.aueb.cf.ch6;

public class ArraySearchApp {

    public static void main(String[] args) {
        final int KEY = 30;
        boolean keyIsFound = false;
        int[] arr = {4, 7, 90, 40, 30, 80, 70};

        for (int item : arr) {
            if(item == KEY) {
                keyIsFound = true;
                break;
            }
        }

        int position = 0;
        for (int i = 0; i < arr.length;i++) {
            if (arr[i] == KEY) {
                keyIsFound = true;
                position = i;
                break;
            }
        }
        if (keyIsFound) {
            System.out.println("The key is found in the position " + arr[position - 1] );
        } else {
            System.out.println("The key is not found");
        }
    }
}
