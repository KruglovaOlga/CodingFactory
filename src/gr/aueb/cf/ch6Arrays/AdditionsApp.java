package gr.aueb.cf.ch6Arrays;

public class AdditionsApp {

    public static void main(String[] args) {
        int[] arr = {1, 9, 9};
        int[] arr2 = {1, 9, 9};
        int[] arrOut = addOne(arr);
        int[] arrOut2 = addTwoInts(arr, arr2);


        for (int num : arrOut) {
            System.out.println(num + " ");
        }

        for (int num : arrOut2) {
            System.out.println(num + " ");
        }

    }

    /**
     * Adds one to the represented by the source array.
     * @param arr     the source array
     * @return          the output array after adding one
     */
    public static int[] addOne(int[] arr) {
        int[] arrOut;
        int carry = 1;
        int currentSum = 0;

        if (arr == null) throw new IllegalArgumentException("Arr is null");
        arrOut = new int [arr.length + 1];

        for (int i = arr.length - 1; i >= 0; i--) {
            currentSum = arr[i] + carry;
            arrOut[i + 1] = currentSum % 10;
            carry = currentSum / 10;
        }
        arrOut[0] = carry;
        return arrOut;
    }

    public static int[] addTwoInts (int[] arr, int[] arr2) {
        int[] arrOut;
        int carry = 0;
        int currentSum = 0;

        if ((arr == null) || (arr2 == null) || (arr.length != arr2.length))
            throw new IllegalArgumentException("Arr is null");
        arrOut = new int [arr.length + 1];

        for (int i = arr.length - 1; i >= 0; i--) {
            currentSum = arr[i] + arr2[i] + carry;
            arrOut[i + 1] = currentSum % 10;
            carry = currentSum / 10;
        }
        arrOut[0] = carry;
        return arrOut;
    }
}
