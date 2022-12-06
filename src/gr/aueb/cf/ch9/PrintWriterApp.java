package gr.aueb.cf.ch9;

import java.io.FileNotFoundException;

import java.io.PrintWriter;

public class PrintWriterApp {

    public static void main(String[] args) {
        try(PrintWriter pw = new PrintWriter("C:/temp/text.txt")) {
            pw.println("Hello again");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
