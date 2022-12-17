package gr.aueb.cf.ch9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Locale;
import java.util.Scanner;

/**
 * να διαβάσουμε ακέραιους αριθμούς όσο
 * υπάρχει επόμενος και να τους προσθέτουμε και να
 * βρίσκουμε τον μέσο όρο
 * • Στη συνέχεια να γράφουμε τον μέσο όρο σε
 * ένα αρχείο εξόδου intOut.txt
 */
public class IOIntDemo {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("C:/temp/intIn.txt"));
        PrintStream ps = new PrintStream("C:/temp/intOut.txt");
        String token;
        int num = 0, sum = 0, count = 0;
        double average = 0.0;

        /*
        Μέσα σε μια do-while διαβάζουμε όσο υπάρχει token
        Κάθε φορά που διαβάζουμε ένα String, ελέγχουμε αν είναι ακέραιος
        με την isInt() και αν είναι τότε αυξάνουμε τον μετρητή i κατά 1
        και επίσης αθροίζουμε στο sum
         */
        while (sc.hasNext()) {
            token = sc.next();
            if(isInt(token)) {
                num = Integer.parseInt(token);
                count++;
                sum += num;
            }
        }

        /**
         * Κάνουμε casting το sum σε double και όλη η παράσταση γίνεται double γιατί
         * διαφορετικά το αποτέλεσμα θα είναι int.
         * • Επίσης, χρησιμοποιούμε Locale US ώστε η υποδιαστολή να είναι η τελεία
         * διαφορετικά το default Locale ήταν el_GR και η υποδιαστολή θα ήταν το κόμμα
         */
        average = (double) sum / count;
        ps.printf("Το άθροισμα είναι %d%n", sum);
        ps.printf(Locale.ENGLISH, "Ο μέσος όρος είναι %.2f", average);

        sc.close();
        ps.close();
    }

    //Ελέγχει αν ένα String είναι ακέραιος
    public static boolean isInt(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
