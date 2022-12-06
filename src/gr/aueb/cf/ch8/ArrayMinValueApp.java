package gr.aueb.cf.ch8;

public class ArrayMinValueApp {
    public static void main(String[] args) {

    }

    public static int caller() {
        int[] arr = {1, 2, 3};

        //return getMinPosition(arr)
        return getPosition(arr, 6);

    }
    public static int getMinPosition(int[] arr) {
        if (arr == null) {
            return -1;
        }

        int minPosition = 0;
        int minValue = arr[minPosition];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
                minPosition = i;
            }
        }return minPosition;
    }
    public static int getPosition(int[] arr, int value) {
        if(arr == null) return -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }return -1;
    }
}
