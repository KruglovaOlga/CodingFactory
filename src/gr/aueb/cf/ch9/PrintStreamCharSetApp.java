package gr.aueb.cf.ch9;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

import java.nio.charset.StandardCharsets;

/**
 * PrintStream with charset
 */
public class PrintStreamCharSetApp {

    public static void main(String[] args) {
        try(PrintStream ps = new PrintStream("C:/temp/text.txt", StandardCharsets.UTF_8)) {
            ps.println("Hello again");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
