package gr.aueb.cf.ch9;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * Αντιγράφει ένα αρχείο βίντεο. Υπολογίζει το χρόνο αντιγραφής.
 * Χρησιμοποιεί FileInputStream kai FileOutputStream διαβάζοντας
 * και γράφοντας ένα byte τη φορά.
 */
public class IOVideoCopy {

    public static void main(String[] args) throws java.io.IOException {
        int b, count = 0;

        try (FileInputStream in = new FileInputStream("C:/Users/");
             FileOutputStream out = new FileOutputStream("C:/Users/");) {
            long start = System.nanoTime();
            //Αντέγραψε το αρχείο
            while ((b = in.read()) != -1) {
                out.write(b);
                count++;
            }
            long end = System.nanoTime();
            long elapsed = end - start;

            System.out.printf("Το αρχείο με μέγεθος %d Kbytes " +
                    "(%d bytes) αντιγράφηκε", count / 1024, count);
            System.out.printf("Time: %.2f", elapsed / 1_000_000_000.0); //χρόνος εμφανίζεται σε sec
        }
    }
}
