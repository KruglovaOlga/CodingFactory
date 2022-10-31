package gr.aueb.cf.ch3;

/**
 * Δείχνει τα break and continue
 */
public class BreakAndContinueApp {

    public static void main(String[] args) {
        int i = 1;
        int result = 0;

        while (i <= 10) {
            i++;
            if (i == 5) {
                break;
            }
        }

        while (i <= 10) {
            i++;
            if (i == 5) continue;
            result = result + i;
        }
    }

}
