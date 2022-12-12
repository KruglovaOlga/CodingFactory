package gr.aueb.cf.projects;

import java.util.Arrays;
import java.util.Comparator;

public class MaxCarCh6App {

    public static void main(String[] args) {
        int[][] arr = {{1012, 1136}, {1022, 1126},{1317,1417},{1015,1025},{1013,1418}};
        int[][] transformed = transformArray(arr);

        sortByTime(transformed);

        for (int[] row : transformed) {
            System.out.print(row[0] + " ");
            System.out.println(row[1]);
        }
        System.out.println("Max Arrivals: " + getMaxOnes(transformed));
    }

    public static int[][] transformArray(int[][] arr) {
        int[][] transformed = new int[arr.length * 2][2];

        for (int i = 0; i < arr.length; i++) {
            transformed[i * 2][0] = arr[i][0];
            transformed[i * 2][1] = 1;
            transformed[i * 2 + 1][0] = arr[i][1];
            transformed[i * 2 + 1][1] = 0;
        }
        return transformed;
    }

    public static void sortByTime(int[][] arr) {
        Arrays.sort(arr, Comparator.comparing((int[] a) -> a[0]));
    }

    public static int getMaxOnes(int[][] arr) {
        int times = 0;
        int maxTimes = 0;
        int i = 0;

        while (i < arr.length) {
            times = 0;

            while ((i < arr.length) && (arr[i++][1] == 1)) {
                times++;
            }
            if (times > maxTimes) maxTimes = times;
        }
        return maxTimes;
    }
}
