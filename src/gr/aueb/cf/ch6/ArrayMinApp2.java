package gr.aueb.cf.ch6;

public class ArrayMinApp2 {

    public static void main(String[] args) {
        int[] arr = {10, 45, 2, 5, 6, 9,};

        int minPosition = -1;
        int minValue = Integer.MAX_VALUE;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minPosition = i;
                minValue = arr[i];
            }
        }
        System.out.printf("Min value; %d, Min position: %d", minValue, (minPosition + 1));
    }
}
