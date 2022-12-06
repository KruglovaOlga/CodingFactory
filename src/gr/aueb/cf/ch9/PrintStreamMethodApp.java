package gr.aueb.cf.ch9;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintStreamMethodApp {

    public static void main(String[] args) {
        try(PrintStream ps = new PrintStream("C:/temp/text.txt")) {
            printMessage(ps,"hello all");
            printMessage(System.out, "eisaste oti na'nai");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void printMessage(PrintStream ps, String message) {
        ps.println(message);
    }
}
