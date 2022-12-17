package gr.aueb.cf.ch9;

import java.io.*;

public class BufferedIODemo {

    public static void main(String[] args) {
        byte[] buffer = new byte[8192];
        int b = 0;
        int count = 0;

        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:/Users/"));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:/Users/"));) {

            while ((b = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, b);
                count += b;
            }

            System.out.printf("%,.0f KBytes were written\n", Math.ceil((double) count / 1024));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
