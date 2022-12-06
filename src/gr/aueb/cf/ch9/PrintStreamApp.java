package gr.aueb.cf.ch9;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintStreamApp {

    public static void main(String[] args) {
    try (PrintStream ps = new PrintStream("C:/tmp/file.txt");) {
        ps.println("hello coding factory");
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }

    }
}
