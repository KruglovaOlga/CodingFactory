package gr.aueb.cf.ch9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Αντιγράφει ένα αρχείο βίντεο. Υπολογίζει το χρόνο αντιγραφής.
 *         * Χρησιμοποιεί FileInputStream kai FileOutputStream
 *         με buffer 8192 bytes.
 */

public class FileIOStreamVideo {

    public static void main(String[] args) {
        byte[] buffer = new byte[8192];
        int b = 0;
        int count = 0;

        try (FileInputStream fis = new FileInputStream("C:/Users/");
             FileOutputStream fos = new FileOutputStream("C:/Users/");) {

            while ((b = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, b);
                count += b;
            }

            System.out.printf("%,.0f KBytes were written\n", Math.ceil((double) count / 1024));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
