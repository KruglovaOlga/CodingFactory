package gr.aueb.cf.ch3;

/**
 * εκτυπώνει 10 σειρές με 1 αστεράκι στην 1η σείρα
 * και αυξανει σε καθε επόμενη σείρα, μέχρι 10
 */
public class StarsAscApp {

    public static void main(String[] args) {
        int i = 1;
        int j = 1;

        while (i <= 10) {
            j = 1;
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}

