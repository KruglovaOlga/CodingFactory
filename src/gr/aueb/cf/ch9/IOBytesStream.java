package gr.aueb.cf.ch9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Αντιγράφει ένα αρχείο εικόνας και ταυτόχρονα
 * υπολογίζει το μέγεθος του αρχείου που αντέγραψε.
 */
public class IOBytesStream {

    public static void main(String[] args) {
        try (FileInputStream in = new FileInputStream("C:/Users/");
        FileOutputStream out = new FileOutputStream("C:/Users/");) {
            int b, count = 0;
            while ((b = in.read()) != -1) { //η read() διαβάζει ένα byte τη φορά μέχρι να μη βρει τίποτα (-1)
                out.write(b);
                count++;
            }
            System.out.printf("Το αρχείο με μέγεθος %d Kbytes " +
                    "(%d bytes) αντιγράφηκε", count/1024, count);
        } catch (IOException e) {
            System.out.printf(e.getMessage());
        }
    }
}
