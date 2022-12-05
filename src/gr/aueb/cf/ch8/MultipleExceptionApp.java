package gr.aueb.cf.ch8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class MultipleExceptionApp {

    public static void main(String[] args) {
        File file = new File("C:\\tmp\\random.txt");
        try (Scanner in = new Scanner(file)) {
            int ch = System.in.read();
            int num = in.nextInt();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Exception: " + e);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
