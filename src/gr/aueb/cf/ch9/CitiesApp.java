package gr.aueb.cf.ch9;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class CitiesApp {

    public CitiesApp() throws FileNotFoundException {
    }

    public static void main(String[] args) throws FileNotFoundException {
        String line;
        String[] cities = null;
        File dir = new File("C:/tmp/");

        if (!dir.exists()) {
            if(!dir.mkdirs()) {
                System.out.println("Error");
                System.exit(1);
            }
        }
    try( BufferedReader br = new BufferedReader(new FileReader("C:/t"))) {
            File grFile, deFile, usaFile;
            while ((line = br.readLine()) != null) {
                cities = line.split(" +");

                String country = cities[0];
                switch (country) {
                    case"Greece":
                        grFile = new File(dir + "/" + "gr.txt");
                        PrintStream gr = new PrintStream(grFile, StandardCharsets.UTF_8);
                        print(gr, "Gr Cities");
                        print (gr, cities);
                        break;
                    case"USA":
                        usaFile = new File(dir + "/" + "usa.txt");
                        PrintStream usa = new PrintStream(usaFile, StandardCharsets.UTF_8);
                        print(usa, "USA Cities");
                        print (usa, cities);
                        break;
                    case"Germany":
                        grFile = new File(dir + "/" + "de.txt");
                        PrintStream de = new PrintStream(grFile, StandardCharsets.UTF_8);
                        print(de, "Germany Cities");
                        print (de, cities);
                        break;
                    default:
                        System.out.println("Error in Countries");
                }
            }
    } catch (IOException e) {
        e.printStackTrace();
    }
    }
    public static void print(PrintStream ps, String[] tokens) {
        for (int i = 1; i < tokens.length; i++) {
            ps.print(tokens[i] + " ");
        }
    }

    public static void print(PrintStream ps, String message) {
        ps.println(message);
    }
}
