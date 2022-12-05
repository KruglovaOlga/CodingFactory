package gr.aueb.cf.ch8;

import java.io.IOException;

public class TrowsVsTryCatchApp {

    public static void main(String[] args) throws IOException {
        try {
            char ch = getChar();
        }catch (IOException e) {
            System.out.println("IO Error");
        }
    }

    public static char getChar() throws IOException {
        try {
            return (char) System.in.read();

        }catch (IOException e) {
            e.printStackTrace();        //log
                                        //recover state
            throw e;                    //rethrow
        }
    }
}
