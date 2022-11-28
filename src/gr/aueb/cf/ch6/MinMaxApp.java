package gr.aueb.cf.ch6;

public class MinMaxApp {

    public static void main(String[] args) {

        int[] grades = {7, 5, 9, 10, 4, 6, 6, 7, 3, 8};
        int minPosition = 0;
        int maxPosition = 0;

        int minValue = grades[minPosition];
        int maxValue = grades[maxPosition];

        for (int i = 1; i < grades.length; i++) {
            if (grades[i] < minValue) {
                minPosition = i;
                minValue = grades[i];
            }

            if (grades[i] > maxValue) {
                maxPosition = i;
                maxValue = grades[i];
            }
        }

        System.out.printf("MinValue:  %d, MinPosition: %d\n", minValue, minPosition + 1);
        System.out.printf("MaxValue:  %d, MaxPosition: %d\n", maxValue, maxPosition + 1);

    }
}
