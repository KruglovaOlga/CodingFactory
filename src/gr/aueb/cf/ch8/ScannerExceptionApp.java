package gr.aueb.cf.ch8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerExceptionApp {

    public static void main(String[] args) {
        try (Scanner in = getFileDescriptor("C:/tmp/random.txt")){
            String s = in.nextLine();
            System.out.println(s);

        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Scanner getFileDescriptor(String file) throws FileNotFoundException {
        File fd = new File(file);
        try {
            return new Scanner(fd);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw e;
        }
    }
}
