package gr.aueb.cf.ch6;

public class gradesPercentageApp {

    public static void main(String[] args) {
        int[] grades = {0,2,5,1,3,4,2,1,0,4,4,5,3,5};
        int[] counts = new int[6];

        for(int i = 0; i < grades.length; i++) {
            counts[grades[i]]++;
        }
        /*
        for (int grade : grades) {
            counts[grade]++;
        }*/

        for(int i = 0; i < counts.length; i++) {
            System.out.printf("Grade: %d, Percentage: %.2f%%\n", i, (double) counts[i]/grades.length);
        }
    }
}
