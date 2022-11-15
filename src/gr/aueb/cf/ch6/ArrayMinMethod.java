package gr.aueb.cf.ch6;

public class ArrayMinMethod {

    public static void main(String[] args) {
        int[] ages = new int[] {21, 54,84, 42, 53};
        int minPosition = 0;

        minPosition = getMinPosition(ages, 1, ages.length - 1);
        System.out.printf("MinValue = %d, MinPosition = %d",ages[minPosition], (minPosition + 1));

        }


    public static int getMinPosition(int[] arr, int low, int high) {
        int minPosition = low;
        int minValue = arr[low];

        if (arr == null) return -1;
        if (low > high) return -1;

        if ((low < 0) || (high > arr.length - 1)) {
            System.out.println("Error in array dimentions");
            return  -1;
        }

        for (int i = low + 1 ; i < high; i++) {
            if (arr[i] < minValue) {
                minPosition = i;
                minValue = arr[i];
            }
        }
        return minPosition;
    }
}
