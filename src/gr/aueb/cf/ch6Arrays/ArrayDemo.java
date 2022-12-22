package gr.aueb.cf.ch6Arrays;

public class ArrayDemo {

    public static void main(String[] args) {
        int[] ages = {23, 45, 67, 31};

        printArray(ages);
    }

    public static void printArray (int[] arr) {
//        for(int i = 0; i < arr.length;i++) {
//            System.out.print(arr[i] + " ");
//        }
        for (int item : arr) {
            System.out.print(item + " ");
        }
    }

    public static void printArray(int[] arr, int low, int high) {
        if((low < 0) || (high > arr.length - 1) || (high < low)) {
            System.out.println("Error");
            return;
        }
        for (int i = low; i <= high; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
