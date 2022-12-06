package gr.aueb.cf.ch8;

import java.io.IOException;

public class ReadCharApp {

    public static void main(String[] args) {
        char ch;
        try {
            ch = readChar();
            System.out.println(ch);
        } catch (IOException e) {
            System.out.println("Error : IO char read");
        }
    }

    public static char readChar() throws IOException {
        try {
            return (char) System.in.read();
        } catch (IOException e) {
            e.printStackTrace(); //logging
                                    //restore state
            throw e;                //rethrow
        }
    }
}
