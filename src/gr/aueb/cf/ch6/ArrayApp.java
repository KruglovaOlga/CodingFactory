package gr.aueb.cf.ch6;

public class ArrayApp {

    public static void main(String[] args) {
        //Declaration
        int[] arr = new int[4];

        //Populate
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 13;
        arr[3] = 56;

        //Traverse (διασχίση)
        for (int i =0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for (int item : arr) {
            System.out.println(item);
        }
    }
}
