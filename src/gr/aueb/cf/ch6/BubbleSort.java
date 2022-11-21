package gr.aueb.cf.ch6;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {3, 2, 8, 6, 4, 9, 10};
        bubbleSort(arr);
        printArray(arr);
    }

        public static void bubbleSort(int[] arr){
        for(int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap( arr,j, j+1);
                }
            }
        }
    }
    public static void swap(int[] arr, int i, int j) {
        int tmp;
        tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
    public static void printArray(int[] arr) {
        for(int item : arr) {

            System.out.print(item + " ");
        }
        System.out.println();
    }
}

