package gr.aueb.cf.ch6Arrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ArrayPopulateFromFile {

    public static void main(String[] args) throws FileNotFoundException {
        int[] ages = new int[5];
        File intFd = new File("C:/myIntFile.txt");
        Scanner in = new Scanner(intFd);

        for (int i = 0; i < ages.length; i++) {
            ages[i] = in.nextInt();
        }

        for (int age : ages) {
            System.out.println(age + " ");
        }
        in.close();
    }
}
