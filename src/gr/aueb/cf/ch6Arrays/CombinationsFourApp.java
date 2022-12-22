package gr.aueb.cf.ch6Arrays;
// ne rabotaet, dymai dalshe
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class CombinationsFourApp {

    public static void main(String[] args) throws IOException {
        final int THRESHOLD = 3;
        final int N = 4;
        //File inFile = new File("C:/../numbers.txt");
       // File outFile = new File("C:/../numbers1.txt");

        //Scanner in = new Scanner(inFile);
        Scanner in = new Scanner(System.in);
        //PrintStream ps = new PrintStream(outFile, StandardCharsets.UTF_8);
        int[] row = new int[4];
        ArrayList<Integer> numbers = new ArrayList<>();

        while (in.hasNext()) {
            numbers.add(in.nextInt());
        }
        for (int i = 0; i<= numbers.size() - N; i++) {
            for (int j = i + 1; j <= numbers.size() - N +1; j++) {
                for (int k = j + 1; k <= numbers.size() - N +2; k++) {
                    for (int n = k + 1; n < numbers.size(); n++) {
                        row[0] = numbers.get(i);
                        row[1] = numbers.get(j);
                        row[2] = numbers.get(k);
                        row[3] = numbers.get(n);

                        if (!isEven(row, THRESHOLD)) {

                            //ps.printf("%d\t%d\t%d\t%d\n", row[0], row[1], row[2],row[3]);
                            System.out.printf("%d\t%d\t%d\t%d\n", row[0], row[1], row[2], row[3]);
                        }
                    }
                }
            }

        }// ps.close();
    }

    public static boolean isEven(int[] row, int threshhold) {
        int count = 0;

        for (int num : row) {
            if (num % 2 == 0) count++;
        }
        return count > threshhold;
    }
}
