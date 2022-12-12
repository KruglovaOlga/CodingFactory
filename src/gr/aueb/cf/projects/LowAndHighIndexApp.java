package gr.aueb.cf.projects;

public class LowAndHighIndexApp {

    public static void main(String[] args) {

    }

    public static int[] getLowAndHighIndexOf(int[] arr, int key) {
        int low = 0, high = 0, pivot;
        boolean found = false;

        if (arr == null) return new int[] {};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                low = i;
                found = true;
                break;
            }
        }

        if (!found) return new int[] {};

        high = low;
        pivot = low + 1;

        while ((pivot < arr.length) && (arr[pivot++] == key)) {
            high++;
        }
        return new int[] {low, high};
    }
}
