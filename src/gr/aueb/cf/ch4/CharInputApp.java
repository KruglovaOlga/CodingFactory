package gr.aueb.cf.ch4;

import java.io.IOException;

/**
 * Char input by using System.in.read()
 * read returns int
 */
public class CharInputApp {

    public static void main(String[] args)throws IOException {
    char inputChar = ' ';

        System.out.println("insert an ASCII-based char");
        inputChar = (char)System.in.read();

        System.out.println("char " + inputChar);
    }




}
