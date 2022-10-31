package gr.aueb.cf.ch3;

/**
 * εκτυπώνει 10 σειρές με 10 αστεράκι στην 1η σείρα
 * και mei;vnei σε καθε επόμενη σείρα, μέχρι 1
 */
public class StarsDescApp {

    public static void main(String[] args) {
        int i = 1;
        int j = 1;

        while (i <= 10) {
            j = 10; //j=i;
            while (j >= i) { //j<=10
                System.out.print("*");
                j--;
            }
            System.out.println();
            i++;
        }
    }
}

