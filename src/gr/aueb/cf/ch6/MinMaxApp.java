package gr.aueb.cf.ch6;

public class MinMaxApp {

    public static void main(String[] args) {
        int[] arr = {4, 5, 9, 14, 65};
        int minPosition = 0;
        int maxPosition = 0;
        int minValue = arr[minPosition];
        int maxValue = arr[maxPosition];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minPosition = i;
                minValue = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < maxValue) {
                maxPosition = i;
                maxValue = arr[i];
            }
        }


    }
}
