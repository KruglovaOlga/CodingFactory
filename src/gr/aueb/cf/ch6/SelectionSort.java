package gr.aueb.cf.ch6;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {0,2,5,1,3,4,2,1,0,4,4,5,3,5};
        int min = 0;
        int minPosition = 0;


        for(int i = 0; i < arr.length; i++) {

            minPosition = i;
            min = arr[minPosition];

            for(int j = i; j < arr.length; j++) {
                if (arr[j] < min) {
                    minPosition = j;
                    min = arr[j];
                }
            }
            swap(arr, i , minPosition);
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

                System.out.println(item + " ");
            }
            System.out.println();
        }
    }

